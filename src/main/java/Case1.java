import entity.DuplicateCharacter;


import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Fio
 * @Date: 8/29/2023 10:53 PM
 */
public class Case1 {

//    public static void main(String[] args) {
//        try {
//            String inputStr = "aabcccbbad";
//            System.out.println("Input：" + inputStr);
//
//            String outputStr = cyclicReplacement(inputStr);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    /**
     * Replace strings that match attributes in a loop
     *
     * @param inputString
     * @return
     */
    public static String cyclicReplacement(String inputString) {
        String outputString;
        String tempString = new String(inputString);

        while (true) {
            outputString = replaceConsecutiveCharacters(tempString);
            var result = tempString.compareTo(outputString);
            if (result == 0) {
                //There are no matching attributes
                break;
            } else {
                tempString = new String(outputString);
            }
        }
        return outputString;
    }


    /**
     * Replace strings more than 3 identical characters
     *
     * @param sourceString
     * @return
     */
    private static String replaceConsecutiveCharacters(String sourceString) {
        StringBuffer returnString = new StringBuffer(sourceString);

        try {
            // Use regular expressions to find strings that are more than 3 identical characters
            var regex = "([a-z])\\1\\1{1,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sourceString);

            // Get private properties through reflection
            Class<?> matcherClass = Matcher.class;
            Field firstField = matcherClass.getDeclaredField("first");
            firstField.setAccessible(true);
            Field lastField = matcherClass.getDeclaredField("last");
            lastField.setAccessible(true);

            // Record consecutive character positions
            List<DuplicateCharacter> list = new ArrayList<>();
            while (matcher.find()) {
                String matchedString = matcher.group();
                // System.out.println("Matched String：" + matchedString);
                var character = matchedString.substring(0, 1);

                var first = (int) firstField.get(matcher);
                var last = (int) lastField.get(matcher);

                DuplicateCharacter duplicateCharacter = new DuplicateCharacter(character, first, last);
                list.add(duplicateCharacter);
            }

            // Replace consecutive characters
            var postion = 0;
            var start = 0;
            for (DuplicateCharacter item : list) {
                if (postion == 0) {
                    postion = item.getFirst();
                    start = postion;
                } else {
                    start = item.getFirst() + postion;
                }
                var end = start + item.getLength();

                String replaceString = "";

                returnString = returnString.replace(start, end, replaceString);
                postion = postion - item.getLength() + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("->" + returnString);

        return returnString.toString();
    }


}




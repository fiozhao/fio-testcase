import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Fio
 * @Date: 8/31/2023 1:01 AM
 */
public class Case2Test {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void Case2Test1() throws NoSuchFieldException, IllegalAccessException {

        String outputStr = Case2.cyclicReplacement("abcccbad");
        assertEquals(outputStr.toString(),"d");
    }

    @Test
    public void Case2Test2() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case2.cyclicReplacement("aaabcccbb11aaaaddddd222aacccdd");
        assertEquals(outputStr.toString(),"bcbb11adc2aaccb");
    }

    @Test
    public void Case2Test3() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case2.cyclicReplacement("");
        assertEquals(outputStr.toString(),"");
    }

    @Test
    public void Case2Test4() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case2.cyclicReplacement("zzzz");
        assertEquals(outputStr.toString(),"y");
    }

    @Test
    public void Case2Test5() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case2.cyclicReplacement("aaaaaaa");
        assertEquals(outputStr.toString(),"");
    }

    @After
    public void tearDown() throws Exception {
    }
}

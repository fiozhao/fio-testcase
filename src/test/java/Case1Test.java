import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Fio
 * @Date: 8/31/2023 12:22 AM
 */
public class Case1Test {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void Case1Test1() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case1.cyclicReplacement("aabcccbbad");
        assertEquals(outputStr.toString(),"d");
    }

    @Test
    public void Case1Test2() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case1.cyclicReplacement("aaabcccbb11aaaaddddd222aacccdd");
        assertEquals(outputStr.toString(),"bcb11aadaad");
    }

    @Test
    public void Case1Test3() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case1.cyclicReplacement("");
        assertEquals(outputStr.toString(),"");
    }

    @Test
    public void Case1Test4() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case1.cyclicReplacement("zzzz");
        assertEquals(outputStr.toString(),"");
    }

    @Test
    public void Case1Test5() throws NoSuchFieldException, IllegalAccessException {
        String outputStr = Case1.cyclicReplacement("aaaaaaa");
        assertEquals(outputStr.toString(),"");
    }

    @After
    public void tearDown() throws Exception {
    }
}

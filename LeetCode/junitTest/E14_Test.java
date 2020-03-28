import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E14_Test {
    E14_Longest_Common_Prefix e14;
    String[] s1, s2, s3, s4, s5, s6, s7;

    @BeforeEach
    public void init() {
        e14 = new E14_Longest_Common_Prefix();
        s1 = new String[] { "aaa", "aaaa", "aaaaa", "aaaaaa" };
        s2 = new String[] { "aaa", "abc", "bca", "aaa" };
        s3 = new String[] { "", "", "a" };
        s4 = new String[] { "abcdef", "abcd", "abcdefa", "abcde" };
        s5 = new String[] {};
        s6 = new String[] { "aaa" };
        s7 = null;
    }

    @Test
    public void E14_test1() {
        String expected = "aaa";
        String actual = e14.longestCommonPrefix(s1);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test2() {
        String expected = "";
        String actual = e14.longestCommonPrefix(s2);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test3() {
        String expected = "";
        String actual = e14.longestCommonPrefix(s3);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test4() {
        String expected = "abcd";
        String actual = e14.longestCommonPrefix(s4);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test5() {
        String expected = "";
        String actual = e14.longestCommonPrefix(s5);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test6() {
        String expected = "aaa";
        String actual = e14.longestCommonPrefix(s6);
        assertEquals(expected, actual);
    }

    @Test
    public void E14_test7() {
        String expected = "";
        String actual = e14.longestCommonPrefix(s7);
        assertEquals(expected, actual);
    }
}
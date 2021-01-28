import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class M1143_Text {

    M1143_Longest_Common_Subsequence m1143;
    
    @BeforeEach
    public void init() {
        m1143 = new M1143_Longest_Common_Subsequence();
    }

    @Test
    public void M1143_Test1() {
        String text1 = "abcde";
        String text2 = "be";

        int expected = 2;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    public void M1143_Test2() {
        String text1 = "be";
        String text2 = "abcde";

        int expected = 2;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    public void M1143_Test3() {
        String text1 = "abc";
        String text2 = "defgh";

        int expected = 0;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    public void M1143_Test4() {
        String text1 = "aaab";
        String text2 = "baa";

        int expected = 2;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    public void M1143_Test5() {
        String text1 = "abba";
        String text2 = "baab";

        int expected = 2;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }

    @Test
    public void M1143_Test6() {
        String text1 = "aaabaa";
        String text2 = "baa";

        int expected = 3;
        int actual = m1143.longestCommonSubsequence(text1, text2);

        assertEquals(expected, actual);
    }
}

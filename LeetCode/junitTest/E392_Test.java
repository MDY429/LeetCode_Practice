import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E392_Test {
    
    E392_Is_Subsequence e392 = new E392_Is_Subsequence();

    @Test
    public void E392_test1() {
        String s = "AQYK";
        String t = "ASFDQWERTYIUGHK";
        assertTrue(e392.isSubsequence(s, t));
    }

    @Test
    public void E392_test2() {
        String s = "ABCD";
        String t = "ABCD";
        assertTrue(e392.isSubsequence(s, t));
    }

    @Test
    public void E392_test3() {
        String s = "ABCDE";
        String t = "abcdefghi";
        assertFalse(e392.isSubsequence(s, t));
    }

    @Test
    public void E392_test4() {
        String s = "";
        String t = "abcdefghi";
        assertTrue(e392.isSubsequence(s, t));
    }

    @Test
    public void E392_test5() {
        String s = "MNB";
        String t = "ZXCVBNM";
        assertFalse(e392.isSubsequence(s, t));
    }

    @Test
    public void E392_test6() {
        String s = "MNB";
        String t = "";
        assertFalse(e392.isSubsequence(s, t));
    }
    
}
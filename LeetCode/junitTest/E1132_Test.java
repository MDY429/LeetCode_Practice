import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1132_Test {
    
    E1132_Remove_Palindromic_Subsequences e1132 = new E1132_Remove_Palindromic_Subsequences();

    @Test
    public void E1132_test1() {
        String s = "aa";
        int expected = 1;
        int actual = e1132.removePalindromeSub(s);

        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test2() {
        String s = "a";
        int expected = 1;
        int actual = e1132.removePalindromeSub(s);

        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test3() {
        String s = "ab";
        int expected = 2;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test4() {
        String s = "abba";
        int expected = 1;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test5() {
        String s = "abbba";
        int expected = 1;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test6() {
        String s = "aabb";
        int expected = 2;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test7() {
        String s = "ababba";
        int expected = 2;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E1132_test8() {
        String s = "";
        int expected = 0;
        int actual = e1132.removePalindromeSub(s);
        
        assertEquals(expected, actual);
    }
}
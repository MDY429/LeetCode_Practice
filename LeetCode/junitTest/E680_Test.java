import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E680_Test {
    
    E680_Valid_Palindrome_II e680 = new E680_Valid_Palindrome_II();

    @Test
    public void test1() {
        String s = "a";
        assertTrue(e680.validPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "abca";
        assertTrue(e680.validPalindrome(s));
    }

    @Test
    public void test3() {
        String s = "abccbab";
        assertTrue(e680.validPalindrome(s));
    }

    @Test
    public void test4() {
        String s = "abbbdcde";
        assertFalse(e680.validPalindrome(s));
    }

    @Test
    public void test5() {
        String s = "qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdsapoiuytrewq";
        assertTrue(e680.validPalindrome(s));
    }

    @Test
    public void test6() {
        String s = "";
        assertTrue(e680.validPalindrome(s));
    }
}
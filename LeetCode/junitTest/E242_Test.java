import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E242_Test {
    
    E242_Valid_Anagram e242 = new E242_Valid_Anagram();

    @Test
    public void E242_test1() {
        String s = "dog";
        String t = "god";
        assertTrue(e242.isAnagram(s, t));
    }

    @Test
    public void E242_test2() {
        String s = "abcde";
        String t = "ebcda";
        assertTrue(e242.isAnagram(s, t));
    }

    @Test
    public void E242_test3() {
        String s = "aab";
        String t = "aaa";
        assertFalse(e242.isAnagram(s, t));
    }

    @Test
    public void E242_test4() {
        String s = "aabb";
        String t = "aaa";
        assertFalse(e242.isAnagram(s, t));
    }
}
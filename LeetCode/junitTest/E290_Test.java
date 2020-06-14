import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E290_Test {
    
    E290_Word_Pattern e290 = new E290_Word_Pattern();

    @Test
    public void E290_test1() {
        String pattern = "abba";
        String str = "fog dog dog fog";
        assertTrue(e290.wordPattern(pattern, str));
    }

    @Test
    public void E290_test2() {
        String pattern = "abba";
        String str = "fog dog dog dog";
        assertFalse(e290.wordPattern(pattern, str));
    }

    @Test
    public void E290_test3() {
        String pattern = "aaaa";
        String str = "dog dog dog dog";
        assertTrue(e290.wordPattern(pattern, str));
    }

    @Test
    public void E290_test4() {
        String pattern = "abba";
        String str = "dog dog dog dog";
        assertFalse(e290.wordPattern(pattern, str));
    }

    @Test
    public void E290_test5() {
        String pattern = "abba";
        String str = "dog cat cate dog";
        assertFalse(e290.wordPattern(pattern, str));
    }

    @Test
    public void E290_test6() {
        String pattern = "aaaa";
        String str = "dog dog cat dog";
        assertFalse(e290.wordPattern(pattern, str));
    }
}
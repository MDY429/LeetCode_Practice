import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1071_Test {
    
    E1071_Greatest_Common_Divisor_of_Strings e1071 = new E1071_Greatest_Common_Divisor_of_Strings();

    @Test
    public void E1071_test1() {
        String str1 = "ABAB";
        String str2 = "ABAB";
        String expected = "ABAB";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void E1071_test2() {
        String str1 = "ABAB";
        String str2 = "ABAB";
        String expected = "ABAB";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void E1071_test3() {
        String str1 = "ABAB";
        String str2 = "ABABAB";
        String expected = "AB";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void E1071_test4() {
        String str1 = "ABC";
        String str2 = "ABABAB";
        String expected = "";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void E1071_test5() {
        String str1 = "CODE";
        String str2 = "LEET";
        String expected = "";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void E1071_test6() {
        String str1 = "ABCABCABCABCABC";
        String str2 = "ABCABC";
        String expected = "ABC";
        String actual = e1071.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }
}
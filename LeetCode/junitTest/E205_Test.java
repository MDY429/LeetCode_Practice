import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E205_Test {
    
    E205_Isomorphic_Strings e205 = new E205_Isomorphic_Strings();

    @Test
    public void E205_test1() {
        String s = "add";
        String t = "egg";
        assertTrue(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test2() {
        String s = "adda";
        String t = "egge";
        assertTrue(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test3() {
        String s = "abc";
        String t = "abb";
        assertFalse(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test4() {
        String s = "abcd";
        String t = "qwer";
        assertTrue(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test6() {
        String s = "Add";
        String t = "Egg";
        assertTrue(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test7() {
        String s = "elect";
        String t = "paper";
        assertTrue(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test8() {
        String s = "string";
        String t = "aabbcc";
        assertFalse(e205.isIsomorphic(s, t));
    }

    @Test
    public void E205_test9() {
        String s = "Add";
        String t = "egg";
        assertTrue(e205.isIsomorphic(s, t));
    }
}
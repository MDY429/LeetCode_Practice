import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M678_Test {
    
    M678_Valid_Parenthesis_String m678 = new M678_Valid_Parenthesis_String();

    @Test
    public void M678_test1() {
        String s = "(*))";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test2() {
        String s = "(******)";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test3() {
        String s = "()()";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test4() {
        String s = "****)";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test5() {
        String s = "(*****";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test6() {
        String s = ")(";
        assertFalse(m678.checkValidString(s));
    }

    @Test
    public void M678_test7() {
        String s = "()*)";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test8() {
        String s = "*";
        assertTrue(m678.checkValidString(s));
    }

    @Test
    public void M678_test9() {
        String s = "";
        assertTrue(m678.checkValidString(s));
    }
}
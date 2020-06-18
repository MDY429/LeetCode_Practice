import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E383_Test {
    
    E383_Ransom_Note e383 = new E383_Ransom_Note();

    @Test
    public void E383_test1() {
        String ransomNote = "aa";
        String magazine = "aba";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test2() {
        String ransomNote = "aa";
        String magazine = "abc";
        assertFalse(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test3() {
        String ransomNote = "apple";
        String magazine = "apple";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test4() {
        String ransomNote = "apple";
        String magazine = "elppa";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test5() {
        String ransomNote = "abcdef";
        String magazine = "bcadfe";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test6() {
        String ransomNote = "";
        String magazine = "aba";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test7() {
        String ransomNote = "aa";
        String magazine = "";
        assertFalse(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test8() {
        String ransomNote = "";
        String magazine = "";
        assertTrue(e383.canConstruct(ransomNote, magazine));
    }

    @Test
    public void E383_test9() {
        String ransomNote = "aa";
        String magazine = "bb";
        assertFalse(e383.canConstruct(ransomNote, magazine));
    }
}
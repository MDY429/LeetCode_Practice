import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify. The permutation could be different.
 * 
 * @author MDY
 */
public class E819_Test {

    E819_Most_Common_Word e819 = new E819_Most_Common_Word();

    @Test
    public void E819_test1() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[] { "hit" };
        String expected = "ball";
        String actual = e819.mostCommonWord(paragraph, banned);
        assertEquals(expected, actual);
    }

    @Test
    public void E819_test2() {
        String paragraph = "WHAT!!! WHat happened? what are you talking about? Are u kidding?";
        String[] banned = new String[] { "what" };
        String expected = "are";
        String actual = e819.mostCommonWord(paragraph, banned);
        assertEquals(expected, actual);
    }

    @Test
    public void E819_test3() {
        String paragraph = "HAHAHa....ha..ha ha ha, hahaha hahaha.";
        String[] banned = new String[] { "aaa", "bbb", "hahaha" };
        String expected = "ha";
        String actual = e819.mostCommonWord(paragraph, banned);
        assertEquals(expected, actual);
    }
}
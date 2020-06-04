import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M926_Test {
   
    M926_Flip_String_to_Monotone_Increasing m926 = new M926_Flip_String_to_Monotone_Increasing();

    @Test
    public void M926_test1() {
        String S = "00111";
        int expected = 0;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

    @Test
    public void M926_test2() {
        String S = "00101";
        int expected = 1;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

    @Test
    public void M926_test3() {
        String S = "10111";
        int expected = 1;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

    @Test
    public void M926_test4() {
        String S = "00100";
        int expected = 1;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

    @Test
    public void M926_test5() {
        String S = "1";
        int expected = 0;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

    @Test
    public void M926_test6() {
        String S = "0101010101";
        int expected = 4;
        int actual = m926.minFlipsMonoIncr(S);
        assertEquals(expected, actual);
    }

}
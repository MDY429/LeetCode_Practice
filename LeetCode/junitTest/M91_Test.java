import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M91_Test {
    
    M91_Decode_Ways m91 = new M91_Decode_Ways();

    @Test
    public void M91_test1() {
        String s = "216";
        int expected = 3;
        int actual = m91.numDecodings(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M91_test2() {
        String s = "19";
        int expected = 2;
        int actual = m91.numDecodings(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M91_test3() {
        String s = "10";
        int expected = 1;
        int actual = m91.numDecodings(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M91_test4() {
        String s = "3023";
        int expected = 0;
        int actual = m91.numDecodings(s);

        assertEquals(expected, actual);
    }
}
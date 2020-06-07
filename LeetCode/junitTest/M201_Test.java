import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M201_Test {
    
    M201_Bitwise_AND_of_Numbers_Range m201 = new M201_Bitwise_AND_of_Numbers_Range();

    @Test
    public void M201_test1() {
        int m = 0;
        int n = 10;
        int expected = 0;
        int actual = m201.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M201_test2() {
        int m = 13;
        int n = 15;
        int expected = 12;
        int actual = m201.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M201_test3() {
        int m = 7;
        int n = 15;
        int expected = 0;
        int actual = m201.rangeBitwiseAnd(m, n);
        assertEquals(expected, actual);
    }
}
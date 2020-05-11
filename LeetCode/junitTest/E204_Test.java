import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E204_Test {
    
    E204_Count_Primes e204 = new E204_Count_Primes();

    @Test
    public void E204_test1() {
        int n = 10;
        int expected = 4;
        int actual = e204.countPrimes(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E204_test2() {
        int n = 1;
        int expected = 0;
        int actual = e204.countPrimes(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E204_test3() {
        int n = 120;
        int expected = 30;
        int actual = e204.countPrimes(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E204_test4() {
        int n = 499979;
        int expected = 41537;
        int actual = e204.countPrimes(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E204_test5() {
        int n = 2;
        int expected = 0;
        int actual = e204.countPrimes(n);
        assertEquals(expected, actual);
    }
}
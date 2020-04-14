import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M62_Test {

    M62_Unique_Paths m62 = new M62_Unique_Paths();

    @Test
    public void M62_test1() {
        int expected = 3;
        int m = 3;
        int n = 2;
        int actual = m62.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M62_test2() {
        int expected = 10;
        int m = 4;
        int n = 3;
        int actual = m62.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M62_test3() {
        int expected = 28;
        int m = 3;
        int n = 7;
        int actual = m62.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M62_test4() {
        int expected = 1;
        int m = 1;
        int n = 3;
        int actual = m62.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    public void M62_test5() {
        int expected = 0;
        int m = 0;
        int n = 2;
        int actual = m62.uniquePaths(m, n);
        assertEquals(expected, actual);
    }
}
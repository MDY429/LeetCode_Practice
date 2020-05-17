import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E278_Test {
    E278_First_Bad_Version e278;

    @Test
    public void E278_test1() {
        e278 = new E278_First_Bad_Version(3);
        int n = 3;
        int expected = 3;
        int actual = e278.firstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E278_test2() {
        e278 = new E278_First_Bad_Version(10);
        int n = 100000;
        int expected = 10;
        int actual = e278.firstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E278_test3() {
        e278 = new E278_First_Bad_Version(99999);
        int n = 100000;
        int expected = 99999;
        int actual = e278.firstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E278_test4() {
        e278 = new E278_First_Bad_Version(2795);
        int n = 100000;
        int expected = 2795;
        int actual = e278.firstBadVersion(n);
        assertEquals(expected, actual);
    }
}
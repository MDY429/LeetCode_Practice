import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E268_Test {
    E268_Missing_Number e268;
    int[] n1, n2, n3, n4;

    @BeforeEach
    public void init() {
        e268 = new E268_Missing_Number();

        n1 = new int[] { 1, 3, 5, 0, 7, 8, 9, 10, 4, 2 };

        n2 = new int[] { 0 };

        n3 = new int[] {};

        n4 = new int[] { 1, 3, 5, 0, 7, 8, 9, 6, 4, 2 };

    }

    @Test
    public void E268_test1() {
        int expected = 6;
        int actual = e268.missingNumber(n1);
        assertEquals(expected, actual);

        int actual2 = e268.missingNumber_bit(n1);
        assertEquals(expected, actual2);
    }

    @Test
    public void E268_test2() {
        int expected = 1;
        int actual = e268.missingNumber(n2);
        assertEquals(expected, actual);

        int actual2 = e268.missingNumber_bit(n2);
        assertEquals(expected, actual2);
    }

    @Test
    public void E268_test3() {
        int expected = 0;
        int actual = e268.missingNumber(n3);
        assertEquals(expected, actual);

        int actual2 = e268.missingNumber_bit(n3);
        assertEquals(expected, actual2);
    }

    @Test
    public void E268_test4() {
        int expected = 10;
        int actual = e268.missingNumber(n4);
        assertEquals(expected, actual);

        int actual2 = e268.missingNumber_bit(n4);
        assertEquals(expected, actual2);
    }

}
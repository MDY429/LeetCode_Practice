import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E136_Test {

    E136_Single_Number e136;
    int[] num1, num2, num3, num4;

    @BeforeEach
    public void init() {
        e136 = new E136_Single_Number();

        num1 = new int[] { 1, 1, 0 };
        num2 = new int[] { 0, 1, 5, 3, 2, 2, 5, 3, 1, 4, 4 };
        num3 = new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 3 };
        num4 = new int[] {};
    }

    @Test
    public void E136_test1() {
        int expected = 0;
        int actual = e136.singleNumber(num1);
        assertEquals(expected, actual);

        int actual2 = e136.singleNumber_map2(num1);
        assertEquals(expected, actual2);
    }

    @Test
    public void E136_test2() {
        int expected = 0;
        int actual = e136.singleNumber(num2);
        assertEquals(expected, actual);

        int actual2 = e136.singleNumber_map2(num2);
        assertEquals(expected, actual2);
    }

    @Test
    public void E136_test3() {
        int expected = 3;
        int actual = e136.singleNumber(num3);
        assertEquals(expected, actual);

        int actual2 = e136.singleNumber_map2(num3);
        assertEquals(expected, actual2);
    }

    @Test
    public void E136_test4() {

        assertThrows(IllegalArgumentException.class, () -> {
            e136.singleNumber(num4);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            e136.singleNumber_map2(num4);
        });
    }
}
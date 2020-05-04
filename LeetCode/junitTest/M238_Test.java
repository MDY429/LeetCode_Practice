import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M238_Test {

    M238_Product_of_Array_Except_Self m238;
    int[] n1, n2, n3, n4;

    @BeforeEach
    public void init() {
        m238 = new M238_Product_of_Array_Except_Self();

        n1 = new int[] { 1, 2, 3, 5, 6 };
        n2 = new int[] { 2, 6, 3, 1, 5 };
        n3 = new int[] { 2, 2, 2, 2, 2 };
        n4 = new int[] { 6, -3, 2, -1, -5 };
    }

    @Test
    public void M238_test1() {
        int[] expected = new int[] { 180, 90, 60, 36, 30 };
        int[] actual = m238.productExceptSelf(n1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void M238_test2() {
        int[] expected = new int[] { 90, 30, 60, 180, 36 };
        int[] actual = m238.productExceptSelf(n2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void M238_test3() {
        int[] expected = new int[] { 16, 16, 16, 16, 16 };
        int[] actual = m238.productExceptSelf(n3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void M238_test4() {
        int[] expected = new int[] { -30, 60, -90, 180, 36 };
        int[] actual = m238.productExceptSelf(n4);
        assertArrayEquals(expected, actual);
    }
}
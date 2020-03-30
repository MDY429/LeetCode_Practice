import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E53_Test {

    E53_Maximum_Subarray e53;
    int[] num1, num2, num3, num4, num5, num6, num7, num8;

    @BeforeEach
    public void init() {
        e53 = new E53_Maximum_Subarray();
        num1 = new int[] { -1, 2, 3, 4, -2, -1, -3, 4, 1 };
        num2 = new int[] { 0, -2, -3, -1, -3, 2, 5, 7, -2 };
        num3 = new int[] { -1, -1, 1, 2, 3, 4, 5, -1, -1 };
        num4 = new int[] { 5 };
        num5 = new int[] { 100, -2, -6, -4, -8, -9, 0, 1, 10 };
        num6 = new int[] { -99, 5, -99, 10, -99, -1, -5, 15, -99 };
        num7 = new int[] { -99, 2, -99, 3, 2, -99, -99, 4, 0, -1, 3 };
        num8 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }

    @Test
    public void E53_loop_test1() {
        int expected = 9;
        int actual = e53.maxSubArray(num1);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test2() {
        int expected = 14;
        int actual = e53.maxSubArray(num2);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test3() {
        int expected = 15;
        int actual = e53.maxSubArray(num3);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test4() {
        int expected = 5;
        int actual = e53.maxSubArray(num4);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test5() {
        int expected = 100;
        int actual = e53.maxSubArray(num5);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test6() {
        int expected = 15;
        int actual = e53.maxSubArray(num6);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test7() {
        int expected = 6;
        int actual = e53.maxSubArray(num7);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_loop_test8() {
        int expected = 55;
        int actual = e53.maxSubArray(num8);
        assertEquals(expected, actual);
    }

    // Divide And Conquer.
    @Test
    public void E53_DC_test1() {
        int expected = 9;
        int actual = e53.divideAndConquer(num1);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test2() {
        int expected = 14;
        int actual = e53.divideAndConquer(num2);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test3() {
        int expected = 15;
        int actual = e53.divideAndConquer(num3);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test4() {
        int expected = 5;
        int actual = e53.divideAndConquer(num4);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test5() {
        int expected = 100;
        int actual = e53.divideAndConquer(num5);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test6() {
        int expected = 15;
        int actual = e53.divideAndConquer(num6);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test7() {
        int expected = 6;
        int actual = e53.divideAndConquer(num7);
        assertEquals(expected, actual);
    }

    @Test
    public void E53_DC_test8() {
        int expected = 55;
        int actual = e53.divideAndConquer(num8);
        assertEquals(expected, actual);
    }

}
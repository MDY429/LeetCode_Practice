import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1_Test {

    E1_Two_Sum twoSum;
    int[] num1, num2, num3, num4, num5;

    @BeforeEach
    public void init() {
        twoSum = new E1_Two_Sum();
        num1 = new int[] { 2, 5, 7, 12, 26 };
        num2 = new int[] { 1, 1, 1, 1 };
        num3 = new int[] { 3, 6, 1, 15, 22, 30, 99 };
        num4 = new int[] { -5, 0, 3, -8, 72, 18, 5 };
        num5 = new int[] {};
    }

    @Test
    public void testTwoSum_1() {
        int target = 7;
        int[] expected = { 0, 1 };
        int[] actual = twoSum.twoSum(num1, target);
        assertArrayEquals(expected, actual);

        assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum_map(num1, 30);
        });
    }

    @Test
    public void testTwoSum_2() {
        int target = 2;
        int[] expected = { 0, 1 };
        int[] actual = twoSum.twoSum(num2, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum_3() {
        int[] target = { 100, 9, 37, 129, 7, 18, 52 };
        int[][] expected = { { 2, 6 }, { 0, 1 }, { 3, 4 }, { 5, 6 }, { 1, 2 }, { 0, 3 }, { 4, 5 } };

        for (int i = 0; i < target.length; i++) {
            int[] actual = twoSum.twoSum(num3, target[i]);
            assertArrayEquals(expected[i], actual);
        }
    }

    @Test
    public void testTwoSum_4() {
        int target = 0;
        int[] expected = { 0, 6 };
        int[] actual = twoSum.twoSum(num4, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum_5() {
        int target = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(num5, target);
        });
    }

    @Test
    public void testTwoSumMap_1() {
        int target = 7;
        int[] expected = { 0, 1 };
        int[] actual = twoSum.twoSum_map(num1, target);
        assertArrayEquals(expected, actual);

        assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum_map(num1, 99);
        });
    }

    @Test
    public void testTwoSumMap_2() {
        int target = 2;
        int[] expected = { 0, 1 };
        int[] actual = twoSum.twoSum_map(num2, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSumMap_3() {
        int[] target = { 100, 9, 37, 129, 7, 18, 52 };
        int[][] expected = { { 2, 6 }, { 0, 1 }, { 3, 4 }, { 5, 6 }, { 1, 2 }, { 0, 3 }, { 4, 5 } };

        for (int i = 0; i < target.length; i++) {
            int[] actual = twoSum.twoSum_map(num3, target[i]);
            assertArrayEquals(expected[i], actual);
        }
    }

    @Test
    public void testTwoSumMap_4() {
        int target = 0;
        int[] expected = { 0, 6 };
        int[] actual = twoSum.twoSum_map(num4, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSumMap_5() {
        int target = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum_map(num5, target);
        });
    }
}
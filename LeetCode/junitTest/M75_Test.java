import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M75_Test {

    M75_Sort_Colors m75 = new M75_Sort_Colors();

    @Test
    public void M75_test1() {

        int[] nums = new int[] { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        int[] expected = new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 2 };

        m75.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void M75_test2() {

        int[] nums = new int[] { 0, 0, 0, 1, 1, 2, 2, 2, 2 };
        int[] expected = new int[] { 0, 0, 0, 1, 1, 2, 2, 2, 2 };

        m75.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void M75_test3() {

        int[] nums = new int[] { 2, 2, 1, 1, 0, 0, 0 };
        int[] expected = new int[] { 0, 0, 0, 1, 1, 2, 2 };

        m75.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void M75_test4() {

        int[] nums = new int[] {};
        int[] expected = new int[] {};

        m75.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
}
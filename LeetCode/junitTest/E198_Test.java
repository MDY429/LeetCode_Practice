import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E198_Test {

    E198_House_Robber e198;
    int[] nums1, nums2, nums3, nums4, nums5;

    @BeforeEach
    public void init() {
        e198 = new E198_House_Robber();

        nums1 = new int[] { 1, 2, 3, 4, 5, 6 };
        nums2 = new int[] { 1, 2, 2, 2, 2, 2 };
        nums3 = new int[] { 5 };
        nums4 = new int[] { 5, 5, 0, 0, 0, 0, 0, 0, 0, 5, 5 };
        nums5 = new int[] {};
    }

    @Test
    public void E198_test1() {
        int expected = 12;
        int actual = e198.rob(nums1);
        assertEquals(expected, actual);
    }

    @Test
    public void E198_test2() {
        int expected = 6;
        int actual = e198.rob(nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void E198_test3() {
        int expected = 5;
        int actual = e198.rob(nums3);
        assertEquals(expected, actual);
    }

    @Test
    public void E198_test4() {
        int expected = 10;
        int actual = e198.rob(nums4);
        assertEquals(expected, actual);
    }

    @Test
    public void E198_test5() {
        int expected = 0;
        int actual = e198.rob(nums5);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E283_Test {

    E283_Move_Zeroes e283;
    int[] nums1, nums2, nums3, nums4, nums5;

    @BeforeEach
    public void init() {
        e283 = new E283_Move_Zeroes();

        nums1 = new int[] { 0, 1, 2, 3, 4, 5, 6 };

        nums2 = new int[] { 0, 1, 2, 0, 0, 0, 0, 3, 4, 5, 6, 7 };

        nums3 = new int[] {};

        nums4 = new int[] { 0, 0, 0, 0 };

        nums5 = new int[] { 1, 2, 3, 4, 5 };
    }

    @Test
    public void E283_test1() {
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 0 };
        e283.moveZeroes(nums1);
        for (int i = 0; i < nums1.length; i++) {
            assertEquals(expected[i], nums1[i]);
        }
    }

    @Test
    public void E283_test2() {
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0, 0 };
        e283.moveZeroes(nums2);
        for (int i = 0; i < nums2.length; i++) {
            assertEquals(expected[i], nums2[i]);
        }
    }

    @Test
    public void E283_test3() {
        int[] expected = new int[] {};
        e283.moveZeroes(nums3);
        for (int i = 0; i < nums3.length; i++) {
            assertEquals(expected[i], nums3[i]);
        }
    }

    @Test
    public void E283_test4() {
        int[] expected = new int[] { 0, 0, 0, 0 };
        e283.moveZeroes(nums4);
        for (int i = 0; i < nums4.length; i++) {
            assertEquals(expected[i], nums4[i]);
        }
    }

    @Test
    public void E283_test5() {
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        e283.moveZeroes(nums5);
        for (int i = 0; i < nums5.length; i++) {
            assertEquals(expected[i], nums5[i]);
        }
    }
}
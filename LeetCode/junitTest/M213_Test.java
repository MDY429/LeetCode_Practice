import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M213_Test {

    M213_House_Robber_II m213;
    int[] nums1, nums2, nums3, nums4, nums5, nums6, nums7;

    @BeforeEach
    public void init() {
        m213 = new M213_House_Robber_II();
        
        nums1 = new int[] { 2, 3, 2 };
        nums2 = new int[] { 2, 3, 4 };
        nums3 = new int[] { 2, 2, 2, 2, 2, 2, 2 };
        nums4 = new int[] { 5, 0, 0, 0, 6 };
        nums5 = new int[] {};
        nums6 = new int[] { 1 };
        nums7 = new int[] { 2, 3 };
    }

    @Test
    public void M213_test1() {
        int expected = 3;
        int actual = m213.rob(nums1);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test2() {
        int expected = 4;
        int actual = m213.rob(nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test3() {
        int expected = 6;
        int actual = m213.rob(nums3);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test4() {
        int expected = 6;
        int actual = m213.rob(nums4);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test5() {
        int expected = 0;
        int actual = m213.rob(nums5);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test6() {
        int expected = 1;
        int actual = m213.rob(nums6);
        assertEquals(expected, actual);
    }

    @Test
    public void M213_test7() {
        int expected = 3;
        int actual = m213.rob(nums7);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E594_Test {

    E594_Longest_Harmonious_Subsequence e594;
    int[] nums1, nums2, nums3, nums4, nums5, nums6;

    @BeforeEach
    public void init() {
        e594 = new E594_Longest_Harmonious_Subsequence();

        nums1 = new int[] { 1, 5, 9, 13, 20 };
        nums2 = new int[] { 1, 3, 1, 3, 2, 2, 5, 2, 3, 7 };
        nums3 = new int[] { 5, 4, 3, 2, 1, 0 };
        nums4 = new int[] { 10 };
        nums5 = new int[] { -999, -999, -999, -999, -999, -998, -998, -997, -997, 10, 100, 10000, 10000, 10001, 10001 };
        nums6 = new int[] {1,1,1,1,1};
    }

    @Test
    public void E594_Test1() {
        int expected = 0;
        int actual = e594.findLHS(nums1);
        assertEquals(expected, actual);
    }

    @Test
    public void E594_Test2() {
        int expected = 6;
        int actual = e594.findLHS(nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void E594_Test3() {
        int expected = 2;
        int actual = e594.findLHS(nums3);
        assertEquals(expected, actual);
    }

    @Test
    public void E594_Test4() {
        int expected = 0;
        int actual = e594.findLHS(nums4);
        assertEquals(expected, actual);
    }

    @Test
    public void E594_Test5() {
        int expected = 7;
        int actual = e594.findLHS(nums5);
        assertEquals(expected, actual);
    }

    @Test
    public void E594_Test6() {
        int expected = 0;
        int actual = e594.findLHS(nums6);
        assertEquals(expected, actual);
    }
}

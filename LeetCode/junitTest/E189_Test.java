import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E189_Test {

    E189_Rotate_Array e189;
    int[] nums1, nums2, nums3;

    @BeforeEach
    public void init() {
        e189 = new E189_Rotate_Array();

        nums1 = new int[] {1,2,3,4,5,6,7};

        nums2 = new int[] {-10,-15,-30,-40};

        nums3 = new int[] {-99,50,40,9,3,18,21};
    }

    @Test
    public void E189_m1_test1() {
        int k = 3;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m1_test2() {
        int k = 10;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m1_test3() {
        int k = 1;
        int[] expected = new int[] {-40,-10,-15,-30};
        e189.rotate(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m1_test4() {
        int k = 0;
        int[] expected = new int[] {-10,-15,-30,-40};
        e189.rotate(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m1_test5() {
        int k = 6;
        int[] expected = new int[] {50,40,9,3,18,21,-99};
        e189.rotate(nums3, k);
        int[] actual = nums3;        
        assertArrayEquals(expected, actual);
    }

    // Method2
    @Test
    public void E189_m2_test1() {
        int k = 3;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate2(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m2_test2() {
        int k = 10;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate2(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m2_test3() {
        int k = 1;
        int[] expected = new int[] {-40,-10,-15,-30};
        e189.rotate2(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m2_test4() {
        int k = 0;
        int[] expected = new int[] {-10,-15,-30,-40};
        e189.rotate2(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m2_test5() {
        int k = 6;
        int[] expected = new int[] {50,40,9,3,18,21,-99};
        e189.rotate2(nums3, k);
        int[] actual = nums3;        
        assertArrayEquals(expected, actual);
    }

    //Method3
    @Test
    public void E189_m3_test1() {
        int k = 3;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate3(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m3_test2() {
        int k = 10;
        int[] expected = new int[] {5,6,7,1,2,3,4};
        e189.rotate3(nums1, k);
        int[] actual = nums1;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m3_test3() {
        int k = 1;
        int[] expected = new int[] {-40,-10,-15,-30};
        e189.rotate3(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m3_test4() {
        int k = 0;
        int[] expected = new int[] {-10,-15,-30,-40};
        e189.rotate3(nums2, k);
        int[] actual = nums2;        
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E189_m3_test5() {
        int k = 6;
        int[] expected = new int[] {50,40,9,3,18,21,-99};
        e189.rotate3(nums3, k);
        int[] actual = nums3;        
        assertArrayEquals(expected, actual);
    }

}
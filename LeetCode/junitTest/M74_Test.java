import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M74_Test {
    M74_Search_a_2D_Matrix m74;
    int[][] m1, m2, m3, m4, m5;

    @BeforeEach
    public void init() {
        m74 = new M74_Search_a_2D_Matrix();

        m1 = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 }, { 55, 60, 70, 80 } };

        m2 = new int[][] { { 0 }, { 3 }, { 5 }, { 15 }, { 23 }, { 33 }, { 43 } };

        m3 = new int[][] { { 1, 3, 5, 7, 10, 16, 20, 30, 35, 41, 48, 55, 60, 70, 82, 1000 } };

        m4 = new int[][] {};

        m5 = new int[][] { {} };
    }

    @Test
    public void M74_test1() {
        int target1 = 0;
        assertFalse(m74.searchMatrix(m1, target1));

        int target2 = 100;
        assertFalse(m74.searchMatrix(m1, target2));

        int target3 = 3;
        assertTrue(m74.searchMatrix(m1, target3));

        int target4 = 17;
        assertFalse(m74.searchMatrix(m1, target4));

        int target5 = 20;
        assertTrue(m74.searchMatrix(m1, target5));

        int target6 = 23;
        assertTrue(m74.searchMatrix(m1, target6));

        int target7 = 70;
        assertTrue(m74.searchMatrix(m1, target7));

        int target8 = 54;
        assertFalse(m74.searchMatrix(m1, target8));
    }

    @Test
    public void M74_test2() {
        int target1 = 0;
        assertTrue(m74.searchMatrix(m2, target1));

        int target2 = 100;
        assertFalse(m74.searchMatrix(m2, target2));

        int target3 = 3;
        assertTrue(m74.searchMatrix(m2, target3));

        int target4 = 17;
        assertFalse(m74.searchMatrix(m2, target4));

        int target5 = 20;
        assertFalse(m74.searchMatrix(m2, target5));

        int target6 = 23;
        assertTrue(m74.searchMatrix(m2, target6));

        int target7 = 43;
        assertTrue(m74.searchMatrix(m2, target7));

        int target8 = 54;
        assertFalse(m74.searchMatrix(m2, target8));
    }
    
    @Test
    public void M74_test3() {
        int target1 = 0;
        assertFalse(m74.searchMatrix(m3, target1));

        int target2 = 1000;
        assertTrue(m74.searchMatrix(m3, target2));

        int target3 = 3;
        assertTrue(m74.searchMatrix(m3, target3));

        int target4 = 17;
        assertFalse(m74.searchMatrix(m3, target4));

        int target5 = 20;
        assertTrue(m74.searchMatrix(m3, target5));

        int target6 = 23;
        assertFalse(m74.searchMatrix(m3, target6));

        int target7 = 60;
        assertTrue(m74.searchMatrix(m3, target7));

        int target8 = 1004;
        assertFalse(m74.searchMatrix(m3, target8));
    }

    @Test
    public void M74_test4() {
        int target = 0;
        assertFalse(m74.searchMatrix(m4, target));
    }

    @Test
    public void M74_test5() {
        int target = 0;
        assertFalse(m74.searchMatrix(m5, target));
    }
}
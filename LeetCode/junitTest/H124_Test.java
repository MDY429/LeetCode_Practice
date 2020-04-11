import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class H124_Test {

    H124_Binary_Tree_Maximum_Path_Sum h124;
    TreeNode t1, t2, t3, t4;

    @BeforeEach
    public void init() {
        h124 = new H124_Binary_Tree_Maximum_Path_Sum();

        Integer[] arr1 = new Integer[] { -10, 9, 20, null, null, 15, 7 };
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] { 100, -10, -20, null, null, 35, 7 };
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] { -10, -6, -3, null, null, -1, -1 };
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] { 10, 5, 8, 7, 4, 6, 5, null, 3, 8, null, 5, 10, null, 9 };
        t4 = TreeNode.build(arr4);
    }

    @Test
    public void H124_test1() {
        int expected = 42;
        int actual = h124.maxPathSum(t1);
        assertEquals(expected, actual);

    }

    @Test
    public void H124_test2() {
        int expected = 115;
        int actual = h124.maxPathSum(t2);
        assertEquals(expected, actual);

    }

    @Test
    public void H124_test3() {
        int expected = -1;
        int actual = h124.maxPathSum(t3);
        assertEquals(expected, actual);

    }

    @Test
    public void H124_test4() {
        int expected = 51;
        int actual = h124.maxPathSum(t4);
        assertEquals(expected, actual);

    }
}
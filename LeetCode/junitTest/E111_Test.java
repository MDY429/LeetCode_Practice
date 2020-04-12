import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E111_Test {

    E111_Minimum_Depth_of_Binary_Tree e111;
    TreeNode t1, t2, t3, t4, t5;

    @BeforeEach
    public void init() {
        e111 = new E111_Minimum_Depth_of_Binary_Tree();

        Integer[] arr1 = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] { 1, 2, 3, 4, null, null, 7 };
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] { 1 };
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] { 1, null, 5 };
        t4 = TreeNode.build(arr4);

        Integer[] arr5 = new Integer[] {};
        t5 = TreeNode.build(arr5);
    }

    @Test
    public void E111_test1() {
        int expected = 2;
        int actual = e111.minDepth(t1);
        assertEquals(expected, actual);
    }

    @Test
    public void E111_test2() {
        int expected = 3;
        int actual = e111.minDepth(t2);
        assertEquals(expected, actual);
    }

    @Test
    public void E111_test3() {
        int expected = 1;
        int actual = e111.minDepth(t3);
        assertEquals(expected, actual);
    }

    @Test
    public void E111_test4() {
        int expected = 2;
        int actual = e111.minDepth(t4);
        assertEquals(expected, actual);
    }

    @Test
    public void E111_test5() {
        int expected = 0;
        int actual = e111.minDepth(t5);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E101_Test {

    E101_Symmetric_Tree e101;
    TreeNode t1, t2, t3, t4, t5, t6;

    @BeforeEach
    public void init() {
        e101 = new E101_Symmetric_Tree();

        Integer[] arr1 = new Integer[] { 1, 2, 2, 3, 4, 4, 3 };
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] { 1, 2, 2, null, 3, null, 3 };
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] { 1, 2, 2, null, 3, 3, null };
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] {};
        t4 = TreeNode.build(arr4);

        Integer[] arr5 = new Integer[] { 1, 2, 2, 3, 4, 5, 3 };
        t5 = TreeNode.build(arr5);

        Integer[] arr6 = new Integer[] { 8 };
        t6 = TreeNode.build(arr6);
    }

    @Test
    public void E101_test1() {
        assertTrue(e101.isSymmetric(t1));
        assertFalse(e101.isSymmetric(t2));
        assertTrue(e101.isSymmetric(t3));
        assertTrue(e101.isSymmetric(t4));
        assertFalse(e101.isSymmetric(t5));
        assertTrue(e101.isSymmetric(t6));
    }

    @Test
    public void E101_test2() {
        assertTrue(e101.isSymmetric_loop(t1));
        assertFalse(e101.isSymmetric_loop(t2));
        assertTrue(e101.isSymmetric_loop(t3));
        assertTrue(e101.isSymmetric_loop(t4));
        assertFalse(e101.isSymmetric_loop(t5));
        assertTrue(e101.isSymmetric_loop(t6));
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M98_Test {

    M98_Validate_Binary_Search_Tree m98;
    TreeNode t1, t2, t3, t4, t5, t6, t7, t8;

    @BeforeEach
    public void init() {
        m98 = new M98_Validate_Binary_Search_Tree();

        Integer[] arr1 = new Integer[] { 2, 1, 3 };
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] { 50, 25, 75, 5, 40, 60, 90, 0, null, 30, 60 };
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] { 50, 25, 75, 5, 40, 60, 90, 0, null, 30, 44 };
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] { 50, 25, 75, 5, 40, 60, 90, 0, null, null, null, 60 };
        t4 = TreeNode.build(arr4);

        Integer[] arr5 = new Integer[] { 50, 25, 75, 5, 40, 60, 90, 0, null, null, null, 59, 77 };
        t5 = TreeNode.build(arr5);

        Integer[] arr6 = new Integer[] {};
        t6 = TreeNode.build(arr6);

        Integer[] arr7 = new Integer[] { 2147483647 };
        t7 = TreeNode.build(arr7);

        Integer[] arr8 = new Integer[] { 1, 1 };
        t8 = TreeNode.build(arr8);
    }

    @Test
    public void E98_test1() {
        assertTrue(m98.isValidBST(t1));

        assertFalse(m98.isValidBST(t2));

        assertTrue(m98.isValidBST(t3));

        assertFalse(m98.isValidBST(t4));

        assertFalse(m98.isValidBST(t5));

        assertTrue(m98.isValidBST(t6));

        assertTrue(m98.isValidBST(t7));

        assertFalse(m98.isValidBST(t8));
    }

}
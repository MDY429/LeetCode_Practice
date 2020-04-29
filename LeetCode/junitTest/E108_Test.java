import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E108_Test {

    E108_Convert_Sorted_Array_to_Binary_Search_Tree e108;
    M98_Validate_Binary_Search_Tree m98;
    E110_Balanced_Binary_Tree e110;
    int[] n1, n2, n3, n4, n5;

    @BeforeEach
    public void init() {
        e108 = new E108_Convert_Sorted_Array_to_Binary_Search_Tree();
        m98 = new M98_Validate_Binary_Search_Tree();
        e110 = new E110_Balanced_Binary_Tree();

        n1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        n2 = new int[] { -99, -5, 3, 8, 10, 21, 33 };
        n3 = new int[] {};
        n4 = new int[] { 999 };
        n5 = new int[] { -9, -8, -7, -6, -5, -4, -3, -2, -1 };
    }

    @Test
    public void E108_test1() {
        Integer[] arr = new Integer[] { 5, 2, 8, 1, 3, 6, 9, null, null, null, 4, null, 7, null, 10 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e108.sortedArrayToBST(n1);
        assertEquals(expected, actual);
        assertTrue(m98.isValidBST(actual) && e110.isBalanced(actual));
    }

    @Test
    public void E108_test2() {
        Integer[] arr = new Integer[] { 8, -5, 21, -99, 3, 10, 33 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e108.sortedArrayToBST(n2);
        assertEquals(expected, actual);
        assertTrue(m98.isValidBST(actual) && e110.isBalanced(actual));
    }

    @Test
    public void E108_test3() {
        TreeNode expected = null;
        TreeNode actual = e108.sortedArrayToBST(n3);
        assertEquals(expected, actual);
        assertTrue(m98.isValidBST(actual) && e110.isBalanced(actual));
    }

    @Test
    public void E108_test4() {
        TreeNode expected = new TreeNode(999);
        TreeNode actual = e108.sortedArrayToBST(n4);
        assertEquals(expected, actual);
        assertTrue(m98.isValidBST(actual) && e110.isBalanced(actual));
    }

    @Test
    public void E108_test5() {
        Integer[] arr = new Integer[] { -5, -8, -3, -9, -7, -4, -2, null, null, null, -6, null, null, null, -1 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e108.sortedArrayToBST(n5);
        assertEquals(expected, actual);
        assertTrue(m98.isValidBST(actual) && e110.isBalanced(actual));
    }

}
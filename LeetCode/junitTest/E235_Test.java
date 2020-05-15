import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E235_Test {
    E235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree e235;
    TreeNode t1, t2;

    @BeforeEach
    public void init() {
        e235 = new E235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree();

        Integer[] a = new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] {};
        t2 = TreeNode.build(b);
    }

    @Test
    public void E235_test1() {
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        Integer[] arr = new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e235.lowestCommonAncestor(t1, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t1, p, q);
        assertEquals(expected, actual2);
    }

    @Test
    public void E235_test2() {
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        Integer[] arr = new Integer[] { 2, 0, 4, null, null, 3, 5 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e235.lowestCommonAncestor(t1, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t1, p, q);
        assertEquals(expected, actual2);
    }

    @Test
    public void E235_test3() {
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(9);

        Integer[] arr = new Integer[] { 8, 7, 9 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e235.lowestCommonAncestor(t1, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t1, p, q);
        assertEquals(expected, actual2);
    }

    @Test
    public void E235_test4() {
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(5);

        Integer[] arr = new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e235.lowestCommonAncestor(t1, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t1, p, q);
        assertEquals(expected, actual2);
    }

    @Test
    public void E235_test5() {
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(2);

        Integer[] arr = new Integer[] { 2, 0, 4, null, null, 3, 5 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e235.lowestCommonAncestor(t1, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t1, p, q);
        assertEquals(expected, actual2);
    }

    @Test
    public void E235_test6() {
        TreeNode p = null;
        TreeNode q = null;

        TreeNode expected = null;
        TreeNode actual = e235.lowestCommonAncestor(t2, p, q);
        assertEquals(expected, actual);

        TreeNode actual2 = e235.lowestCommonAncestor_ite(t2, p, q);
        assertEquals(expected, actual2);
    }
}
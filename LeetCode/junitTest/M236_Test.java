import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M236_Test {
    M236_Lowest_Common_Ancestor_of_a_Binary_Tree m236;
    TreeNode t1;

    @BeforeEach
    public void init() {

        m236 = new M236_Lowest_Common_Ancestor_of_a_Binary_Tree();

        Integer[] a = new Integer[] { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        t1 = TreeNode.build(a);

    }

    @Test
    public void M236_test1() {
        Integer[] arr = new Integer[] { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(5);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

    @Test
    public void M236_test2() {
        Integer[] arr = new Integer[] { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(7);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

    @Test
    public void M236_test3() {
        Integer[] arr = new Integer[] { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(4);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

    @Test
    public void M236_test4() {
        Integer[] arr = new Integer[] { 1, 0, 8 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(8);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

    @Test
    public void M236_test5() {
        Integer[] arr = new Integer[] { 5, 6, 2, null, null, 7, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(5);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

    @Test
    public void M236_test6() {
        Integer[] arr = new Integer[] { 2, 7, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(7);
        TreeNode actual = m236.lowestCommonAncestor(t1, p, q);

        assertEquals(expected, actual);
    }

}
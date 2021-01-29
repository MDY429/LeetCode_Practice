import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class M1008_Test {

    M1008_Construct_Binary_Search_Tree_from_Preorder_Traversal m1008;
    int[] p1, p2, p3;
    TreeNode t1, t2, t3;

    @BeforeEach
    public void init() {
        m1008 = new M1008_Construct_Binary_Search_Tree_from_Preorder_Traversal();

        p1 = new int[] { 8, 5, 1, 7, 10, 12 };
        t1 = TreeNode.build(new Integer[] { 8, 5, 10, 1, 7, null, 12 });

        p2 = new int[] { 5, 8, 10, 12 };
        t2 = TreeNode.build(
                new Integer[] { 5, null, 8, null, null, null, 10, null, null, null, null, null, null, null, 12 });

        p3 = new int[] { 5, 4, 3, 2, 1 };
        t3 = TreeNode.build(
                new Integer[] { 5, 4, null, 3, null, null, null, 2, null, null, null, null, null, null, null, 1 });
    }

    @Test
    public void M1008_Test1() {
        TreeNode actual = m1008.bstFromPreorder(p1);
        assertTrue(t1.equals(actual));
    }

    @Test
    public void M1008_Test2() {
        TreeNode actual = m1008.bstFromPreorder(p2);
        assertTrue(t2.equals(actual));
    }

    @Test
    public void M1008_Test3() {
        TreeNode actual = m1008.bstFromPreorder(p3);
        assertTrue(t3.equals(actual));
    }

    @Test
    public void M1008_it_Test1() {
        TreeNode actual = m1008.bstFromPreorder_loop(p1);
        assertTrue(t1.equals(actual));
    }

    @Test
    public void M1008_it_Test2() {
        TreeNode actual = m1008.bstFromPreorder_loop(p2);
        assertTrue(t2.equals(actual));
    }

    @Test
    public void M1008_it_Test3() {
        TreeNode actual = m1008.bstFromPreorder_loop(p3);
        assertTrue(t3.equals(actual));
    }

    @Test
    public void M1008_re_Test1() {
        TreeNode actual = m1008.bstFromPreorder_recursion(p1);
        assertTrue(t1.equals(actual));
    }

    @Test
    public void M1008_re_Test2() {
        TreeNode actual = m1008.bstFromPreorder_recursion(p2);
        assertTrue(t2.equals(actual));
    }

    @Test
    public void M1008_re_Test3() {
        TreeNode actual = m1008.bstFromPreorder_recursion(p3);
        assertTrue(t3.equals(actual));
    }
}

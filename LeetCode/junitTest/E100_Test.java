import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E100_Test {

    E100_Same_Tree e100;
    TreeNode t1, t2, t3, t4, t5, t6, t7;

    @BeforeEach
    public void init() {
        e100 = new E100_Same_Tree();

        Integer[] treeArr1 = new Integer[] { 1, 2, 3 };
        t1 = TreeNode.build(treeArr1);

        Integer[] treeArr2 = new Integer[] { 1, null, 2 };
        t2 = TreeNode.build(treeArr2);

        Integer[] treeArr3 = new Integer[] { 1, 2, null };
        t3 = TreeNode.build(treeArr3);

        Integer[] treeArr4 = new Integer[] { 1, null, 2, null, null, 3 };
        t4 = TreeNode.build(treeArr4);

        Integer[] treeArr5 = new Integer[] {};
        t5 = TreeNode.build(treeArr5);

        Integer[] treeArr6 = new Integer[] { 1, 2, 3 };
        t6 = TreeNode.build(treeArr6);

        Integer[] treeArr7 = new Integer[] { 1, 2, null, 3 };
        t7 = TreeNode.build(treeArr7);
    }

    @Test
    public void E100_test() {
        assertTrue(e100.isSameTree(t1, t6));

        assertFalse(e100.isSameTree(t2, t3));

        assertFalse(e100.isSameTree(t1, t7));

        assertTrue(e100.isSameTree(t5, null));

        assertFalse(e100.isSameTree(t1, t4));

        assertFalse(e100.isSameTree(t4, t7));

        assertTrue(e100.isSameTree(t4, t4));
    }

    @Test
    public void E100_test2() {
        TreeNode exp = new TreeNode(1);
        exp.right = new TreeNode(2);
        exp.right.left = new TreeNode(3);

        assertTrue(e100.isSameTree(exp, t4));

    }
}
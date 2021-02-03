import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M669_Test {

    M669_Trim_a_Binary_Search_Tree m669;
    Integer[] a1, a2, a3, a4, a5;
    TreeNode t1, t2, t3, t4, t5;

    @BeforeEach
    public void init() {
        m669 = new M669_Trim_a_Binary_Search_Tree();

        a1 = new Integer[] { 3, 0, 4, null, 2, null, null, null, null, 1 };
        t1 = TreeNode.build(a1);

        a2 = new Integer[] { 1 };
        t2 = TreeNode.build(a2);

        a3 = new Integer[] { 3, 1, 4, null, 2 };
        t3 = TreeNode.build(a3);

        a4 = new Integer[] { 3, 2, 4, 1 };
        t4 = TreeNode.build(a4);

        a5 = new Integer[] {};
        t5 = TreeNode.build(a5);
    }

    @Test
    public void M669_Test1() {
        Integer[] arr = new Integer[] { 3, 2, null, 1 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = m669.trimBST(t1, 1, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void M669_Test2() {
        Integer[] arr = new Integer[] { 1 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = m669.trimBST(t2, 1, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void M669_Test3() {
        Integer[] arr = new Integer[] { 3, null, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = m669.trimBST(t3, 3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void M669_Test4() {
        Integer[] arr = new Integer[] { 1 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = m669.trimBST(t4, 1, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void M669_Test5() {
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = m669.trimBST(t5, 1, 3);

        assertEquals(expected, actual);
    }
}

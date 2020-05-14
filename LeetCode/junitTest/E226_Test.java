import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E226_Test {

    E226_Invert_Binary_Tree e226;
    TreeNode t1, t2, t3, t4;

    @BeforeEach
    public void init() {
        e226 = new E226_Invert_Binary_Tree();

        Integer[] a = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        t1 = TreeNode.build(a);
        Integer[] b = new Integer[] { 1, 2, null, 3, null, null, null, 4, null, null, null, null, null, null, null, 5 };
        
        t2 = TreeNode.build(b);
        Integer[] c = new Integer[] { 5, null, 4, null, null, null, 3, null, null, null, null, null, null, null, 2,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1 };
        
                t3 = TreeNode.build(c);
        Integer[] d = new Integer[] {};
        
        t4 = TreeNode.build(d);

    }

    @Test
    public void E226_test1() {
        Integer[] arr = new Integer[] { 1, 3, 2, 7, 6, 5, 4 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e226.invertTree(t1);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E226_test2() {
        Integer[] arr = new Integer[] { 1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e226.invertTree(t2);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E226_test3() {
        Integer[] arr = new Integer[] { 5, 4, null, 3, null, null, null, 2, null, null, null, null, null, null, null,
                1 };
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e226.invertTree(t3);
        
        assertEquals(expected, actual);
    }

    @Test
    public void E226_test4() {
        TreeNode expected = null;
        TreeNode actual = e226.invertTree(t4);
        
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M94_Test {

    M94_Binary_Tree_Inorder_Traversal m94;
    TreeNode t1, t2, t3, t4;

    @BeforeEach
    public void init() {

        m94 = new M94_Binary_Tree_Inorder_Traversal();

        Integer[] arr1 = new Integer[] { 1, null, 3, null, null, 2, 4, null, null, null, null, null, null, null, 5 };
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] { 4, 2, 5, 1, 3 };
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] {};
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] { 10, 9, null, 8, null, null, null, 7 };
        t4 = TreeNode.build(arr4);
    }

    @Test
    public void M94_test1() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> actual = m94.inorderTraversal(t1);
        assertEquals(expected, actual);

        List<Integer> actual2 = m94.inorderTraversal_recursion(t1);
        assertEquals(expected, actual2);
    }

    @Test
    public void M94_test2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> actual = m94.inorderTraversal(t2);
        assertEquals(expected, actual);

        List<Integer> actual2 = m94.inorderTraversal_recursion(t2);
        assertEquals(expected, actual2);
    }

    @Test
    public void M94_test3() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m94.inorderTraversal(t3);
        assertEquals(expected, actual);

        List<Integer> actual2 = m94.inorderTraversal_recursion(t3);
        assertEquals(expected, actual2);
    }

    @Test
    public void M94_test4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 8, 9, 10));
        List<Integer> actual = m94.inorderTraversal(t4);
        assertEquals(expected, actual);

        List<Integer> actual2 = m94.inorderTraversal_recursion(t4);
        assertEquals(expected, actual2);
    }
}
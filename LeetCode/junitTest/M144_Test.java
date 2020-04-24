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
public class M144_Test {

    M144_Binary_Tree_Preorder_Traversal m144;

    TreeNode t1, t2, t3, t4;

    @BeforeEach
    public void init() {

        m144 = new M144_Binary_Tree_Preorder_Traversal();

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
    public void M144_test1() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5));
        List<Integer> actual = m144.preorderTraversal(t1);
        assertEquals(expected, actual);
    }

    @Test
    public void M144_test2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 2, 1, 3, 5));
        List<Integer> actual = m144.preorderTraversal(t2);
        assertEquals(expected, actual);
    }

    @Test
    public void M144_test3() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m144.preorderTraversal(t3);
        assertEquals(expected, actual);
    }

    @Test
    public void M144_test4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 9, 8, 7));
        List<Integer> actual = m144.preorderTraversal(t4);
        assertEquals(expected, actual);
    }
}
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
public class M102_Test {
    M102_Binary_Tree_Level_Order_Traversal m102;
    TreeNode t1, t2, t3, t4, t5;

    @BeforeEach
    public void init() {
        m102 = new M102_Binary_Tree_Level_Order_Traversal();

        Integer[] a = new Integer[] { 3, 9, 20, 15, 7, 10, null, null, 3, 8, 1, 13 };
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] { 1, 2, null, 3, null, null, null, 4, null, null, null, null, null, null, null, 5 };
        t2 = TreeNode.build(b);

        Integer[] c = new Integer[] { 5, null, 4, null, null, null, 3, null, null, null, null, null, null, null, 2,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1 };
        t3 = TreeNode.build(c);

        Integer[] d = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        t4 = TreeNode.build(d);

        Integer[] e = new Integer[] {};
        t5 = TreeNode.build(e);
    }

    @Test
    public void M102_test1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7, 10));
        expected.add(Arrays.asList(3, 8, 1, 13));

        List<List<Integer>> actual = m102.levelOrder(t1);
        assertEquals(expected, actual);

        List<List<Integer>> actual2 = m102.levelOrder_bfs_iterator(t1);
        assertEquals(expected, actual2);
    }

    @Test
    public void M102_test2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(4));
        expected.add(Arrays.asList(5));

        List<List<Integer>> actual = m102.levelOrder(t2);
        assertEquals(expected, actual);

        List<List<Integer>> actual2 = m102.levelOrder_bfs_iterator(t2);
        assertEquals(expected, actual2);
    }

    @Test
    public void M102_test3() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5));
        expected.add(Arrays.asList(4));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1));

        List<List<Integer>> actual = m102.levelOrder(t3);
        assertEquals(expected, actual);

        List<List<Integer>> actual2 = m102.levelOrder_bfs_iterator(t3);
        assertEquals(expected, actual2);
    }

    @Test
    public void M102_test4() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(4, 5, 6, 7));
        expected.add(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15));

        List<List<Integer>> actual = m102.levelOrder(t4);
        assertEquals(expected, actual);

        List<List<Integer>> actual2 = m102.levelOrder_bfs_iterator(t4);
        assertEquals(expected, actual2);
    }

    @Test
    public void M102_test5() {
        List<List<Integer>> expected = new ArrayList<>();
        
        List<List<Integer>> actual = m102.levelOrder(t5);
        assertEquals(expected, actual);

        List<List<Integer>> actual2 = m102.levelOrder_bfs_iterator(t5);
        assertEquals(expected, actual2);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M1161_Test {
    M1161_Maximum_Level_Sum_of_a_Binary_Tree m1161;
    TreeNode t1, t2, t3, t4, t5, t6;

    @BeforeEach
    public void init() {
        m1161 = new M1161_Maximum_Level_Sum_of_a_Binary_Tree();

        Integer[] a1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        t1 = TreeNode.build(a1);

        Integer[] a2 = new Integer[] { 100, 1, 2, 3, 4, 5, 6 };
        t2 = TreeNode.build(a2);

        Integer[] a3 = new Integer[] { 1, 7, 0, null, -8, 8, 9 };
        t3 = TreeNode.build(a3);

        Integer[] a4 = new Integer[] { 1, 2, null, 3, null, null, null, 4, null, null, null, null, null, null, null,
                5 };
        t4 = TreeNode.build(a4);

        Integer[] a5 = new Integer[] { 1, null, 2, null, null, null, 9, null, null, null, null, null, null, null, 4 };
        t5 = TreeNode.build(a5);

        Integer[] a6 = new Integer[] { 1 };
        t6 = TreeNode.build(a6);
    }

    @Test
    public void M1161_test1() {
        int expected = 3;
        int actual = m1161.maxLevelSum(t1);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t1);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t1);
        assertEquals(expected, actual3);
    }

    @Test
    public void M1161_test2() {
        int expected = 1;
        int actual = m1161.maxLevelSum(t2);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t2);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t2);
        assertEquals(expected, actual3);
    }

    @Test
    public void M1161_test3() {
        int expected = 3;
        int actual = m1161.maxLevelSum(t3);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t3);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t3);
        assertEquals(expected, actual3);
    }

    @Test
    public void M1161_test4() {
        int expected = 5;
        int actual = m1161.maxLevelSum(t4);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t4);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t4);
        assertEquals(expected, actual3);
    }

    @Test
    public void M1161_test5() {
        int expected = 3;
        int actual = m1161.maxLevelSum(t5);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t5);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t5);
        assertEquals(expected, actual3);
    }

    @Test
    public void M1161_test6() {
        int expected = 1;
        int actual = m1161.maxLevelSum(t6);
        assertEquals(expected, actual);

        int actual2 = m1161.maxLevelSum_DFS(t6);
        assertEquals(expected, actual2);

        int actual3 = m1161.maxLevelSum_BFS_Iterator(t6);
        assertEquals(expected, actual3);
    }
}
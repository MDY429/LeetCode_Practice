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
public class M199_Test {
    M199_Binary_Tree_Right_Side_View m199;
    TreeNode t1, t2, t3, t4, t5, t6, t7;

    @BeforeEach
    public void init() {
        m199 = new M199_Binary_Tree_Right_Side_View();

        Integer[] a = new Integer[] { 1, 2, 3, null, 5, null, 4 };
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] { 1, 2, 3, null, 5, 4 };
        t2 = TreeNode.build(b);

        Integer[] c = new Integer[] { 1, 2, 3, null, 5 };
        t3 = TreeNode.build(c);

        Integer[] d = new Integer[] { 1, 2, 3, 5 };
        t4 = TreeNode.build(d);

        Integer[] e = new Integer[] { 1 };
        t5 = TreeNode.build(e);

        Integer[] f = new Integer[] { 1, 2, 3, 4, null, 5, null, null, 6, null, null, null, 7, null, null, null, null,
                8 };
        t6 = TreeNode.build(f);

        Integer[] g = new Integer[] {};
        t7 = TreeNode.build(g);
    }

    @Test
    public void M199_test1() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> actual = m199.rightSideView(t1);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t1);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> actual = m199.rightSideView(t2);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t2);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test3() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> actual = m199.rightSideView(t3);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t3);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test4() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> actual = m199.rightSideView(t4);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t4);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test5() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1));
        List<Integer> actual = m199.rightSideView(t5);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t5);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test6() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8));
        List<Integer> actual = m199.rightSideView(t6);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t6);
        assertEquals(expected, actual2);
    }

    @Test
    public void M199_test7() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m199.rightSideView(t7);
        assertEquals(expected, actual);

        List<Integer> actual2 = m199.rightSideView_DFS(t7);
        assertEquals(expected, actual2);
    }
}
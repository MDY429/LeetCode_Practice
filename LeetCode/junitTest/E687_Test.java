import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E687_Test {

    E687_Longest_Univalue_Path e687;
    TreeNode t1, t2, t3, t4;

    @BeforeEach
    public void init() {
        e687 = new E687_Longest_Univalue_Path();

        Integer[] a = new Integer[] { 5, 4, 5, 1, 1, 5, null, null, null, null, null, 5 };
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] { 1, 4, 5, 4, 4, 5 };
        t2 = TreeNode.build(b);

        Integer[] c = new Integer[] { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        t3 = TreeNode.build(c);

        Integer[] d = new Integer[] {};
        t4 = TreeNode.build(d);
    }

    @Test
    public void test1() {
        int expected = 3;
        int actual = e687.longestUnivaluePath(t1);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int expected = 2;
        int actual = e687.longestUnivaluePath(t2);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int expected = 4;
        int actual = e687.longestUnivaluePath(t3);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int expected = 0;
        int actual = e687.longestUnivaluePath(t4);

        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class M129_Test {

    M129_Sum_Root_to_Leaf_Numbers m129;
    TreeNode t1, t2, t3, t4;
    Integer[] a1, a2, a3, a4;

    @BeforeEach
    public void init() {
        m129 = new M129_Sum_Root_to_Leaf_Numbers();

        a1 = new Integer[] { 1, 2, 3 };
        t1 = TreeNode.build(a1);

        a2 = new Integer[] { 1, 2 };
        t2 = TreeNode.build(a2);

        a3 = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        t3 = TreeNode.build(a3);

        a4 = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7 };
        t4 = TreeNode.build(a4);
    }

    @Test
    public void M129_Test1() {
        int expected = 12 + 13;
        int actual = m129.sumNumbers(t1);
        assertEquals(expected, actual);
    }

    @Test
    public void M129_Test2() {
        int expected = 12;
        int actual = m129.sumNumbers(t2);
        assertEquals(expected, actual);
    }

    @Test
    public void M129_Test3() {
        int expected = 124 + 125 + 136 + 137;
        int actual = m129.sumNumbers(t3);
        assertEquals(expected, actual);
    }

    @Test
    public void M129_Test4() {
        int expected = 137 + 14 + 25 + 26;
        int actual = m129.sumNumbers(t4);
        assertEquals(expected, actual);
    }
}

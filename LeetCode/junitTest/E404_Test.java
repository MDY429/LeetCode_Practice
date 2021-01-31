import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class E404_Test {
    
    E404_Sum_of_Left_Leaves e404;
    TreeNode t1,t2,t3,t4,t5;
    Integer[] a1,a2,a3,a4,a5;

    @BeforeEach
    public void init() {
        e404 = new E404_Sum_of_Left_Leaves();

        a1 = new Integer[] {1,2,3,4,5};
        t1 = TreeNode.build(a1);

        a2 = new Integer[] { 1,2,3,4,5,6,7,null,null,8};
        t2 = TreeNode.build(a2);

        a3 = new Integer[] { 1 };
        t3 = TreeNode.build(a3);

        a4 = new Integer[] {1,2,null,3,null,null,null,4};
        t4 = TreeNode.build(a4);

        a5 = new Integer[] {1,null,2,null,null,null,3,null,null,null,null,null,null,null,4};
        t5 = TreeNode.build(a5);
    }

    @Test
    public void E404_Test1() {
        int expected = 4;
        int actual = e404.sumOfLeftLeaves(t1);
        int actual2 = e404.sumOfLeftLeaves_iterator(t1);

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    public void E404_Test2() {
        int expected = 18;
        int actual = e404.sumOfLeftLeaves(t2);
        int actual2 = e404.sumOfLeftLeaves_iterator(t2);

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    public void E404_Test3() {
        int expected = 0;
        int actual = e404.sumOfLeftLeaves(t3);
        int actual2 = e404.sumOfLeftLeaves_iterator(t3);

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    public void E404_Test4() {
        int expected = 4;
        int actual = e404.sumOfLeftLeaves(t4);
        int actual2 = e404.sumOfLeftLeaves_iterator(t4);

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    public void E404_Test5() {
        int expected = 0;
        int actual = e404.sumOfLeftLeaves(t5);
        int actual2 = e404.sumOfLeftLeaves_iterator(t5);

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }
}

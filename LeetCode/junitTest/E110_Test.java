import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E110_Test {

    E110_Balanced_Binary_Tree e110;
    TreeNode t1,t2,t3,t4,t5;

    @BeforeEach
    public void init() {
        e110 = new E110_Balanced_Binary_Tree();

        Integer[] arr1 = new Integer[] { 3, 9, 20, null, null, 15, 7};
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] {1, 2, 2, 3, 3, null, null, 4, 4};
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] {1, 2, 3, 4, null, null, 7, 8 };
        t3 = TreeNode.build(arr3);

        Integer[] arr4 = new Integer[] {1, 2, 3, 4, null, null, 7};
        t4 = TreeNode.build(arr4);

        Integer[] arr5 = new Integer[] {};
        t5 = TreeNode.build(arr5);
    }

    @Test
    public void E110_test1() {
        assertTrue(e110.isBalanced(t1));

        assertFalse(e110.isBalanced(t2));

        assertFalse(e110.isBalanced(t3));
        
        assertTrue(e110.isBalanced(t4));

        assertTrue(e110.isBalanced(t5));
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M114_Test {
    
    M114_Flatten_Binary_Tree_to_Linked_List m114;
    TreeNode t1,t2,t3,t4,t5,t6;

    @BeforeEach
    public void init() {
        m114 = new M114_Flatten_Binary_Tree_to_Linked_List();

        Integer[] a = new Integer[] {1,2,5,3,4};
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5};
        t2 = TreeNode.build(b);

        Integer[] c = new Integer[] {1,2,null,3,null,null,null,4,null,null,null,null,null,null,null,5};
        t3 = TreeNode.build(c);

        Integer[] d = new Integer[] {1,2,3,null,null,null,4,null,null,null,null,null,null,null,5};
        t4 = TreeNode.build(d);

        Integer[] e = new Integer[] {0};
        t5 = TreeNode.build(e);
    }


    @Test
    public void M114_test1() {        
        Integer[] arr = new Integer[] {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t1);
        assertEquals(expected, t1);
    }

    @Test
    public void M114_test2() {        
        Integer[] arr = new Integer[] {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t2);
        assertEquals(expected, t2);
    }

    @Test
    public void M114_test3() {        
        Integer[] arr = new Integer[] {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t3);
        assertEquals(expected, t3);
    }

    @Test
    public void M114_test4() {        
        Integer[] arr = new Integer[] {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t4);
        assertEquals(expected, t4);
    }

    @Test
    public void M114_test5() {        
        Integer[] arr = new Integer[] {0};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t5);
        assertEquals(expected, t5);
    }

    @Test
    public void M114_test6() {        
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        
        m114.flatten(t6);
        assertEquals(expected, t6);
    }
}
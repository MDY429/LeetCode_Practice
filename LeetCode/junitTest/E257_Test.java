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
public class E257_Test {
    
    E257_Binary_Tree_Paths e257;
    TreeNode t1,t2,t3,t4,t5;

    @BeforeEach
    public void init() {
        e257 = new E257_Binary_Tree_Paths();

        Integer[] a = new Integer[] {1,2,3,4,5,6,7,8};
        t1 = TreeNode.build(a);

        Integer[] b = new Integer[] {1,2,3,null,5};
        t2 = TreeNode.build(b);

        Integer[] c = new Integer[] {1,2,null,3,null,null,null,4};
        t3 = TreeNode.build(c);

        Integer[] d = new Integer[] {};
        t4 = TreeNode.build(d);

        Integer[] e = new Integer[] {1,null,2};
        t5 = TreeNode.build(e);
    }

    @Test
    public void E257_test1() {
        List<String> expected = new ArrayList<>(Arrays.asList("1->2->4->8","1->2->5","1->3->6","1->3->7"));
        List<String> actual = e257.binaryTreePaths(t1);
        assertEquals(expected, actual);
    }

    @Test
    public void E257_test2() {
        List<String> expected = new ArrayList<>(Arrays.asList("1->2->5","1->3"));
        List<String> actual = e257.binaryTreePaths(t2);
        assertEquals(expected, actual);
    }

    @Test
    public void E257_test3() {
        List<String> expected = new ArrayList<>(Arrays.asList("1->2->3->4"));
        List<String> actual = e257.binaryTreePaths(t3);
        assertEquals(expected, actual);
    }

    @Test
    public void E257_test4() {
        List<String> expected = new ArrayList<>();
        List<String> actual = e257.binaryTreePaths(t4);
        assertEquals(expected, actual);
    }

    @Test
    public void E257_test5() {
        List<String> expected = new ArrayList<>(Arrays.asList("1->2"));
        List<String> actual = e257.binaryTreePaths(t5);
        assertEquals(expected, actual);
    }
}
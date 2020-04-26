import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E700_Test {

    E700_Search_in_a_Binary_Search_Tree e700;
    TreeNode t1,t2,t3,t4;

    @BeforeEach
    public void init() {
        e700 = new E700_Search_in_a_Binary_Search_Tree();

        Integer[] arr1 = new Integer[] {4,2,7,1,3,6,9};
        t1 = TreeNode.build(arr1);

        Integer[] arr2 = new Integer[] {};
        t2 = TreeNode.build(arr2);

        Integer[] arr3 = new Integer[] {4,null,7,null,null,6,9};
        t3 = TreeNode.build(arr3);
    }

    @Test
    public void E700_test1() {
        Integer[] arr = new Integer[] {2,1,3};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test2() {
        Integer[] arr = new Integer[] {3};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t1, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test3() {
        Integer[] arr = new Integer[] {7,6,9};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t1, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test4() {
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t1, 99);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test5() {
        Integer[] arr = new Integer[] {4,2,7,1,3,6,9};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t1, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test6() {
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t2, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test7() {
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t3, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test8() {
        Integer[] arr = new Integer[] {4,null,7,null,null,6,9};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t3, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test9() {
        Integer[] arr = new Integer[] {7,6,9};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t3, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test10() {
        Integer[] arr = new Integer[] {6};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t3, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void E700_test11() {
        Integer[] arr = new Integer[] {};
        TreeNode expected = TreeNode.build(arr);
        TreeNode actual = e700.searchBST(t4, 2);
        assertEquals(expected, actual);
    }
}
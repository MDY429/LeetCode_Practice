import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E21_Test {

    E21_Merge_Two_Sorted_Lists e21;
    ListNode l1, l2, l3, l4, l5, l6, l7, nullNode;

    @BeforeEach
    public void init() {
        e21 = new E21_Merge_Two_Sorted_Lists();

        int[] l1Arr = new int[] { 1, 2, 3, 4, 5, 6 };
        l1 = update(l1, l1Arr);

        int[] l2Arr = new int[] { 1, 2, 3 };
        l2 = update(l2, l2Arr);

        int[] l3Arr = new int[] { 0, 1, 100 };
        l3 = update(l3, l3Arr);

        int[] l4Arr = new int[] { -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
        l4 = update(l4, l4Arr);

        nullNode = null;

    }

    public ListNode update(ListNode node, int[] val) {
        ListNode ln = null;
        for (int i = 0; i < val.length; i++) {
            if (node == null) {
                node = new ListNode(val[i]);
                ln = node;
            } else {
                if (ln.next != null) {
                    ln = ln.next;
                }
                ln.next = new ListNode(val[i]);
            }
        }

        return node;
    }

    @Test
    public void E21_test1() {
        int[] expArr = new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeTwoLists(l1, l2);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_test2() {
        int[] expArr = new int[] { 0, 1, 1, 2, 3, 4, 5, 6, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeTwoLists(l3, l1);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_test3() {
        int[] expArr = new int[] { -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 100, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeTwoLists(l3, l4);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_test4() {
        int[] expArr = new int[] { -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeTwoLists(l4, nullNode);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_test5() {
        ListNode expected = null;
        ListNode actual = e21.mergeTwoLists(nullNode, nullNode);

        assertEquals(expected, actual);
    }

    // Test Recursion
    @Test
    public void E21_recursion_test1() {
        int[] expArr = new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeRecursion(l1, l2);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_recursion_test2() {
        int[] expArr = new int[] { 0, 1, 1, 2, 3, 4, 5, 6, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeRecursion(l3, l1);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_recursion_test3() {
        int[] expArr = new int[] { -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 100, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeRecursion(l3, l4);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_recursion_test4() {
        int[] expArr = new int[] { -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
        ListNode expected = null;
        expected = update(expected, expArr);

        ListNode actual = e21.mergeRecursion(l4, nullNode);

        assertEquals(expected, actual);
    }

    @Test
    public void E21_recursion_test5() {
        ListNode expected = null;
        ListNode actual = e21.mergeRecursion(nullNode, nullNode);

        assertEquals(expected, actual);
    }
}
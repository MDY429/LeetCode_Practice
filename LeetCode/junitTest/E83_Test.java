import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E83_Test {

    E83_Remove_Duplicates_from_Sorted_List e83;
    ListNode l1, l2, l3, l4;

    @BeforeEach
    public void init() {
        e83 = new E83_Remove_Duplicates_from_Sorted_List();

        int[] num1 = new int[] {1,1,2,2,2,2,2,2,3,4,5,8,9,10,10,10,11,12,12,12,12};
        l1 = update(l1, num1);

        l2 = null;

        l3 = new ListNode(0);

        int[] num2 = new int[] {-9999,0,1,2,9999};
        l4 = update(l4, num2);
    }

    /**
     * Just for testing. Easy update a new linked list.
     */
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
    public void E83_test1() {
        int[] expArr = new int[] {1,2,3,4,5,8,9,10,11,12};
        ListNode expected = null;
        expected = update(expected, expArr);
        ListNode actual= e83.deleteDuplicates(l1);
        assertEquals(expected, actual);
    }

    @Test
    public void E83_test2() {
        ListNode expected = null;
        ListNode actual= e83.deleteDuplicates(l2);
        assertEquals(expected, actual);
    }

    @Test
    public void E83_test3() {
        ListNode expected = new ListNode(0);
        ListNode actual= e83.deleteDuplicates(l3);
        assertEquals(expected, actual);
    }

    @Test
    public void E83_test4() {
        int[] expArr = new int[] {-9999,0,1,2,9999};
        ListNode expected = null;
        expected = update(expected, expArr);
        ListNode actual= e83.deleteDuplicates(l4);
        assertEquals(expected, actual);
    }
}
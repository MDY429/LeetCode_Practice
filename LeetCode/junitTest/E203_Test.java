import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E203_Test {

    E203_Remove_Linked_List_Elements e203;
    ListNode l1, l2, l3, l4, l5;

    @BeforeEach
    public void init() {
        e203 = new E203_Remove_Linked_List_Elements();

        int[] a = new int[] { 1, 2, 6, 3, 4, 5, 6 };
        l1 = ListNode.build(a);

        int[] b = new int[] { 1, 1, 2, 3 };
        l2 = ListNode.build(b);

        int[] c = new int[] { 1, 2, 3, 4, 4, 4 };
        l3 = ListNode.build(c);

        int[] d = new int[] { 1 };
        l4 = ListNode.build(d);

        int[] e = new int[] {};
        l5 = ListNode.build(e);
    }

    @Test
    public void E203_test1() {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int val = 6;
        ListNode expected = ListNode.build(arr);
        ListNode actual = e203.removeElements(l1, val);
        assertEquals(expected, actual);
    }

    @Test
    public void E203_test2() {
        int[] arr = new int[] { 2, 3 };
        int val = 1;
        ListNode expected = ListNode.build(arr);
        ListNode actual = e203.removeElements(l2, val);
        assertEquals(expected, actual);
    }

    @Test
    public void E203_test3() {
        int[] arr = new int[] { 1, 2, 3 };
        int val = 4;
        ListNode expected = ListNode.build(arr);
        ListNode actual = e203.removeElements(l3, val);
        assertEquals(expected, actual);
    }

    @Test
    public void E203_test4() {
        int[] arr = new int[] {};
        int val = 1;
        ListNode expected = ListNode.build(arr);
        ListNode actual = e203.removeElements(l4, val);
        assertEquals(expected, actual);
    }

    @Test
    public void E203_test5() {
        int[] arr = new int[] {};
        int val = 1;
        ListNode expected = ListNode.build(arr);
        ListNode actual = e203.removeElements(l5, val);
        assertEquals(expected, actual);
    }
}
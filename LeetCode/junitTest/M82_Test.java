import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M82_Test {
    M82_Remove_Duplicates_from_Sorted_List_II m82;
    ListNode l1, l2, l3, l4, l5, l6;

    @BeforeEach
    public void init() {
        m82 = new M82_Remove_Duplicates_from_Sorted_List_II();

        int[] a = new int[] { 1, 2, 3, 4, 5 };
        l1 = ListNode.build(a);

        int[] b = new int[] { 1, 2, 2, 2, 3, 4, 5, 5 };
        l2 = ListNode.build(b);

        int[] c = new int[] { 1, 1, 1, 1, 2, 3, 4 };
        l3 = ListNode.build(c);

        int[] d = new int[] { 1, 1, 2, 2, 3, 3, 4, 4 };
        l4 = ListNode.build(d);

        int[] e = new int[] { 1 };
        l5 = ListNode.build(e);

        int[] f = new int[] {};
        l6 = ListNode.build(f);
    }

    @Test
    public void M82_test1() {
        int[] val = new int[] { 1, 2, 3, 4, 5 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l1);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l1);
        assertEquals(expected, actual2);
    }

    @Test
    public void M82_test2() {
        int[] val = new int[] { 1, 3, 4 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l2);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l2);
        assertEquals(expected, actual2);
    }

    @Test
    public void M82_test3() {
        int[] val = new int[] { 2, 3, 4 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l3);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l3);
        assertEquals(expected, actual2);
    }

    @Test
    public void M82_test4() {
        int[] val = new int[] {};
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l4);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l4);
        assertEquals(expected, actual2);
    }

    @Test
    public void M82_test5() {
        int[] val = new int[] { 1 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l5);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l5);
        assertEquals(expected, actual2);
    }

    @Test
    public void M82_test6() {
        int[] val = new int[] {};
        ListNode expected = ListNode.build(val);
        ListNode actual = m82.deleteDuplicates(l6);
        assertEquals(expected, actual);

        ListNode actual2 = m82.deleteDuplicates_recursive(l6);
        assertEquals(expected, actual2);
    }
}
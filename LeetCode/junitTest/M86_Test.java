import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M86_Test {

    M86_Partition_List m86 = new M86_Partition_List();

    @Test
    public void M86_test1() {
        int[] a = new int[] { 1, 4, 3, 2, 5, 2 };
        ListNode org = ListNode.build(a);
        int[] b = new int[] { 1, 2, 2, 4, 3, 5 };
        ListNode expected = ListNode.build(b);
        int x = 3;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }

    @Test
    public void M86_test2() {
        int[] a = new int[] {};
        ListNode org = ListNode.build(a);
        int[] b = new int[] {};
        ListNode expected = ListNode.build(b);
        int x = 3;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }

    @Test
    public void M86_test3() {
        int[] a = new int[] { 1, 3, 0, 5, 2, 1, 4, 3, 0, 1 };
        ListNode org = ListNode.build(a);
        int[] b = new int[] { 1, 0, 2, 1, 0, 1, 3, 5, 4, 3 };
        ListNode expected = ListNode.build(b);
        int x = 3;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }

    @Test
    public void M86_test4() {
        int[] a = new int[] { 2, 1 };
        ListNode org = ListNode.build(a);
        int[] b = new int[] { 2, 1 };
        ListNode expected = ListNode.build(b);
        int x = 3;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }

    @Test
    public void M86_test5() {
        int[] a = new int[] { 2, 1 };
        ListNode org = ListNode.build(a);
        int[] b = new int[] { 1, 2 };
        ListNode expected = ListNode.build(b);
        int x = 2;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }

    @Test
    public void M86_test6() {
        int[] a = new int[] { 6, 5, 4, 3, 2, 1 };
        ListNode org = ListNode.build(a);
        int[] b = new int[] { 2, 1, 6, 5, 4, 3 };
        ListNode expected = ListNode.build(b);
        int x = 3;
        ListNode actual = m86.partition(org, x);
        assertEquals(expected, actual);

    }
}
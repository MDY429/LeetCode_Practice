import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M148_Test {

    M148_Sort_List m148;
    ListNode l1, l2, l3, l4, l5;

    @BeforeEach
    public void init() {
        m148 = new M148_Sort_List();

        int[] a = new int[] { 5, 4, 3, 2, 1 };
        l1 = ListNode.build(a);

        int[] b = new int[] { 99, -99, 5, -5, 10, -10, 0, -9 };
        l2 = ListNode.build(b);

        int[] c = new int[] { -5, -8, -72, -3, -2, -99 };
        l3 = ListNode.build(c);

        int[] d = new int[] { 1, 2, 3, 4, 5 };
        l4 = ListNode.build(d);

        l5 = null;
    }

    @Test
    public void M148_test1() {
        int[] val = new int[] { 1, 2, 3, 4, 5 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m148.sortList(l1);
        assertEquals(expected, actual);
    }

    @Test
    public void M148_test2() {
        int[] val = new int[] { -99, -10, -9, -5, 0, 5, 10, 99 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m148.sortList(l2);
        assertEquals(expected, actual);
    }

    @Test
    public void M148_test3() {
        int[] val = new int[] { -99, -72, -8, -5, -3, -2 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m148.sortList(l3);
        assertEquals(expected, actual);
    }

    @Test
    public void M148_test4() {
        int[] val = new int[] { 1, 2, 3, 4, 5 };
        ListNode expected = ListNode.build(val);
        ListNode actual = m148.sortList(l4);
        assertEquals(expected, actual);
    }

    @Test
    public void M148_test5() {
        ListNode expected = null;
        ListNode actual = m148.sortList(l5);
        assertEquals(expected, actual);
    }

}
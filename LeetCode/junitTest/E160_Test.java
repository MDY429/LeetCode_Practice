import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E160_Test {

    E160_Intersection_of_Two_Linked_Lists e160;
    ListNode A1, B1, C1, A2, B2, C3, A3, B3, A4, B4;

    @BeforeEach
    public void init() {
        e160 = new E160_Intersection_of_Two_Linked_Lists();

        int[] a1 = new int[] { 4, 1 };
        A1 = ListNode.build(a1);
        int[] b1 = new int[] { 5, 0, 1 };
        B1 = ListNode.build(b1);
        int[] c1 = new int[] { 8, 4, 5 };
        C1 = ListNode.build(c1);

        ListNode tmp = A1;
        if (A1 != null && C1 != null) {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = C1;
        }

        if (A1 != null && C1 != null) {
            tmp = B1;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = C1;
        }

        int[] a2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        A2 = ListNode.build(a2);
        int[] b2 = new int[] { 5 };
        B2 = ListNode.build(b2);

        int[] c3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        C3 = ListNode.build(c3);
        A3 = C3;
        B3 = C3;

    }

    @Test
    public void E160_test1() {
        ListNode expected = C1;
        ListNode actual = e160.getIntersectionNode(A1, B1);
        assertEquals(expected, actual);
    }

    @Test
    public void E160_test2() {
        ListNode expected = null;
        ListNode actual = e160.getIntersectionNode(A2, B2);
        assertEquals(expected, actual);
    }

    @Test
    public void E160_test3() {
        ListNode expected = C3;
        ListNode actual = e160.getIntersectionNode(A3, B3);
        assertEquals(expected, actual);
    }

    @Test
    public void E160_test4() {
        ListNode expected = null;
        ListNode actual = e160.getIntersectionNode(A4, B4);
        assertEquals(expected, actual);
    }
}
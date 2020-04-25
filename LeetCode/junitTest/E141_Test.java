import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E141_Test {

    E141_Linked_List_Cycle e141;
    ListNode head, a, b, c, n;

    @BeforeEach
    public void init() {
        e141 = new E141_Linked_List_Cycle();

        head = new ListNode(1);
        a = new ListNode(2);
        b = new ListNode(3);
        c = new ListNode(4);
        head.next = a;
        a.next = b;
        b.next = c;
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> null
     */
    @Test
    public void E141_test1() {
        assertFalse(e141.hasCycle(head));
    }

    /**
     * 1 -> 2 -> 3 -> 4 ->
     *      |____________|
     */
    @Test
    public void E141_test2() {
        c.next = a;
        assertTrue(e141.hasCycle(head));
    }

    /**
     * 1 -> 2 -> 3 -> 4 ->
     *           |_______|
     */
    @Test
    public void E141_test3() {
        c.next = b;
        assertTrue(e141.hasCycle(head));
    }

    /**
     * 1 -> 2 -> 3 -> 4 ->
     *                |__|
     */
    @Test
    public void E141_test4() {
        c.next = c;
        assertTrue(e141.hasCycle(head));
    }

    /**
     * 1 -> 2 -> 3 -> 4 ->
     * |_________________|
     */
    @Test
    public void E141_test5() {
        c.next = head;
        assertTrue(e141.hasCycle(head));
    }


    /**
     * 1 -> 
     * |__|
     */
    @Test
    public void E141_test6() {
        head.next = head;
        assertTrue(e141.hasCycle(head));
    }

    /**
     *  null
     */
    @Test
    public void E141_test7() {
        assertFalse(e141.hasCycle(n));
    }

    /**
     * 1 -> 2 -> null
     */
    @Test
    public void E141_test8() {
        a.next = null;
        assertFalse(e141.hasCycle(head));
    }
}
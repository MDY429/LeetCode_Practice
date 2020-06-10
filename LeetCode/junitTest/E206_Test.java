import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E206_Test {
    
    E206_Reverse_Linked_List e206;
    ListNode l1,l2,l3,l4;

    @BeforeEach
    public void init() {
        e206 = new E206_Reverse_Linked_List();

        int[] a = new int[] {1,2,3,4,5};
        l1 = ListNode.build(a);

        int[] b = new int[] {-9,10,-55,1000,3,57};
        l2 = ListNode.build(b);

        int[] c = new int[] {0};
        l3 = ListNode.build(c);

        int[] d = new int[] {};
        l4 = ListNode.build(d);
    }

    @Test
    public void E206_iterator1() {
        int[] val = new int[] {5,4,3,2,1};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList(l1);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_iterator2() {
        int[] val = new int[] {57,3,1000,-55,10,-9};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList(l2);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_iterator3() {
        int[] val = new int[] {0};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList(l3);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_iterator4() {
        int[] val = new int[] {};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList(l4);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_recursion1() {
        int[] val = new int[] {5,4,3,2,1};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList_recursion(l1);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_recursion2() {
        int[] val = new int[] {57,3,1000,-55,10,-9};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList_recursion(l2);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_recursion3() {
        int[] val = new int[] {0};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList_recursion(l3);
        assertEquals(expected, actual);
    }

    @Test
    public void E206_recursion4() {
        int[] val = new int[] {};
        ListNode expected = ListNode.build(val);
        ListNode actual = e206.reverseList_recursion(l4);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M92_Test {

    M92_Reverse_Linked_List_II m92;
    ListNode l1;

    @BeforeEach
    public void init() {

        m92 = new M92_Reverse_Linked_List_II();

        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        l1 = ListNode.build(a);
    }

    @Test
    public void M92_test1() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test2() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 5, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test3() {
        int[] expArr = { 1, 5, 4, 3, 2, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 2, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test4() {
        int[] expArr = { 3, 2, 1, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 1, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test5() {
        int[] expArr = { 7, 6, 5, 4, 3, 2, 1 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 1, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test6() {
        int[] expArr = { 1, 2, 3, 7, 6, 5, 4 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 4, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_test7() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween(l1, 8, 10);
        assertEquals(expected, actual);
    }

    // Method2
    @Test
    public void M92_Method2_test1() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test2() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 5, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test3() {
        int[] expArr = { 1, 5, 4, 3, 2, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 2, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test4() {
        int[] expArr = { 3, 2, 1, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 1, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test5() {
        int[] expArr = { 7, 6, 5, 4, 3, 2, 1 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 1, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test6() {
        int[] expArr = { 1, 2, 3, 7, 6, 5, 4 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 4, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void M92_Method2_test7() {
        int[] expArr = { 1, 2, 3, 4, 5, 6, 7 };
        ListNode expected = ListNode.build(expArr);
        ListNode actual = m92.reverseBetween2(l1, 8, 10);
        assertEquals(expected, actual);
    }
}
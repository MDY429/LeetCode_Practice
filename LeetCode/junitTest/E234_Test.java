import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E234_Test {

    E234_Palindrome_Linked_List e234;
    ListNode l1, l2, l3, l4, l5, l6, l7;

    @BeforeEach
    public void init() {
        e234 = new E234_Palindrome_Linked_List();

        int[] a = new int[] { 1, 2, 3, 3, 2, 1 };
        l1 = ListNode.build(a);

        int[] b = new int[] { 1, 2, 3, 4, 3, 2, 1 };
        l2 = ListNode.build(b);

        int[] c = new int[] { 1, 2, 3 };
        l3 = ListNode.build(c);

        int[] d = new int[] { 1, 1 };
        l4 = ListNode.build(d);

        int[] e = new int[] { 1 };
        l5 = ListNode.build(e);

        int[] f = new int[] {};
        l6 = ListNode.build(f);

        int[] g = new int[] { 1, 3, 5, 1, 3, 5 };
        l7 = ListNode.build(g);
    }

    @Test
    public void E234_test() {
        assertTrue(e234.isPalindrome(l1));
        assertTrue(e234.isPalindrome(l2));
        assertFalse(e234.isPalindrome(l3));
        assertTrue(e234.isPalindrome(l4));
        assertTrue(e234.isPalindrome(l5));
        assertTrue(e234.isPalindrome(l6));
        assertFalse(e234.isPalindrome(l7));
    }
}
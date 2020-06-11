/**
 * url: https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Example 1: Input: 1->2 Output: false
 * 
 * Example 2: Input: 1->2->2->1 Output: true
 * 
 * Follow up: Could you do it in O(n) time and O(1) space?
 */
public class E234_Palindrome_Linked_List {

    /**
     * Split the list, one is start with head, the other start with middle. Reverse
     * one of them and compare the sequence.
     * 
     * @param head The input of list node.
     * @return Boolean.
     */
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Use two point to separate two lists.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pNext = null;
        ListNode pPrevious = null;

        // Reverse the first part list.
        while (slow != null) {
            pNext = slow.next;
            slow.next = pPrevious;
            pPrevious = slow;
            slow = pNext;
        }

        ListNode cursor = head;

        // Compare two list.
        while (pPrevious != null) {
            if (cursor.val != pPrevious.val) {
                return false;
            }
            cursor = cursor.next;
            pPrevious = pPrevious.next;
        }

        return true;
    }

    public static void main(String[] args) {
        E234_Palindrome_Linked_List e234 = new E234_Palindrome_Linked_List();

        int[] val = new int[] { 1, 2, 3, 3, 2, 1 };
        ListNode head = ListNode.build(val);
        System.out.println(e234.isPalindrome(head));
    }
}
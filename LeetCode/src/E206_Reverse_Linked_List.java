/**
 * url: https://leetcode.com/problems/reverse-linked-list/
 * 
 * Reverse a singly linked list.
 * 
 * Example:
 * 
 * Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL
 * 
 * Follow up: A linked list can be reversed either iteratively or recursively.
 * Could you implement both?
 */
public class E206_Reverse_Linked_List {

    /**
     * Use iterator to reverse the linked list.
     * 
     * @param head The input of list node.
     * @return reversed list
     */
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode next = current;
        ListNode previous = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    /**
     * Use recursion to reverse the linked list.
     * 
     * @param head The input of list node.
     * @return reversed list
     */
    public ListNode reverseList_recursion(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode node = reverseList_recursion(head.next);
        head.next.next = head;
        head.next = null;

        return node;
    }

    public static void main(String[] args) {

        E206_Reverse_Linked_List e206 = new E206_Reverse_Linked_List();
        int[] val = new int[] { 1, 2, 3, 4, 5 };
        ListNode head = ListNode.build(val);

        e206.reverseList(head).printNode();
        // e206.reverseList_recursion(head).printNode();
    }
}
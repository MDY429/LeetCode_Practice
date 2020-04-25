/**
 * url: https://leetcode.com/problems/linked-list-cycle/
 * 
 * Given a linked list, determine if it has a cycle in it.
 * 
 * To represent a cycle in the given linked list, we use an integer pos which
 * represents the position (0-indexed) in the linked list where tail connects
 * to. If pos is -1, then there is no cycle in the linked list.
 * 
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1 Output: true Explanation: There is a cycle
 * in the linked list, where tail connects to the second node.
 * 
 * Example 2:
 * Input: head = [1,2], pos = 0 Output: true 
 * Explanation: 
 * There is a cycle in the linked list, where tail connects to the first node.
 * 
 * Example 3:
 * Input: head = [1], pos = -1 Output: false 
 * Explanation: 
 * There is no cycle in the linked list.
 */
public class E141_Linked_List_Cycle {

    /**
     * Input a linked list, check whether is partial circle.
     * 
     * @param head The input of linked list
     * @return Boolean
     */
    public boolean hasCycle(ListNode head) {

        // If head or next of head is null, this list isn't a circle linked list.
        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (first != second) {
            /*
             * If the second pointer or next of second pointer, this list isn't linked list.
             */
            if (second == null || second.next == null) {
                return false;
            }

            // Second element has to be faster than first.
            first = first.next;
            second = second.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        E141_Linked_List_Cycle e141 = new E141_Linked_List_Cycle();

        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = a;

        System.out.println(e141.hasCycle(head));

    }
}
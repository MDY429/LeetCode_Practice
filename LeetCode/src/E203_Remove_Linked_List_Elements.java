/**
 * url: https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example:
 * 
 * Input: 1->2->6->3->4->5->6, val = 6 Output: 1->2->3->4->5
 */
public class E203_Remove_Linked_List_Elements {

    /**
     * To remove the assigned val in the list.
     * 
     * @param head The input of list
     * @param val  The remove value.
     * @return The remove list.
     */
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode p = new ListNode();
        p.next = head;
        ListNode a = head;
        ListNode l = p;

        while (a != null) {
            if (a.val == val) {
                p.next = a.next;
            } else {
                p = a;
            }

            a = a.next;
        }

        return l.next;
    }

    public static void main(String[] args) {
        E203_Remove_Linked_List_Elements e203 = new E203_Remove_Linked_List_Elements();
        int[] a = new int[] { 1, 2, 6, 3, 4, 5, 6 };
        ListNode head = ListNode.build(a);

        int val = 6;
        ListNode.printList(e203.removeElements(head, val));
    }
}
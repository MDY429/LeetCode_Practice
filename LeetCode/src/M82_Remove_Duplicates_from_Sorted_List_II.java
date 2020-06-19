/**
 * url: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * 
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * Return the linked list sorted as well.
 * 
 * Example 1: Input: 1->2->3->3->4->4->5 Output: 1->2->5
 * 
 * Example 2: Input: 1->1->1->2->3 Output: 2->3
 */
public class M82_Remove_Duplicates_from_Sorted_List_II {

    /**
     * Use iterator and create ne node to connect head list to skip the duplicated
     * element.
     * 
     * @param head The input of ListNode.
     * @return The list of delete duplicates elements.
     */
    public ListNode deleteDuplicates(ListNode head) {

        ListNode list = new ListNode();
        list.next = head;

        ListNode p = list;
        ListNode c = head;

        while (c != null) {
            ListNode next = c.next;
            if (next != null && c.val == next.val) {
                while (c != null && c.val == next.val) {
                    c = c.next;
                }
                p.next = c;
            } else {
                p = c;
                c = c.next;
            }
        }

        return list.next;
    }

    /**
     * Use recursion to skip the duplicated element.
     * 
     * @param head The input of ListNode.
     * @return The list of delete duplicates elements.
     */
    public ListNode deleteDuplicates_recursive(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = deleteDuplicates_recursive(head.next);

        if (node != null && head.val == node.val) {
            head = head.next;
            return node.next;
        } else if (head.next.val == head.val) {
            return node;
        } else {
            head.next = node;
            return head;
        }

    }

    public static void main(String[] args) {
        M82_Remove_Duplicates_from_Sorted_List_II m82 = new M82_Remove_Duplicates_from_Sorted_List_II();

        int[] val = new int[] { 1, 2, 3, 4, 4, 4 };
        ListNode head = ListNode.build(val);
        ListNode.printList(m82.deleteDuplicates(head));
        // ListNode.printList(m82.deleteDuplicates_recursive(head));
    }
}
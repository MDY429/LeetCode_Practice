/**
 * url: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1:
 * Input: 1->1->2 Output: 1->2
 * 
 * Example 2:
 * Input: 1->1->2->3->3 Output: 1->2->3
 */
public class E83_Remove_Duplicates_from_Sorted_List {

    /**
     * Remove duplicated elements.
     * @param head The input of linked list.
     * @return Liked list without duplicated elements.
     */
    public ListNode deleteDuplicates(ListNode head) {

        ListNode cursor = head;
        while (cursor != null && cursor.next != null) {
            if (cursor.val == cursor.next.val) {
                cursor.next = cursor.next.next;
            } else {
                cursor = cursor.next;
            }
        }

        return head;
    }

    /**
     * Just for testing. Easy update a new linked list.
     */
    public ListNode update(ListNode node, int[] val) {
        ListNode ln = null;
        for (int i = 0; i < val.length; i++) {
            if (node == null) {
                node = new ListNode(val[i]);
                ln = node;
            } else {
                if (ln.next != null) {
                    ln = ln.next;
                }
                ln.next = new ListNode(val[i]);
            }
        }

        return node;
    }

    public static void main(String[] args) {
        E83_Remove_Duplicates_from_Sorted_List e83 = new E83_Remove_Duplicates_from_Sorted_List();

        int[] aa = new int[] { 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6 };
        ListNode head = null;
        head = e83.update(head, aa);

        e83.deleteDuplicates(head).printNode();

    }
}
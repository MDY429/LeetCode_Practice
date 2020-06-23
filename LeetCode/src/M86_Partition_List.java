/**
 * url: https://leetcode.com/problems/partition-list/
 * 
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * Example:
 * 
 * Input: head = 1->4->3->2->5->2, x = 3 Output: 1->2->2->4->3->5
 */
public class M86_Partition_List {

    /**
     * To move the number which smaller than x to the front.
     * 
     * @param head The input of list
     * @param x    The indicated number
     * @return The new list
     */
    public ListNode partition(ListNode head, int x) {

        ListNode list = new ListNode();
        list.next = head;
        ListNode p1 = list;
        ListNode c = head;
        ListNode c2 = head;
        Boolean meet = false;

        while (c != null) {
            if (c.val >= x) {
                meet = true;
            }
            ListNode next = c.next;
            if (next != null && c.val > next.val && x > next.val && meet) {
                ListNode tmp = next.next;
                p1.next = next;
                next.next = c2;
                c.next = tmp;

                p1 = next;
            } else {
                if (!(c.val >= x)) {
                    p1 = c;
                    c2 = p1.next;
                }
                c = c.next;
            }

        }

        return list.next;
    }

    public static void main(String[] args) {
        M86_Partition_List m86 = new M86_Partition_List();
        int[] val = new int[] { 2, 1 };
        int x = 3;
        ListNode head = ListNode.build(val);
        ListNode.printList(m86.partition(head, x));
    }
}
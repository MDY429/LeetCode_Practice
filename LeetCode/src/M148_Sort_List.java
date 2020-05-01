/**
 * url: https://leetcode.com/problems/sort-list/
 * 
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * Example 1:
 * 
 * Input: 4->2->1->3 Output: 1->2->3->4
 * 
 * Example 2:
 * 
 * Input: -1->5->3->4->0 Output: -1->0->3->4->5
 * 
 * Reference:
 * 
 * Bottom-Up Merge Sort:
 * https://www.coursera.org/lecture/algorithms-part1/bottom-up-mergesort-PWNEl
 * 
 * LeetCode Discussion:
 * https://leetcode.com/problems/sort-list/discuss/268268/Meeting-the-O(1)-requirement
 * https://leetcode.com/problems/sort-list/discuss/172545/Java-iterative-O(1)-space-O(nlogn)-time-solution
 */
public class M148_Sort_List {

    public ListNode sortList(ListNode head) {
        
        if (head == null) {
            return null;
        }

        int len = 0;
        for (ListNode a = head; a != null; a = a.next) {
            len++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode node, p, pEnd, q, qEnd;

        for (int sz = 1; sz < len; sz = sz + sz) {
            node = dummy;
            p = dummy.next;

            while (p != null) {
                pEnd = p;
                for (int i = 0; i < sz && pEnd != null; i++) {
                    pEnd = pEnd.next;
                }

                q = pEnd;
                qEnd = q;
                for (int i = 0; i < sz && qEnd != null; i++) {
                    qEnd = qEnd.next;
                }

                while (p != pEnd && q != qEnd) {
                    if (p.val <= q.val) {
                        node.next = p;
                        p = p.next;
                    } else {
                        node.next = q;
                        q = q.next;
                    }
                    node = node.next;
                }

                if (p != pEnd) {
                    node.next = p;
                    while (node.next != pEnd) {
                        node = node.next;
                    }
                }

                if (q != qEnd) {
                    node.next = q;
                    while (node.next != qEnd) {
                        node = node.next;
                    }
                }

                p = qEnd;
            }

            node.next = null;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        M148_Sort_List m148 = new M148_Sort_List();

        int[] val = new int[] { 5, 4, 3, 2, 1 };
        ListNode head = ListNode.build(val);

        m148.sortList(head).printNode();
    }
}
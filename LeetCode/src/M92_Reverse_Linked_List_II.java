/**
 * url: https://leetcode.com/problems/reverse-linked-list-ii/
 * 
 * Reverse a linked list from position m to n. Do it in one-pass.
 * 
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * 
 * Example:
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4 Output: 1->4->3->2->5->NULL
 */
public class M92_Reverse_Linked_List_II {

    /**
     * Exchange every time and find the list again until (n - m) >= 1
     * 
     * @param head The input of List Node.
     * @param m    The first position of List Node.
     * @param n    The second position of List Node.
     * @return The partial reverse List.
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (m > n || m == n) {
            // Do not need to change.
            return head;
        }

        ListNode a = head;
        ListNode first, second, preFirst, preSecond;
        for (int i = 1, j = 1; (n - m) >= 1; m++, n--) {
            i = 1;
            j = 1;
            first = head;
            second = head;
            preFirst = null;
            preSecond = null;

            // Find the first node. (m)
            while (i < m && first.next != null) {
                preFirst = first;
                first = first.next;
                i++;
            }

            // Find the second node. (n)
            while (j < n && second.next != null) {
                preSecond = second;
                second = second.next;
                j++;
            }

            if (m > i || n > j) {
                break;
            }

            // set preFirst
            if (preFirst != null)
                preFirst.next = second;
            else {
                a = second;
            }
            if (preSecond != null)
                preSecond.next = first;
            else {
                a = first;
            }

            // SWAP
            ListNode tmp = first.next;
            first.next = second.next;
            second.next = tmp;

            head = a;
        }

        return head;
    }

    /**
     * Reverse part of list and append it in the end.
     * 
     * @param head The input of List Node.
     * @param m    The first position of List Node.
     * @param n    The second position of List Node.
     * @return The partial reverse List.
     */
    public ListNode reverseBetween2(ListNode head, int m, int n) {
        if (m > n || m == n) {
            // Do not need to change.
            return head;
        }

        ListNode start = head;
        ListNode preStart = null;

        // Find the start node. (m)
        while (--m > 0 && start != null) {
            preStart = start;
            start = start.next;
            n--;
        }

        // Find the end node. (n+1)
        ListNode end = start;
        while (n-- > 0 && end != null) {
            end = end.next;
        }

        // Make a reverse list.
        ListNode reverse = end;
        while (start != end) {
            ListNode tmp = start.next;
            start.next = reverse;
            reverse = start;
            start = tmp;
        }

        if (preStart != null) {
            // If not null, append it.
            preStart.next = reverse;
        } else {
            head = reverse;
        }

        return head;
    }

    public static void main(String[] args) {

        M92_Reverse_Linked_List_II m92 = new M92_Reverse_Linked_List_II();
        int m = 2;
        int n = 5;
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        ListNode head = ListNode.build(a);
        head.printNode();
        m92.reverseBetween2(head, m, n).printNode();
    }

}
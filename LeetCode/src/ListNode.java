/**
 * Definition for singly-linked list.
 * 
 * This is for E21, E83.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    // For LeetCode 148.
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * This is for JUnit to test assert equal.
     */
    @Override
    public boolean equals(Object o) {
        ListNode list = (ListNode) o;
        ListNode a = this;
        while (a != null || list != null) {
            if (a == null) {
                return false;
            } else if (list == null) {
                return false;
            } else if (a.val != list.val) {
                return false;
            } else {
                a = a.next;
                list = list.next;
            }
        }

        return true;
    }

    /**
     * Just for testing print the node.
     */
    public void printNode() {
        ListNode a = this;
        while (a != null) {

            if (a.next == null)
                System.out.print(a.val + "\n");
            else
                System.out.print(a.val + " -> ");

            a = a.next;
        }
    }

    /**
     * Just for testing. Easy build a new linked list.
     */
    public static ListNode build(int[] val) {
        ListNode root = new ListNode(val[0]);
        ListNode ln = root;
        for (int i = 1; i < val.length; i++) {
            if (ln.next != null) {
                ln = ln.next;
            }
            ln.next = new ListNode(val[i]);
        }

        return root;
    }

    /**
     * Just for testing print the node.
     */
    public static void printList(ListNode list) {
        ListNode a = list;
        while (a != null) {

            if (a.next == null)
                System.out.print(a.val + "\n");
            else
                System.out.print(a.val + " -> ");

            a = a.next;
        }
    }

}

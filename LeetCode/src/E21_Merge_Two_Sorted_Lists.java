/**
 * url:https://leetcode.com/problems/merge-two-sorted-lists
 * 
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * Input: 1->2->4, 1->3->4 
 * Output: 1->1->2->3->4->4
 */
public class E21_Merge_Two_Sorted_Lists {

    /**
     * Merger two list node.
     * @param l1 The first input of ListNode.
     * @param l2 The second input of ListNode
     * @return The ListNode.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = null;
        ListNode cursor = null;

        // Running until l1 and l2 are null.
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                if (ans == null) {
                    ans = l2;
                } else {
                    cursor.next = l2;
                }
                return ans;
            } else if (l2 == null) {
                if (ans == null) {
                    ans = l1;
                } else {
                    cursor.next = l1;
                }
                return ans;
            } else if (l1.val <= l2.val) {
                if (ans == null) {
                    ans = new ListNode(l1.val);
                    cursor = ans;
                } else {
                    cursor.next = new ListNode(l1.val);
                }
                l1 = l1.next;
            } else {
                if (ans == null) {
                    ans = new ListNode(l2.val);
                    cursor = ans;
                } else {
                    cursor.next = new ListNode(l2.val);
                }
                l2 = l2.next;
            }

            if (cursor.next != null) {
                cursor = cursor.next;
            }
        }

        return ans;
    }

    /**
     * Just for testing print the node.
     * @param l The input of ListNode.
     */
    public void printNode(ListNode l) {
        ListNode a = l;
        while(a!=null){
            
            if(a.next == null)
                System.out.print(a.val + "\n");
            else
                System.out.print(a.val + " -> ");

            a = a.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(15);

        // ListNode l2 = new ListNode(5);
        // l2.next = new ListNode(10);
        ListNode l2 = null;

        E21_Merge_Two_Sorted_Lists a = new E21_Merge_Two_Sorted_Lists();
        
        ListNode ans = a.mergeTwoLists(l1, l2);
        a.printNode(l1);
        a.printNode(l2);
        a.printNode(ans);

    }
}

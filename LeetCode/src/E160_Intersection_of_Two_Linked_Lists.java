/**
 * url: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * Write a program to find the node at which the intersection of two singly
 * linked lists begins.
 * 
 * Notes:
 * 
 * 1. If the two linked lists have no intersection at all, return null.
 * 2. The linked lists must retain their original structure after the function returns.
 * 3. You may assume there are no cycles anywhere in the entire linked structure.
 * 4. Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class E160_Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;
        ListNode endA = null;
        ListNode endB = null;

        while (true) {

            if (pA == pB) {
                return pA;
            }

            if (pA.next == null) {
                endA = pA;
                pA = headA;
            } else {
                pA = pA.next;
            }

            if (pB.next == null) {
                endB = pB;
                pB = headB;
            } else {
                pB = pB.next;
            }

            if (endA != endB && endA != null && endB != null) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        E160_Intersection_of_Two_Linked_Lists e160 = new E160_Intersection_of_Two_Linked_Lists();
        int[] a = new int[] { 4, 1 };
        int[] b = new int[] { 5, 0, 1 };
        int[] c = new int[] { 8, 4, 5 };

        ListNode headA = ListNode.build(a);
        ListNode headB = ListNode.build(b);
        ListNode C = ListNode.build(c);

        ListNode tmp = headA;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = C;

        tmp = headB;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = C;

        headA.printNode();
        headB.printNode();

        ListNode.printList(e160.getIntersectionNode(headA, headB));
    }
}
/**
 * Definition for singly-linked list.
 * 
 * This is for E21.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    /**
     * This is for JUnit to test assert equal.
     */
    @Override
    public boolean equals(Object o) {
        ListNode list = (ListNode) o;
        ListNode a =this;
        while (a != null || list != null) {
            if(a == null){
                return false;
            }
            else if (list == null) {
                return false;
            }
            else if(a.val != list.val){
                return false;
            }
            else{
                a = a.next;
                list = list.next;
            }
        }
        
        return true;
    }
}

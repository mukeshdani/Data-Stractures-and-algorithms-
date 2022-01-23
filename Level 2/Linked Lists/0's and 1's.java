//0's and 1's

//https://www.interviewbit.com/problems/sort-binary-linked-list/

public class Solution {
    public ListNode solve(ListNode head) {

        ListNode lHead = new ListNode(-1);
        ListNode lTail = lHead;
        
           ListNode rHead = new ListNode(-1);
        ListNode rTail = rHead;
        
        while ( head != null){
            if ( head.val == 0){
                lTail.next =  head;
                lTail = head;
            }else {
                rTail.next = head ; 
                rTail = head;
            }
            head = head.next;
        }
        
        lTail.next = rHead.next;
        rTail.next = null;
        return lHead.next;
    }
}

//Linked List Cycle II
//https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head, fast =head;
 
        while (fast!=null && fast.next != null){
           slow = slow.next;
            fast = fast.next.next;
            
            if ( slow == fast ) break;// detected 
        }
        
        
        if (fast==null || fast.next == null ){
            return null;
        }
        
        ListNode curr1=head , curr2= slow;
        
        while ( curr1 != curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr1;
    }
}


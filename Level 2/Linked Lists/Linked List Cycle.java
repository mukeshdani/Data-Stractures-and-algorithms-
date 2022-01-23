//Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/

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
    public boolean hasCycle(ListNode head) {
        if ( head == null || head.next == null){// 0 node and 1 node
            return false ;
        }
        
        if ( head.next == head ){  // self refrencial Node
            return true;
        }
     ListNode slow = head, fast =head;
 
        while (fast!=null && fast.next != null){
           slow = slow.next;
            fast = fast.next.next;
            
            if ( slow == fast )return true;// detected 
        }
    return false;}
}
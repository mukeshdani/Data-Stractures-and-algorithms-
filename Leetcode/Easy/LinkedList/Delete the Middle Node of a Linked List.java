//Delete the Middle Node of a Linked List
// /https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head , fast = head ,prev = null ;
        
        if ( head==null||head.next==null){
            return null;
        }
        while ( fast != null && fast.next != null){
            prev = slow ;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        
        return head ;
    }
}
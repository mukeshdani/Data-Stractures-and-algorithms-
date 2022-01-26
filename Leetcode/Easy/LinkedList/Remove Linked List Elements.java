//Remove Linked List Elements
//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy ;
        
        while ( head!= null){
            if (head.val !=  val ){
                    tail.next = head ;
                    tail = head ; 
                    head = head.next ;
            }else {
                head = head.next;
            }
        }
        
        tail.next = null;
        return dummy.next ;
    }
}
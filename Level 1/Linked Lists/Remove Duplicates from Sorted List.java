//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//Remove Duplicate from Sorted List 
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
    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy = new ListNode(-1);  
        ListNode tail = dummy;  
        while ( head != null){
            if ( tail == dummy || head.val != tail.val){
                tail.next = head ;
                tail = head ;
            }
            head = head.next;
        }
  tail.next = null ;
        return dummy.next;
    }
}
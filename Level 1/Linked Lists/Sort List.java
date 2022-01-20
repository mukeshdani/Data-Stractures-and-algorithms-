//Sort List
//https://leetcode.com/problems/sort-list/
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
    //Function to merge two sorted linked list.
     public ListNode sortedMerge(ListNode head1, ListNode head2) {
         if ( head1 == null) return head2;
         if (head2 == null )return head1;
      ListNode dummy = new ListNode(-1);
      
      ListNode head = dummy , tail = dummy ;
      
      while ( head1 != null && head2!= null ){
          if ( head1.val < head2.val){
              tail.next = head1;
              head1 = head1.next;
          }else {
              tail.next = head2;
              head2 = head2.next;  
          }
          tail = tail.next;
      } 
      if ( head1 != null ) tail.next = head1 ;
      else tail.next = head2;
       
       return dummy.next;
     } 
  
  
  public ListNode middle(ListNode head){
      ListNode slow = head, fast = head;
      ListNode prev = null;
      
      while(fast != null && fast.next != null){
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
      }
      
      if(fast == null) // even  // odd condition 
          return prev;
      return slow;
  }
  
  public ListNode helper( ListNode head){
      if ( head == null || head.next == null){
          return head;
      }
      ListNode mid = middle(head);
      ListNode midNext = mid.next ;
      mid.next = null;
      
      ListNode left = helper(head);
      ListNode right  = helper(midNext);
      return sortedMerge(left , right );
  }
  public ListNode sortList(ListNode head) {
      return helper(head); 
  }
}

/*Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105*/

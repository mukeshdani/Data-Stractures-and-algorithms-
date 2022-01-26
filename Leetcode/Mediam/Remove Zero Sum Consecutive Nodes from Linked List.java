//Remove Zero Sum Consecutive Nodes from Linked List
//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

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
    public ListNode removeZeroSumSublists(ListNode head) {
      if(head == null || (head.val== 0 && head.next== null)) return null;
      ListNode dummy = new ListNode(-1);
      dummy.next=head;
      ListNode pre=dummy; 
      while(head != null){
          ListNode node=getZeroSum(head);
          if(node != head){
              pre.next=node;
              head=node;
          }
          else{
              pre=node;
              head=head.next;
          }
      }
      return dummy.next;
      
  }
  public ListNode getZeroSum(ListNode node){
      int sum=0;
      ListNode temp=node;
      while(temp!=null){
          sum+=temp.val;
          if(sum==0)
              return temp.next;
          temp=temp.next;
      }
      return node;
  }
}
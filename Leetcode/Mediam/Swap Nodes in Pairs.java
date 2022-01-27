//Swap Nodes in Pairs
//https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
         ListNode cur = head,next = null,prev = null;
           int count = 0;
           while(cur!=null && count<2){
               next = cur.next;
               cur.next = prev;
               prev = cur;
               cur = next;
               count++;
           }if(next!=null){
               head.next = swapPairs(next);
           }
           return prev;
       
    
    }
}

//Odd Even Linked List
//https://leetcode.com/problems/odd-even-linked-list/

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
    public ListNode oddEvenList(ListNode head) {
         ListNode firstHead = new ListNode(-1);
      ListNode secondHead = new ListNode(-1);
      
      ListNode first = firstHead , second = secondHead;
      
      while ( head!= null){
          first.next = head ;
          first = head ;
          head = head.next;
          if (head!= null){
              second.next = head ;
              second = head ;
              head = head.next;
          }
      }
      second.next = null;
     + first.next = secondHead.next;
        return firstHead.next;
    
    }
    
    }

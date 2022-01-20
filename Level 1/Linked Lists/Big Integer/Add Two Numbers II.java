//445.  Add Two Numbers II
//https://leetcode.com/problems/add-two-numbers-ii/

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
    
    public ListNode reverse (ListNode head){
        ListNode prev = null , curr = head;
        
        while ( curr!= null){
            ListNode ahead = curr.next;
            curr.next = prev ; 
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1 = reverse(l1);
        l2 = reverse(l2);
    ListNode dummy  = new ListNode(-1);
        
        ListNode head = dummy , tail = dummy ;
        
        int carry = 0 ;
        while ( l1 != null || l2!=null || carry>0){
            int d1 = (l1 == null)? 0 :l1.val;
            int d2 = (l2 == null)? 0 :l2.val;
            
            ListNode temp = new ListNode ((d1+d2+carry)%10);
            
            carry = (d1 + d2 + carry)/10;
            
            tail.next = temp ;
            tail = temp ;
            
            if ( l1 != null) l1 = l1.next;
            if ( l2 != null) l2 = l2.next;
            
            
        }
        return reverse(dummy.next);
    }
}
/*445. Add Two Numbers II
Medium

3105

223

Add to List

Share
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
Example 2:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [8,0,7]
Example 3:

Input: l1 = [0], l2 = [0]
Output: [0]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
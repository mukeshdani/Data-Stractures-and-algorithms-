//Palindrome Linked List

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
    
    // Total Time = O(3N)
    // O(N)
    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    //  O(N)
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
    
    
    // O(N)
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;    
        }
        
        ListNode mid = middle(head);
        ListNode second = reverse(mid.next);
        
        while(head != null && second != null){
            if(head.val != second.val) return false;
            head = head.next;
            second = second.next;
        }
        return true;
    }
}

/*Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?*/

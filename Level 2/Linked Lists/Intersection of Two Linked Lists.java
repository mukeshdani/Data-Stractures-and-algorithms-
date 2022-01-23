//Intersection of Two Linked Lists

//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution {
    public int getSize (ListNode head){
      int size = 0 ;
        while ( head!= null){
            head = head.next;
            size++;
        }
  return size;  
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        
        if(sizeA > sizeB){
            for ( int i = 0 ; i< sizeA - sizeB ; i++){
                headA = headA.next;
            }
        }else {
                for ( int i = 0 ; i< sizeB - sizeA ; i++){
                headB = headB.next;
                }
            }
            
            while ( headA != headB){
                headA = headA.next ; 
                headB = headB.next ; 
            }
        
        return headA;
    }
}

// 2nd Approach 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head, fast =head;

     while (fast!=null && fast.next != null){
        slow = slow.next;
         fast = fast.next.next;
         
         if ( slow == fast ) break;// detected 
     }
     
     
     if (fast==null || fast.next == null ){
         return null;
     }
     
     ListNode curr1=head , curr2= slow;
     
     while ( curr1 != curr2){
         curr1 = curr1.next;
         curr2 = curr2.next;
     }
     
     return curr1;
 }
 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
   ListNode tailB = headB;
     while ( tailB.next != null){
         tailB = tailB.next;
     }
     tailB.next =headB;
     ListNode ans = detectCycle(headA);
     tailB.next = null;
     return ans;
 }
}
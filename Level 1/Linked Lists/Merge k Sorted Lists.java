//Merge k Sorted Lists
//https://leetcode.com/problems/merge-k-sorted-lists/

// 2 . optimised 
//Time --> O(k*nlogk)

class Solution {
    ListNode Merge2List(ListNode head1, ListNode head2) {
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
    
    public ListNode helper(ListNode[] lists , int left , int right ){
        if ( left > right )return null;
        if ( left == right ) return lists[left];
       
        int mid = (left+right )/2 ;  
        ListNode l1 = helper(lists, left , mid);
        ListNode l2 = helper(lists , mid +1 , right);
        return Merge2List(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if ( lists.length == 0 )return null;
        
        return helper(lists , 0 , lists.length -1);
    }
}

// 1. approach brute
// O(N*k)
class Solution {
    
    public int minNode (ListNode[] lists ){
        int min = Integer.MAX_VALUE;
        int idx= -1 ;
        
        for ( int i = 0 ; i< lists.length  ; i++){
            if ( lists[i] != null && lists[i].val < min)
            {
                idx = i ;
                min  = lists[i].val;
            }        }
        return idx ;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if ( lists.length == 0 ){
            // 0 ll 
            return null;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy , tail = dummy ;
        
        while ( true){
            int minidx = minNode(lists);
            if ( minidx == -1 )break;
            
            tail.next = lists[minidx];
            lists[minidx] = lists[minidx].next;
            tail= tail.next;
        }
        return dummy.next;
    }
}

/*23. Merge k Sorted Lists
Hard

10009

416

Add to List

Share
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
 

Constraints:

k == lists.length
0 <= k <= 10^4
0 <= lists[i].length <= 500
-10^4 <= lists[i][j] <= 10^4
lists[i] is sorted in ascending order.
The sum of lists[i].length won't exceed 10^4.*/

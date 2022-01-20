//Merge two sorted linked lists
// { Driver Code Starts
    import java.util.*;

    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d; 
            next = null;
        }
    }
    
    
    class MergeLists
    {
        Node head;
    
    
    
      /* Function to print linked list */
       public static void printList(Node head)
        {
            
            while (head!= null)
            {
               System.out.print(head.data+" ");
               head = head.next;
            }  
            System.out.println();
        }
        
         
     
         /* Driver program to test above functions */
        public static void main(String args[])
        {
           
             
            /* Constructed Linked List is 1->2->3->4->5->6->
               7->8->8->9->null */
             Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             
             while(t>0)
             {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                Node head1 = new Node(sc.nextInt());
                Node tail1 = head1;
                for(int i=0; i<n1-1; i++)
                {
                    tail1.next = new Node(sc.nextInt());
                    tail1 = tail1.next;
                }
                Node head2 = new Node(sc.nextInt());
                Node tail2 = head2;
                for(int i=0; i<n2-1; i++)
                {
                    tail2.next = new Node(sc.nextInt());
                    tail2 = tail2.next;
                }
                
                LinkedList obj = new LinkedList();
                Node head = obj.sortedMerge(head1,head2);
                printList(head);
                
                t--;
                
             }
        }
    }
    // } Driver Code Ends
    
    
    /*
      Merge two linked lists 
      head pointer input could be NULL as well for empty list
      Node is defined as 
        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }
    */
    
    class LinkedList
    {
        //Function to merge two sorted linked list.
        Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        
        Node head = dummy , tail = dummy ;
        
        while ( head1 != null && head2!= null ){
            if ( head1.data < head2.data){
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
    }
    

/*Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 

Example 1:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.
Example 2:

Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two
linked list , we have 1, 1, 2, 4 as
output.
Your Task:
The task is to complete the function sortedMerge() which takes references to the heads of two linked lists as the arguments and returns the head of merged linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N, M <= 104
1 <= Node's data <= 105*/
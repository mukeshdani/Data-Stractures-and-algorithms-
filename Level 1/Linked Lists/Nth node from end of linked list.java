//Nth node from end of linked list

// { Driver Code Starts
    import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) 
        {
            data = d; 
            next = null;
        }
    }
        
    
        
    public class LinkedList_Element_From_Last
    {
        Node head;  
        Node tail;
        /* Function to print linked list */
        void printList(Node head)
        {
            Node temp = head;
            while (temp != null)
            {
               System.out.print(temp.data+" ");
               temp = temp.next;
            }  
            System.out.println();
        }
        
     
        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node) 
        {
    
            if (head == null) 
            {
                head = node;
                tail = node;
            } else 
            {
                tail.next = node;
                tail = node;
            }
        }
          
         /* Drier program to test above functions */
        public static void main(String args[])
        {
             Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             
             while(t>0)
             {
                int n = sc.nextInt();
                int k = sc.nextInt();
                LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
                //int n=Integer.parseInt(br.readLine());
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++) 
                {
                    int a = sc.nextInt(); 
                    llist.addToTheLast(new Node(a));
                }
              
            //System.out.println(llist.head.data);
            GfG g = new GfG(); 
            //System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head,k));
            
                t--;
            }
        }
    }
    
    
        
        // } Driver Code Ends
    
    
    /* Structure of node
    
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
    
    class GfG
    {
        //Function to find the data of nth node from the end of a linked list.
        int getNthFromLast(Node head, int k)
        {
            // Your code here	
            Node slow = head , fast = head ;
            
            while ( fast!= null && k-->0){
                fast = fast.next;
            }
            if (k>0){
                return-1;
            }
            
            while ( fast != null ){
                slow = slow.next; 
                fast = fast.next ; 
            }
            return slow.data;
        }
    }
    
/*Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end os 8.  
Example 2:

Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.
Your Task:
The task is to complete the function getNthFromLast() which takes two arguments: reference to head and N and you need to return Nth from the end or -1 in case node doesn't exist..

Note:
Try to solve in single traversal.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= L <= 106
1 <= N <= 106*/

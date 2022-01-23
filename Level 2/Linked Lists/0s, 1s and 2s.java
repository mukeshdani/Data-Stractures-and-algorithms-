//0s, 1s and 2s

//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node (-1);
         Node twoHead = new Node (-1);
        Node zero = zeroHead , one = oneHead , two = twoHead;
        
        while ( head != null){
            if ( head.data  == 0){
                zero.next =  head;
                zero = head;
            }else if ( head.data  ==1){
                one.next =  head;
                one = head;
            }else  {
                two.next = head ; 
                two = head;
            }
            head = head.next;
        }
        
        two.next = null;
        one.next = twoHead.next ;
        zero.next = oneHead.next;
        return zeroHead.next;
    }
}



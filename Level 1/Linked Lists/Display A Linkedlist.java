//Display A Linkedlist
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      // write code here
      
      return size;
    }

    public void display(){
     // if (size == 0 )return;

      Node curr = head ; 
       while ( curr != null ){
         System.out.print(curr.data + " ");
         curr = curr.next;
       }
       System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}

/*1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
   2.1 addLast - adds a new element with given value to the end of Linked List
3. You are required to complete the body of display function and size function
   3.1. display - Should print the elements of linked list from front to end in a single line. Elements should be separated by space.
   3.2. size - Should return the number of elements in the linked list.
4. Input and Output is managed for you.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addLast 10
addLast 20
addLast 30
display
size
addLast 40
addLast 50
display
size
quit

Sample Output
10 20 30 
3
10 20 30 40 50 
5*/
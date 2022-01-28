/// Stack 
/* import java.io.*;
import java.util.*;

public class Main {
  


    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner (System.in);
       Stack<Integer> stk = new Stack<>();
       
      stk.push(10);
      System.out.println(stk.peek());
      System.out.println(stk);
        stk.push(20);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.push(30);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.push(40);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.push(50);
        System.out.println(stk.peek());
    System.out.println(stk);
    
    System.out.println(stk.pop());
    System.out.println(stk);
    System.out.println(stk.pop());
    System.out.println(stk);
    System.out.println(stk.pop());
    System.out.println(stk);
    System.out.println(stk.pop());
    System.out.println(stk);
    System.out.println(stk.pop());
    System.out.println(stk);
     System.out.println(stk.pop());//Exception in thread "main" java.util.EmptyStackException
    System.out.println(stk);
}
}
 */

// Queue Operation 


import java.io.*;
import java.util.*;

public class Main {
  


    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner (System.in);
      // Not possible  Queue<Integer> q = new Queue<>();
       // queue is an interface 
       
       
       Queue<Integer> q = new ArrayDeque<>();
       
    //Run time polymorphism
    
    q.add(10);
    q.offer(10);// also work 
    System.out.println(q.peek());
     System.out.println(q);
    q.add(20);
     System.out.println(q.peek());
     System.out.println(q);
    q.add(30);
     System.out.println(q.peek());
     System.out.println(q);
    q.add(40);
     System.out.println(q.peek());
     System.out.println(q);
     
     //q.poll() also work 
     System.out.println(q.remove());
     System.out.println(q);
     System.out.println(q.remove());
     System.out.println(q);
     System.out.println(q.remove());
     System.out.println(q);
     System.out.println(q.remove());
     System.out.println(q);
     System.out.println(q.remove());//underFlow
     System.out.println(q);
     System.out.println(q.remove());//underflow
     System.out.println(q);
    
}
}


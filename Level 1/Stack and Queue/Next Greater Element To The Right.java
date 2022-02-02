//Next Greater Element To The Right
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/


//2 approachs 

//1 . left to right move 

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int [] nge = new int[arr.length];
   Stack<Integer> stk = new Stack<>();
   Arrays.fill(nge , -1);

   for ( int i = 0 ; i< arr.length ; i++){
       //pop smaller elemnet to the left 
       // pooped elemet ang is our index i
     while( stk.size()>0 && arr[stk.peek()]<arr[i]){
         nge[stk.pop()]=arr[i];
     }

     // push ourself 
     stk.push(i);
   }

   return nge;
 }

}

// Move right to left 

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int [] nge = new int[arr.length];
   Stack<Integer> stk = new Stack<>();
   Arrays.fill(nge , -1);

   for ( int i = arr.length -1 ; i>=0 ; i--){
      //pop smaller or eqal element to the irght in the stack 
     while( stk.size()>0 && arr[i]>=arr[stk.peek()]){
         stk.pop();
        // stk.push(i);
     }
     // push ourself 
     if(stk.size()>0)nge[i] = arr[stk.peek()];
     stk.push(i);
   }
   return nge;
 }

}
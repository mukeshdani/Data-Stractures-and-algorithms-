//Find In Generic Tree


/* public static boolean find(Node node, int data) {
    // write your code here
    if(node == null)return false ;
   if(node.data == data)return true;

   for(Node child: node.children){
     boolean myans = find(child , data);
     if(myans == true )return true;
     
   }
   return false ;
  } */


  //2nd way 
/* public static boolean find(Node node, int data) {
    // write your code here
    if(node == null)return false ;
   if(node.data == data)return true;

boolean myans = false;
   for(Node child: node.children){
     myans |= find(child , data);
     if(myans == true )return true;
     
   }
   return myans ;
  } */



  ///3rd way 
 /*  public static boolean find(Node node, int data) {
    Queue<Node> q = new ArrayDeque<>();
 
    q.add(node);
 
    while(!q.isEmpty()){
      int size = q.size();
      while(size-->0){
        Node rnode = q.remove();
        if(rnode.data == data){
          return true;
        }
 
        for(Node child : rnode.children){
          q.add(child);
        }
      }
    }
 
    return false ;
   } */


import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static boolean find(Node node, int data) {
    // write your code here
    if(node == null)return false ;
   if(node.data == data)return true;

   for(Node child: node.children){
     boolean myans = find(child , data);
     if(myans == true )return true;
     
   }
   return false ;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    boolean flag = find(root, data);
    System.out.println(flag);
    // display(root);
  }

}
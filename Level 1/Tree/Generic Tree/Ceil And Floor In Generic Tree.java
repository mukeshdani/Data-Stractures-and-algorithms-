//Ceil And Floor In Generic Tree


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

  
  static int ceil;
  static int floor;
  public static void ceilAndFloor(Node node, int data) {
    // Write your code here
   if(node == null) return ; 
   
   if(node.data > floor && node.data <data){
       floor = node.data;
   }else if(node.data>data && node.data<ceil)
         ceil = node.data;

         for(Node child : node.children){
           ceilAndFloor(child , data);
         }
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
    ceil = Integer.MAX_VALUE;
    floor = Integer.MIN_VALUE;
    ceilAndFloor(root, data);
    System.out.println("CEIL = " + ceil);
    System.out.println("FLOOR = " + floor);
  }

}
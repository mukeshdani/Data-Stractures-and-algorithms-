//Is A Binary Search Tree
//https://leetcode.com/problems/validate-binary-search-tree/

//https://nados.io/question/is-a-binary-search-tree?zen=true




/* 

// 1st Approach By Sir ---> Inorder Method 

static int prev = Integer.MIN_VALUE;
  public static boolean FindIsBST(Node root){
    if(root == null)return true;

    boolean left =  FindIsBST(root.left);
     boolean self  = true ;
      if(root.data <prev) self = false;
      else prev = root.data;
    boolean right = FindIsBST(root.right);

    return left && right && self;
  } */

/* 

//

LeetCode Solution 

  class Solution {
    Integer prev  = null;
   public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
       
       boolean left = isValidBST(root.left);
       
       if(prev != null && root.val <= prev ){
           return false ;
       }else prev = root.val;
       boolean right = isValidBST(root.right);
       
       return left && right ;
      
   }
} */


import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }

 
    public static boolean isBST(Node root, int min, int max){
      if(root == null) return true;
      
      if(root.data > min && root.data < max){
          boolean lres = isBST(root.left, min, root.data);
          boolean rres = isBST(root.right, root.data, max);
          return lres && rres;
      } 
      return false;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    System.out.println(isBST(root ,Integer.MIN_VALUE , Integer.MAX_VALUE ));
    
    // write your code here

    
  }

}
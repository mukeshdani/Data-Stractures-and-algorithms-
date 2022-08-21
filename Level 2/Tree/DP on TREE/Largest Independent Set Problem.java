//Largest Independent Set Problem
//https://practice.geeksforgeeks.org/problems/largest-independent-set-problem/0


class Solution {
    public static class Pair{
       int yes , no ;
       
       Pair(int yes , int no){
           this.yes = yes;
           this.no = no;
       }
   }
   public Pair dfs(Node root){
         if(root == null) return new Pair(0,0);
       Pair left = dfs(root.left);
       Pair right = dfs(root.right);
       
       int no = left.yes + right.yes;
       int yes = Math.max(no , 1  + left.no + right.no);
       return new Pair(yes, no);
   }
 
   public int LISS(Node root){
       //Write your code here  
        return dfs(root).yes;
   }
}
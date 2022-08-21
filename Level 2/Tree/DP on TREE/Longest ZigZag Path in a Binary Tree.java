//Longest ZigZag Path in a Binary Tree
//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/


class Solution {
    public static class Pair{
        int max , left , right;
        Pair(int max , int left , int right){
            this.max = max ;
            this.left = left;
            this.right = right;
        }
    }
    
    public Pair dfs(TreeNode root){
        if(root == null)return new Pair(0,0,0);
        
        Pair curr = new Pair(0,0,0);
        
        if(root.left != null){
            Pair left = dfs(root.left);
            curr.left = 1+left.right;
            curr.max = Math.max(curr.max , curr.left);
             curr.max = Math.max(curr.max , left.max);
            
        }
         if(root.right != null){
            Pair right = dfs(root.right);
            curr.right = 1+right.left;
            curr.max = Math.max(curr.max , curr.right);
             curr.max = Math.max(curr.max , right.max);
            
        }
        return curr;
    }
    public int longestZigZag(TreeNode root) {
        return dfs(root).max;
    }
}




//using static variable max 

class Solution {
    public static class Pair{
        int left , right;
        Pair(int left , int right){
            this.left = left;
            this.right = right;
        }
    }
    int max = 0 ;
    public Pair dfs(TreeNode root){
        if(root == null)return new Pair(0,0);
        
        Pair curr = new Pair(0,0);
        
        if(root.left != null){
            Pair left = dfs(root.left);
            curr.left = 1+left.right;
            max = Math.max(max , curr.left);
            
        }
         if(root.right != null){
            Pair right = dfs(root.right);
            curr.right = 1+right.left;
            max = Math.max(max , curr.right);
            
        }
        return curr;
    }
    public int longestZigZag(TreeNode root) {
        max = 0 ;
        dfs(root);
        return max;
    }
}
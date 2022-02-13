//Balanced Binary Tree
//https://leetcode.com/problems/balanced-binary-tree/


//TC-> O(N)
//Space -- >  O(H)--> recursve call stack space 
//Rerooting Tree ( DP on Tree )

class Solution {

   
    static class Pair{
        boolean isBalanced = true;
        int height = 0;
    }

    
    public Pair helper(TreeNode root) {
        if(root == null) return new Pair();

        
        Pair left = helper(root.left);
        Pair right = helper(root.right);

       
        Pair curr = new Pair();
        curr.height = Math.max(left.height, right.height) + 1;
        curr.isBalanced = (left.isBalanced && right.isBalanced 
            && (Math.abs(left.height - right.height) <= 1));
        return curr;
    }

    public boolean isBalanced(TreeNode root){
        return helper(root).isBalanced;
    }
}

// Time --> O(N^2)
//N nodes * O(N)->height 


class Solution {

    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int lheight = height(root.left);
        int rheight = height(root.right);

        if(lheight - rheight < -1 || lheight - rheight > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
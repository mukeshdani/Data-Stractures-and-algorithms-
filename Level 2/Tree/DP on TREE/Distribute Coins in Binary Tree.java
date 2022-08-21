//Distribute Coins in Binary Tree
//https://leetcode.com/problems/distribute-coins-in-binary-tree/


class Solution {
    int operations = 0 ;
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        operations = Math.abs(left) + Math.abs(right);
        
        int diff = left + right + root.val -1;// root coins - root.size = (left.coins - left.size) + (right.coins - right.size) + (root.val -1)
        
        return diff;
    }
    public int distributeCoins(TreeNode root) {
        operations = 0 ;
        dfs(root);
        return operations;
    }
}
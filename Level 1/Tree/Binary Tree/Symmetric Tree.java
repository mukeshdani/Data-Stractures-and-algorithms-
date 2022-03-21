//Symmetric Tree
//https://leetcode.com/problems/symmetric-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean sym(TreeNode r1 , TreeNode r2){
        if(r1== null || r2 == null)return r1==r2;
        
        return (r1.val == r2.val)&& sym(r1.left , r2.right)&&sym(r1.right,r2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))return true;
        
        if(root.left == null)return false ;
        if(root.right == null)return false ;
        
        return sym(root,root);
        
        
    }
}
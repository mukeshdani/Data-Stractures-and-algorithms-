//Path Sum
//https://leetcode.com/problems/path-sum/

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


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            // Root to Leaf Path Sum = targetSum
            return (targetSum == root.val);
        }

        if(hasPathSum(root.left, targetSum - root.val) == true) return true;
        if(hasPathSum(root.right, targetSum - root.val) == true) return true;
        return false;
    }
}
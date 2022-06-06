//Longest Univalue Path

//https://leetcode.com/problems/longest-univalue-path/#:~:text=Longest%20Univalue%20Path%20%2D%20LeetCode&text=Given%20the%20root%20of%20a,number%20of%20edges%20between%20them.

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
    int len = 0 ;
    public int longestUnivaluePath(TreeNode root) {
        len =0;
        helper(root , -1);
        if(len > 0 ) len = len -1 ;
        
        return len;
    }
    
    public int helper ( TreeNode node  , int val ){
        if(node == null)return 0;
        
        int left = helper(node.left , node.val);
        int right = helper(node.right , node.val);
        
        if(left + right + 1 > len ){
            len = left + right + 1;
        }
        
        if(val == node.val){
            return Math.max(left , right ) + 1;
        }else return 0;
    }
}
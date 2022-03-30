//Delete Node in a BST

//https://leetcode.com/problems/delete-node-in-a-bst/

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
    public int max(TreeNode node) {
        if(node.right == null) 
            return node.val;
        return max(node.right);
  }
    public TreeNode deleteNode(TreeNode node, int data) {
      if(node == null){
        // if node does not exist
        return null;
    }
    
    if(node.val == data){
        
        if(node.left == null && node.right == null){
            // leaf node
            return null;
            
        } else if(node.left == null){
            // only right child
            return node.right;
            
        } else if(node.right == null){
            // only left child
            return node.left;
            
        } else {
            // 2 child
            int inorderPredecessor = max(node.left);
            node.val = inorderPredecessor;
            node.left = deleteNode(node.left, inorderPredecessor);
        }
        
    } else if(node.val < data)
        node.right = deleteNode(node.right, data);
    else node.left = deleteNode(node.left, data);
    
    return node;  
    }
}
 
 
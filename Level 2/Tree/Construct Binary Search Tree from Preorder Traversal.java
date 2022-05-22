//Construct Binary Search Tree from Preorder Traversal

//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/


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

/* class Solution {
    int idx = 0 ;
   private TreeNode bstFromPreorder(int [] preorder , int lr , int rr ){
       if(idx == preorder.length || preorder[idx] < lr || preorder[idx] > rr ){
           return null;
       }
       
       TreeNode node = new TreeNode(preorder[idx++]);
       
       node.left = bstFromPreorder(preorder , lr  , node.val);
       node.right = bstFromPreorder(preorder, node.val , rr);
       
       return node;
       
   }
   public TreeNode bstFromPreorder(int[] preorder) {
       int lr = Integer.MIN_VALUE;
       int rr = Integer.MAX_VALUE;
       
        return bstFromPreorder(preorder , lr , rr);
   }
} */
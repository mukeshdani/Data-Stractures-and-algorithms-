//Construct Binary Tree from Preorder and Inorder Traversal
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

// whenever we have inorder with preorder and inoder with postorder we always get a unique binary tree 

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
    int index = 0;
   
   public TreeNode buildTree(int[] preorder, int[] inorder) {
       TreeNode root = constructTree(preorder, inorder, 0, preorder.length);
       return root;
   }
   
   private TreeNode constructTree(int[] preorder, int[] inorder, int l, int r) {
       if (l >= r) return null;
       int parentIndex = findParentIndex(preorder[index++], l, r, inorder); 
       TreeNode node = new TreeNode(inorder[parentIndex]);
       node.left = constructTree(preorder, inorder, l, parentIndex);
       node.right = constructTree(preorder, inorder, parentIndex + 1, r);
       return node;
   }
   
   private int findParentIndex(int par, int l, int r, int[] inorder) {
       int parIndex = l;
       for (int i = l; i < r; i++) {
           if (inorder[i] == par) {
               parIndex = i;
               break;
           }
       }
       return parIndex;
   }
}
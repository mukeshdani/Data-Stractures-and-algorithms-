//Minimum Depth of Binary Tree
//https://leetcode.com/problems/minimum-depth-of-binary-tree/
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
    public int minDepth(TreeNode root) {
        
           if(root == null) return 0 ;
          
          Queue<TreeNode> q = new ArrayDeque<>();
          
          q.add(root);
          int level = 1;
          while(q.size() != 0){
              int size = q.size();
              
             
              
              while(size-->0){
                  TreeNode rnode = q.remove();
                  
                  if(rnode.left == null && rnode.right == null){
                      return level;
                  }
                  if(rnode.left != null){
                      q.add(rnode.left);
                  }
                  if(rnode.right != null){
                      q.add(rnode.right);
                  }
                  
              }
                level++;
          } 
          
          return level;   
    }
}



/* ---------------------2nd approach------------------ */


class Solution {
    public int minDepth(TreeNode root) {
        if( root == null) return 0 ;
        
        if(root.left == null && root.right == null){
            return 1 ;
        }
        if ( root.left == null){
            return 1+ minDepth(root.right);
        }
        if ( root.right == null){
            return 1+ minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right)); 
    
    }
}
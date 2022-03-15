//Binary Tree Level Order Traversal
//https://leetcode.com/problems/binary-tree-level-order-traversal/


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
         if(root == null) return ans ;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        
        while(q.size() != 0){
            int size = q.size();
            
            List<Integer> currlevel = new ArrayList<>();
            
            while(size-->0){
                TreeNode rnode = q.remove();
                currlevel.add(rnode.val);
                if(rnode.left != null){
                    q.add(rnode.left);
                }
                if(rnode.right != null){
                    q.add(rnode.right);
                }
               
            }
            
            ans.add(currlevel); 
        } 
        
        return ans;
  }
}
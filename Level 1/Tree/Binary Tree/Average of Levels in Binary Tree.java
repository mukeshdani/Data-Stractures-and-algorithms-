//Average of Levels in Binary Tree

//https://leetcode.com/problems/average-of-levels-in-binary-tree/

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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> ans = new ArrayList<>();
         if(root == null) return ans ;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        
       
        
        while(q.size() != 0){
            int size = q.size();
             int div = size ;
             double sum = 0 ;
            while(size-->0){
                TreeNode rnode = q.remove();
              sum+=rnode.val;
                if(rnode.left != null){
                    q.add(rnode.left);
                }
                if(rnode.right != null){
                    q.add(rnode.right);
                }
               
            }
            sum = sum/div;
            ans.add(sum); 
        } 
        
        return ans;
    }
}
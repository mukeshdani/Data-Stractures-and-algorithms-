//Binary Tree Right Side View
//https://leetcode.com/problems/binary-tree-right-side-view/


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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> ans = new ArrayList<>();
      if(root == null) {
          return ans;
      }

      Queue<TreeNode> q = new ArrayDeque<>();
      q.add(root);
      while(q.size() != 0) {
          int size = q.size();
          ans.add(q.peek().val);
          while(size-->0) {
            TreeNode rnode = q.remove();
               if(rnode.right != null) {
                q.add(rnode.right);
            }
            if(rnode.left != null) {
                q.add(rnode.left);
            } 
           
          }
      }

      return ans;
    }
}



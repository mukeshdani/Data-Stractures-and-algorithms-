//Binary Tree Cameras
//https://leetcode.com/problems/binary-tree-cameras/

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
    int count = 0 ;
    final int CAMERAS = 1;
    final int MONITORED = 2;
    final int NON_MONITORED = 3 ;
    
    public int minCameraCover(TreeNode root) {
        
        int val = Helper(root);
        
        if(val==NON_MONITORED ){
            count++;
        }
        return count;
    }
    
    public int Helper(TreeNode node){
        if(node == null)return MONITORED;
        
        int left = Helper(node.left);
        int right= Helper(node.right);
        
        if(left == NON_MONITORED || right ==NON_MONITORED){
            count++;
            return CAMERAS;
        }
        else if( left == CAMERAS || right ==CAMERAS){
            return MONITORED;
        }else
        return NON_MONITORED;
    }
      
    }


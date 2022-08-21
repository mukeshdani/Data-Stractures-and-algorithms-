//Binary Tree Cameras
//https://leetcode.com/problems/binary-tree-cameras/

import java.util.*;
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
        
        if(left == NON_MONITORED || right == NON_MONITORED){
            count++;
            return CAMERAS;
        }
        else if( left == CAMERAS || right ==CAMERAS){
            return MONITORED;
        }else
        return NON_MONITORED;
    }
      
    }

//using ENUM

class Solution {
    public static enum State {
        CAMERA, NEED, COVERED;
    }

    int cameras = 0;

    public State dfs(TreeNode root){
        if(root == null) return State.COVERED;

        State left = dfs(root.left);
        State right = dfs(root.right);

        if(left == State.NEED || right == State.NEED){
            cameras++;
            return State.CAMERA;
        }

        if(left == State.CAMERA || right == State.CAMERA){
            return State.COVERED;
        }

        return State.NEED;
    }

    public int minCameraCover(TreeNode root) {
        State ans = dfs(root);
        if(ans == State.NEED) cameras++;
        return cameras;
    }
}
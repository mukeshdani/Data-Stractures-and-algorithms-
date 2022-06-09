//maximum-width-of-binary-tree
//https://leetcode.com/problems/maximum-width-of-binary-tree/

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
    int maxw = 0 ;
    class pair{
        long min ;
        long max;
    }
    public int widthOfBinaryTree(TreeNode root) {
        maxw = 0 ;
        HashMap<Integer , pair> map = new HashMap<>();
        helper(root , 1,1, map);
        return maxw;
    }
    public void helper(TreeNode root , int level , long idx ,HashMap<Integer , pair> map){
        if(root == null)return ;
        
        helper(root.left , level + 1 , 2*idx , map);
        helper(root.right , level + 1 , 2*idx + 1 , map);
        
        pair p  = null;
        
        if(map.containsKey(level)){
            p = map.get(level);
            p.min  = Math.min(p.min , idx);
            p.max = Math.max(p.max , idx);
        }else {
            p = new pair();
            
            p.min = idx ; 
            p.max = idx ;
            map.put(level , p);
        }
        
        long width = (int)p.max - (int)p.min +1 ;
        if(width > maxw){
            maxw = (int)width;
        }
    }
}
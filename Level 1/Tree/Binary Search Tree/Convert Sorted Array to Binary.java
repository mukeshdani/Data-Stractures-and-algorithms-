//Convert Sorted Array to Binary
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/

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
    
    public TreeNode constract(int[] arr , int lo , int hi){
        int mid = lo + (hi - lo) /2;
        //mid = (lo+hi)>>1
        
           if(lo>hi){
               return null;
           }
        TreeNode node = new TreeNode(arr[mid]);
        
        node.left = constract(arr , lo , mid-1);
        node.right = constract(arr , mid+1 , hi);
        return node;
        
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return constract(nums , 0 , nums.length -1);
    }
}
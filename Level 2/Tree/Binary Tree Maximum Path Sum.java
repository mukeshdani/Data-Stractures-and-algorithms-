//Binary Tree Maximum Path Sum

//https://leetcode.com/problems/binary-tree-maximum-path-sum/

/* class Solution {
    static int max= Integer.MIN_VALUE ;
     public int maxPathSum(TreeNode root) {
          max= Integer.MIN_VALUE ;
         
         maxPathSum1(root);
         return max;
         
     }
     public int maxPathSum1(TreeNode root){
             //code here
         if(root == null)return 0;
         
         int left =maxPathSum1(root.left);
         int right = maxPathSum1(root.right);
         
         int left_dash= Math.max(0 , left);
         int right_dash = Math.max(0 , right);
         
         int sumFromLeftToRight = left_dash + root.val + right_dash ;
         
         if(max<sumFromLeftToRight){
             max = sumFromLeftToRight;
         }
         
         return  Math.max(left_dash , right_dash) +root.val;
     }
 } */
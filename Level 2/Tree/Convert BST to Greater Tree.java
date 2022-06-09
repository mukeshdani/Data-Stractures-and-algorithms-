//Convert BST to Greater Tree

//https://leetcode.com/problems/convert-bst-to-greater-tree/

class Solution {
    
    int sum = 0 ;
   
   public void reverse(TreeNode root ){
       if(root == null)return ;
       
       reverse(root.right);
       
       sum+=root.val;
       root.val=sum;
       reverse(root.left);
   }
   public TreeNode convertBST(TreeNode root) {
        reverse(root);
       return root;
   }
}

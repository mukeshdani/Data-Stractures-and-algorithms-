//Diameter of Binary Tree
//https://leetcode.com/problems/diameter-of-binary-tree/

//Approach 1 .
//TC-> O(N^2)
//Space ->O(H)
class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameter(TreeNode root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        return Math.max(lh + rh + 1, Math.max(ld, rd));
    }

    public int diameterOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        return diameter(root) - 1;
    }
}

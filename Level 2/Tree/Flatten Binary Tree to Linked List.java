//Flatten Binary Tree to Linked List
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

// First Approach 

class Solution {
    
    TreeNode prev = null;
    public void flatten(TreeNode root) {
       if(root == null)return ;
        
        flatten(root.right);
        flatten(root.left);
        
        root.left = null;
        root.right = prev;
        prev = root;
      
    }
}


//Second Approach 

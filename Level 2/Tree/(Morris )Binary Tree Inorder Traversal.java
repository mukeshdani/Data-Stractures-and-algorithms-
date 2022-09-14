//Binary Tree Inorder Traversal
//https://leetcode.com/problems/binary-tree-inorder-traversal/

//Moris traversal (Inorder)
import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retVal = new ArrayList<>();
        
        TreeNode curr = root;
        
        while(curr != null){
            if(curr.left == null){
                retVal.add(curr.val);
                curr = curr.right;
            }else {
                TreeNode iop = curr.left;
                
                while(iop.right != null && iop.right != curr){
                    iop = iop.right;
                }
                
                if(iop.right == null){
                    iop.right = curr;
                    curr = curr.left;
                }else {
                   
                    iop.right = null;
                    retVal.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return retVal;
    }
} 
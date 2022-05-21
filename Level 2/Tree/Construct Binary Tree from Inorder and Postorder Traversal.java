//Construct Binary Tree from Inorder and Postorder Traversal
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/


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
/*
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.length;++i)
            hm.put(inorder[i], i);
        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0, 
                              postorder.length-1,hm);
    }

    private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, 
                                     HashMap<Integer,Integer> hm){
        if (ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hm);
        TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, ps+ri-is, pe-1, hm);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }
}*/



/* 

class Solution {
    public TreeNode BuildTreeIn(int[] inorder , int is , int ie , int [] postorder , int ps , int pe , HashMap<Integer , Integer> hm ){
         if (ps>pe || is>ie) return null;
        
        TreeNode root = new TreeNode(postorder[pe]);
        
        int ri = hm.get(postorder[pe]);
        
        TreeNode left = BuildTreeIn(inorder , is , ri-1 , postorder , ps , ps+ri-is-1 , hm);
        TreeNode right = BuildTreeIn(inorder , ri+1 , ie , postorder , ps+ri-is , pe-1,hm);
        root.left = left;
        root.right = right;
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       if(inorder == null || postorder == null || inorder.length != postorder.length )return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i< inorder.length ; i++){
            hm.put(inorder[i] , i);
        }
        
        return BuildTreeIn(inorder, 0, inorder.length-1, postorder, 0, 
                              postorder.length-1,hm);
        
    }
} */
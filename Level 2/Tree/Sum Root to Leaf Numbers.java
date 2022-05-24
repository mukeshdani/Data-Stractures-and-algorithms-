//Sum Root to Leaf Numbers

//https://leetcode.com/problems/sum-root-to-leaf-numbers/


/* 
class Solution {
    int max = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return max;
    }
    
    void dfs(TreeNode root, int sum) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            max += (sum * 10 + root.val);
            return;
        }
        
        sum = sum*10 + root.val;
        
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
} */
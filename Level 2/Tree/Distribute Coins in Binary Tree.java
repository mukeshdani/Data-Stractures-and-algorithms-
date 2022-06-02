//Distribute Coins in Binary Tree

//https://leetcode.com/problems/distribute-coins-in-binary-tree/

class Solution {
    class pair{
        int nodes ;
        int coins;
    }
    int moves = 0 ;
    public int distributeCoins(TreeNode root) {
        if(root == null)return 0;
        helper(root);
        return moves;
    }
    
    public pair helper(TreeNode node){
        if(node == null)return new pair();
        pair lp = helper(node.left);
        pair rp = helper(node.right);
        
        pair mp = new pair();
        
        mp.nodes = lp.nodes + rp.nodes + 1;
        mp.coins = lp.coins + rp.coins + node.val;
        
        moves += Math.abs(mp.nodes - mp.coins);
        return mp;
    }
}
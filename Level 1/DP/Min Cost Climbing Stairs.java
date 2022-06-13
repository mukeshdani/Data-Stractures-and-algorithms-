//Min Cost Climbing Stairs
//https://leetcode.com/problems/min-cost-climbing-stairs/


// memo

class Solution {
    public int memo(int src , int[]cost , int[] dp){
        if(src >= cost.length)return 0;
        if(dp[src]!=-1)return dp[src];
        int ans1 = memo(src+1 , cost , dp);
        int ans2 = memo(src+2 , cost , dp);
        
        return dp[src] = Math.min(ans1 , ans2)+cost[src];
    }
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[cost.length + 1];
        Arrays.fill(dp,-1);
        
        memo(0,cost,dp);
        return Math.min(dp[0],dp[1]);
    }
}
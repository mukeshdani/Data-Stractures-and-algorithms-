//Jump Game II
//https://leetcode.com/problems/jump-game-ii/





class Solution {
    public long memo(int src , int [] jumps , long[] dp){
        if(src == jumps.length -1 )return 0;//length 
        if(dp[src]!= -1)return dp[src];
        long min = Integer.MAX_VALUE;
        
        for(int jump = 1 ; jump<=jumps[src] ; jump++){
            if(src + jump < jumps.length ){
                min = Math.min(min , memo(src + jump , jumps , dp) + 1l);
            }
        }
        dp[src] = min;
        
        return min;
    }
    public int jump(int[] nums) {
       long[] dp = new long[nums.length + 1];
        Arrays.fill(dp , -1);
        return (int)memo(0 , nums , dp);
    }
}
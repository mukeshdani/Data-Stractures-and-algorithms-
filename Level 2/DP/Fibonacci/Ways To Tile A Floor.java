//Ways To Tile A Floor
//https://practice.geeksforgeeks.org/problems/ways-to-tile-a-floor5836/1


class Solution {
    static Long numberOfWays(int N) {
       long[] dp = new long[N+1];
        dp[0] = 1;
        long mod = 1000000007;
        
        for(int i=1;i<=N;i++)
            dp[i] = i==1 ? 1 : (dp[i-1] + dp[i-2])%mod;
        
        return dp[N]%mod;
    }
};
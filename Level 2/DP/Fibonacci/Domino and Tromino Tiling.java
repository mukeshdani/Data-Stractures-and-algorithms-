//Domino and Tromino Tiling
//https://leetcode.com/problems/domino-and-tromino-tiling/


class Solution {
    public int numTilings(int n) {
        int [] dp = new int [n+1];
        int mod = 1000000007;
        if(n <= 2) return n;
          dp[1] = 1; 
          dp[2] = 2;
          dp[3] = 5;
       
         for(int i=4; i<=n; i++) 
             dp[i] = (((dp[i-1]*2) % mod) + dp[i-3]) % mod;
        
        return dp[n]%mod;
    }
}
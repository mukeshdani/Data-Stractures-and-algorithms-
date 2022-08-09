//Count the number of ways to tile the floor of size n x m using 1 x m size tiles

//https://practice.geeksforgeeks.org/problems/count-the-number-of-ways-to-tile-the-floor-of-size-n-x-m-using-1-x-m-size-tiles0509/1

class Solution
{
    public int countWays(int n, int m)
    {
        // Code here
        
        if(n<m)return 1; 
        if(n==m)return 2;  
          int mod = 1000000007;
        int [] dp = new int[n+1];
        
        for(int i = 1 ; i<=n ; i++){
           if(i<m)dp[i] = 1;
           else if(i==m)dp[i] = 2;
           else dp[i] = (dp[i-1] + dp[i-m])%mod;
        }
        
        return dp[n]%mod;
    }
}
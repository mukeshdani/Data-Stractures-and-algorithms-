//Minimum steps to minimize n as per given condition
//https://practice.geeksforgeeks.org/problems/minimum-steps-to-minimize-n-as-per-given-condition0618/1/


class Solution{

    public int memo(int n , int[]dp){
        if(n==1)return 0;
        if(dp[n]!=-1)return dp[n];
        
        int ans1 = (n%2==0) ? memo(n/2 , dp):Integer.MAX_VALUE;
        int ans2 = (n%3 == 0 )? memo(n/3 , dp):Integer.MAX_VALUE;
        int ans3 = memo(n-1 , dp);
        
        return dp[n] = Math.min(ans1 , Math.min(ans2, ans3)) + 1;
        
    }
	public int minSteps(int N) 
	{ 
	    // Your code goes here
	    int[] dp = new int [N+1];
	    
	    Arrays.fill(dp , -1);
	    return memo(N , dp);
	} 
}

//Fibonacci Number
//https://leetcode.com/problems/fibonacci-number/


class Solution {
    /*public int fib(int n , int[] dp ){
        //base 
        
        if(n==0)return 0;
        if(n==1)return 1;
        
        if(dp[n] !=-1){
            return dp[n];
        }
        //alredy calculated value shoud be returned 
        
        int prev1 = fib(n-1,dp);
        int prev2 = fib(n-2,dp);
        
        dp[n] = prev1+prev2;
        //befor returning the calcualted vale , store it somewhere
        
        return prev1+ prev2;
    }
    
    */
    public int fib(int n) {
    /* normal recursion Code 
    //base 
        if(n==1 ){
            return 1;
            
        }
        if(n==0)return 0;
        
        //faith 
     int prev1 =    fib(n-1);
        int prev2 = fib(n-2);
     //meeting exoectation 
        return prev1 + prev2;
        */
        
        // Now DP 
        // Memom
        
        /*int [] dp =  new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return fib(n , dp);
        
        */
        
        
        //Now Tabulation 
         
        
        
        
        
        if(n<=1) return n;
        
        int [] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2 ; i<=n ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
}
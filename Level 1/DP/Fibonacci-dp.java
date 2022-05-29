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




/* import java.io.*;
import java.util.*;

public class Main {

    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        int ans = fibo(n - 1) + fibo(n - 2);
        return ans;
    }

    public static void recursive(int n) {
        int ans = fibo(n);
        System.out.println(ans);
    }

    public static int memoFibo(int n, int[] memo) {
        if (n == 0 || n == 1)
            return memo[n] = n;

        if (memo[n] != -1)
            return memo[n];

        int ans = memoFibo(n - 1, memo) + memoFibo(n - 2, memo);
        return memo[n] = ans;
    }

    public static void memoization(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int ans = memoFibo(n, memo);
        System.out.println(ans);
    }

    public static void tabulation(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                dp[i] = i;
                continue;
            }

            int ans = dp[i - 1] + dp[i - 2];
            dp[i] = ans;
        }
        System.out.println(dp[n]);
    }

    public static void so(int n) {
        int prev = 1, sprev = 0;
        for (int i = 2; i <= n; i++) {
            int curr = prev + sprev;
            sprev = prev;
            prev = curr;
        }
        System.out.println(prev);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // recursive(n);
        // memoization(n);
        // tabulation(n);
        so(n);
    }

} */
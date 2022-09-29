//Minimum Cost to Cut a Stick
//https://leetcode.com/problems/minimum-cost-to-cut-a-stick/
import java.util.*;


//Memoization 

class Solution {
    public int F(int i , int j , int [] cuts , int [][] dp){
        if(i>j)return 0;
        int mini = (int)1e9;
        if(dp[i][j] != -1)return dp[i][j];
        for(int idx = i ; idx <=j ; idx++){
            int cost = cuts[j+1] - cuts[i-1] + F(i , idx - 1 , cuts , dp) + F(idx + 1 , j , cuts , dp);
            mini = Math.min(mini , cost);
        }
        return dp[i][j] = mini;
    }
    public int minCost(int n, int[] cuts) {
        int [] arr = new int [cuts.length+2];
        arr[0] = 0;
        arr[arr.length - 1] = n;
        for(int i = 1 ; i<arr.length-1; i++){
            arr[i] = cuts[i - 1];
        }
      
        Arrays.sort(arr);
        int [][] dp = new int [arr.length][arr.length];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        
        return F(1,cuts.length, arr , dp);
    }
}


//Tabultaion 

class Solution2{
    public int minCost(int n, int[] cuts) {
         int c = cuts.length;
        int [] arr = new int [cuts.length+2];
        arr[0] = 0;
        arr[arr.length - 1] = n;
        for(int i = 1 ; i<arr.length-1; i++){
            arr[i] = cuts[i - 1];
        }
      
        Arrays.sort(arr);
        int [][] dp = new int [c + 2][c + 2];
         
         for (int i=c;i>=1;i--){
            for (int j=i;j<=c;j++){
               /// if(i>j) continue;
                int mini = Integer.MAX_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int steps = arr[j+1] - arr[i-1]
                        + dp[i][ind-1]  // for left side;
                        + dp[ind+1][j]; // for right side;
                    mini = Math.min(mini,steps);
                }
                dp[i][j] = mini;
            }
        }
        
        return dp[1][cuts.length];
    }
}

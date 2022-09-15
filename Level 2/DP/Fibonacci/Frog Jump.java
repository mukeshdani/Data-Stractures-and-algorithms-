//Frog Jump
//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos


/* 
//using memoization 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int F(int idx , int [] arr , int [] dp){
        if(idx == 0 )return 0;
        if(dp[idx] != -1)return dp[idx];
        int left = F(idx-1 , arr , dp) + Math.abs(arr[idx] - arr[idx - 1]);
        int right = Integer.MAX_VALUE;
        if(idx > 1) right = F(idx - 2 , arr , dp) + Math.abs(arr[idx] - arr[idx -2]);
        
        return dp[idx] = Math.min(left , right);
    }
    public static int frogJump(int n, int heights[]) {
        int [] dp = new int [n+1];
        for(int i = 0 ; i< n ; i++){
            dp[i] = -1;
        }
        return F(n-1, heights , dp);
    }
} */



/* 
//Using Tabulation 

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int F(int idx , int [] arr , int [] dp){
        dp[0] = 0;
        for(int i = 1 ; i<arr.length  ; i++){
            int fs = dp[i - 1] + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) ss= dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(fs , ss);
        }
        return dp[arr.length -1];
    }
    public static int frogJump(int n, int heights[]) {
        int [] dp = new int [n+1];
        for(int i = 0 ; i< n ; i++){
            dp[i] = -1;
        }
        return F(n-1, heights , dp);
    }
} */



//Using Space Optimizations

/* 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int F(int idx , int [] arr ){
        int prev1 = 0 ;
        int prev2 = 0 ;
        for(int i = 1 ; i<arr.length  ; i++){
            int fs = prev1 + Math.abs(arr[i] - arr[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) ss= prev2+ Math.abs(arr[i] - arr[i-2]);
            int curr = Math.min(fs , ss);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static int frogJump(int n, int heights[]) {
        return F(n-1, heights);
    }
} */
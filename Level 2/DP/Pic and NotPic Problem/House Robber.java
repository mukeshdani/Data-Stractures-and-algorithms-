//House Robber
//https://leetcode.com/problems/house-robber/

//Space Optimised Solution

class Solution {
 
    public int rob(int[] nums) {
        int n = nums.length ;
        int prev = nums[0];
        int prev2 = 0;
        
        for(int i = 1; i< n ; i++){
            int pic = nums[i] + prev2;
            int notPic = 0 + prev;
            int curr = Math.max(pic , notPic);
            prev2 = prev;
            prev = curr;
        }
        
        return prev;
    }
}


//Memoization 
/* import java.util.*;
class Solution {
    public int F(int idx , int [] arr , int[] dp){
        if(idx == 0)return arr[idx];
        if(idx < 0)return 0;
        if(dp[idx] != -1)return dp[idx];
        int pic = arr[idx] + F(idx - 2 , arr , dp);
        
        int notPic = 0 + F(idx - 1 , arr , dp);
         
        return dp[idx] = Math.max(pic , notPic);
    }
    public int rob(int[] nums) {
        int n = nums.length ;
        int[] dp = new int [n+1];
        Arrays.fill(dp , -1);
        return F(n - 1 , nums , dp);
    }
} */

//Tabulation 

/* class Solution {
    public int F(int n , int [] arr , int[] dp){
       dp[0] = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            int pic = arr[i] ;
            if(i>1){
                pic += dp[i-2];
            }
            int notPic =  0 + dp[i-1];

            dp[i] = Math.max(pic , notPic);
        }
        return dp[n - 1];
   }
    public int rob(int[] nums) {
        int n = nums.length ;
        int[] dp = new int [n];
        Arrays.fill(dp , -1);
        return F(n, nums , dp);
    }
} */

/* ///TLE 
class Solution {
    public int F(int idx , int [] arr){
        if(idx == 0)return arr[idx];
        if(idx < 0)return 0;
        
        int pic = arr[idx] + F(idx - 2 , arr);
        
        int notPic = 0 + F(idx - 1 , arr);
         
        return Math.max(pic , notPic);
    }
    public int rob(int[] nums) {
        int n = nums.length ;
        return F(n - 1 , nums);
    }
} */
//Burst Balloons
//https://leetcode.com/problems/burst-balloons/

//Memoization 
class Solution {
    public int F(int i , int j , int [] arr , int [][] dp){
        if(i>j)return 0;
        int mini = Integer.MIN_VALUE;
        if(dp[i][j] != -1)return dp[i][j];
        for(int idx = i ; idx <= j; idx++){
            int cost = arr[i-1]*arr[idx]*arr[j+1] + F(i , idx -1  , arr , dp) + F(idx +1 , j , arr , dp);
            mini = Math.max(mini , cost);
        }
        return dp[i][j] = mini;
    }
    public int maxCoins(int[] nums) {
        int [] arr = new int [nums.length + 2];
        arr[0] = 1;
        arr[arr.length-1] = 1;
        int idx = 0;
        for(int i = 1; i<arr.length-1 ; i++){
            arr[i] = nums[idx];
            idx++;
        }
        int [][] dp = new int [arr.length][arr.length];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(1,nums.length,arr , dp);
    }
}
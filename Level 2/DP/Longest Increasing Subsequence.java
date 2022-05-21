//Longest Increasing Subsequence
//https://leetcode.com/problems/longest-increasing-subsequence/


class Solution {
    public int memo(int curr , int prev , int [] nums , int [][]dp){
        
            if(curr == nums.length )return 0 ;
             
        if(dp[curr][prev + 1]!=-1)return dp[curr][prev+1];
        //prev+1 = to store prev = -1 also in the dp table
            int yes=(prev ==-1 || nums[prev]<nums[curr]) ? memo(curr+1 , curr , nums , dp )+1 : 0; //+1 current element is increasd  = > length increse by 1  
            
            int no =memo(curr+1 , prev , nums , dp);
          return dp[curr][prev+1] =  Math.max(yes , no);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int [][] dp  = new int [n+1][n+1];
        
        for(int i =0 ; i<=n ; i++ ){
            for(int j = 0 ; j<=n ; j++){
                dp[i][j] = -1;
            }
        }
        return memo(0 , -1 , nums , dp);
    }
}
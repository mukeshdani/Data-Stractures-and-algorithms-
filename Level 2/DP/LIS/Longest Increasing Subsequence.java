//Longest Increasing Subsequence
//https://leetcode.com/problems/longest-increasing-subsequence/
import java.util.*;

//Different 
//optimial 
class Solution10 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;
        int [] dp = new int [n];
        Arrays.fill(dp,1);

        
        for(int i = 0 ; i<n ; i++){
            for(int prev = 0 ; prev <= i-1 ;prev++ )
            if(nums[prev] < nums[i]){
                dp[i] = Math.max(dp[i] , 1 + dp[prev]);
            }
        }
        
        int max = -1;
        for(int i = 0 ; i<n ; i++){
            max = Math.max(max , dp[i]);
        }
        return max;
    }
}


//Space optimization 
class Solution8{
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ; 
        int [] next = new int [n + 1]; 
        int [] curr = new int [n + 1]; 
        
        for(int idx = n - 1 ; idx >= 0 ; idx--){
            for(int prev_idx = idx - 1 ; prev_idx >= -1 ; prev_idx --){
                int len =0 + next[prev_idx + 1];
                 if(prev_idx == -1 || nums[prev_idx]<nums[idx]){
                     len = Math.max(len , 1 + next[idx + 1]);
                 }
                  curr[prev_idx + 1] = len;
            }
            next = curr;
        }
        return next[0];
    }
}


//Tabulation 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ; 
        int [][] dp = new int [n + 1][n + 1]; 
        
        for(int idx = n - 1 ; idx >= 0 ; idx--){
            for(int prev_idx = idx - 1 ; prev_idx >= -1 ; prev_idx --){
                int len =0 + dp[idx + 1][prev_idx + 1];
                 if(prev_idx == -1 || nums[prev_idx]<nums[idx]){
                     len = Math.max(len , 1 + dp[idx + 1][idx + 1]);
                 }
                  dp[idx][prev_idx + 1] = len;
            }
        }
        return dp[0][0];
    }
}


//Memoization Solution 
//

class Solution6 {
    public int F(int idx , int prev_idx , int [] arr , int [][] dp){
        if(idx == arr.length)return 0;
        int len = 0 ;
        
        if(dp[idx][prev_idx + 1] != -1)return dp[idx][prev_idx + 1];
        //not take 
        len = Math.max(len , 0 + F(idx + 1 , prev_idx , arr , dp));
        //Take 
        if(prev_idx == -1 || arr[prev_idx]<arr[idx]){
            len = Math.max(len , 1 + F(idx + 1 , idx  ,arr , dp));
        }
        return dp[idx][prev_idx + 1] = len;
    }
    public int lengthOfLIS(int[] nums) {
        int [][] dp = new int [nums.length][nums.length + 1]; 
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(0 , -1 ,nums , dp);
    }
}

//Recursion 
//TLE Solutions

class Solution5{
    public int F(int idx , int prev_idx , int [] arr){
        if(idx == arr.length)return 0;
        int len = 0 ;
        //not take 
        len = Math.max(len , 0 + F(idx + 1 , prev_idx , arr));
        //Take 
        if(prev_idx == -1 || arr[prev_idx]<arr[idx]){
            len = Math.max(len , 1 + F(idx + 1 , idx  ,arr));
        }
        
        return len;
    }
    public int lengthOfLIS(int[] nums) {
        return F(0 , -1 ,nums);
    }
}





























/* 
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

 */
/* 



    /////////////////
    

    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] lis = new int[nums.length];
            lis[0] = 1;
            
            for(int i = 1 ;i<lis.length ; i++){
                int max =0 ;
                for(int j = 0 ; j< i ; j++){
                    if(nums[i] > nums[j]){
                      max = Math.max(max , lis[j]);             
                    }
                }
                lis[i] = max + 1;
            }
            int len =0 ;
            for(int val : lis){
                len = Math.max(val , len);
            }
            return len;
        }
    } */




    //////


/* 
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] tails = new int[nums.length];
            int len = 1;
            tails[0] = nums[0];
            
            for(int i = 1; i< nums.length ; i++){
                if(nums[i] > tails[len- 1]){
                    len++;
                    tails[len-1] = nums[i];
                }else {
                   int idx = Arrays.binarySearch(tails , 0 , len -1 , nums[i]);
                    if(idx <0){
                        idx = -idx;
                        idx = idx - 1;
                    }
                    tails[idx] = nums[i];
                }
            }
            return len;
        }
    } */
//Longest Common Subsequence

//https://leetcode.com/problems/longest-common-subsequence/

//Space Optimization 
class Solution0{

    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int [] prev = new int [m+1];
        for(int j = 0 ; j < m ; j++){
            prev[j] = 0;
        }
        for(int idx1 = 1 ; idx1 <= n ; idx1++){
            int [] curr = new int [m+1];
            for(int idx2 = 1; idx2 <= m ; idx2++){
                 if(s1.charAt(idx1-1)==(s2.charAt(idx2-1))){
                     curr[idx2] = 1 +prev[idx2 - 1];
                 }else {
                     curr[idx2] = 0 + Math.max(curr[idx2 - 1], prev[idx2]);
                 }
            }
            prev = curr;
        }
                                                   
          return prev[m];                                         
    }
}


//Memoization

class Solution {
    public int F(int idx1 , int idx2 , String s1 , String s2 , int[][] dp){
        if(idx1 < 0 || idx2 < 0)return 0;
        
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(s1.charAt(idx1)==(s2.charAt(idx2))){
            return dp[idx1][idx2] = 1 + F(idx1 - 1, idx2 - 1, s1 , s2 , dp);
        }else {
            return dp[idx1][idx2] = 0 + Math.max(F(idx1, idx2 - 1, s1 , s2 , dp) , F(idx1 - 1, idx2 , s1 , s2 , dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int [n][m];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n-1,m-1 , text1 , text2 , dp);
    }
}


//Memoization 
//Using Shifting of indexes

class Solution3{
    public int F(int idx1 , int idx2 , String s1 , String s2 , int[][] dp){
        if(idx1==0 || idx2==0)return 0;
        
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(s1.charAt(idx1-1)==(s2.charAt(idx2-1))){
            return dp[idx1][idx2] = 1 + F(idx1 - 1, idx2 - 1, s1 , s2 , dp);
        }else {
            return dp[idx1][idx2] = 0 + Math.max(F(idx1, idx2 - 1, s1 , s2 , dp) , F(idx1 - 1, idx2 , s1 , s2 , dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int [n+1][m+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n,m, text1 , text2 , dp);
    }
}


//Tabulation 
class Solution4{

    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int [n+1][m+1];
       
        
        for(int i = 0 ; i < n ; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j < m ; j++){
            dp[0][j] = 0;
        }
        
        for(int idx1 = 1 ; idx1 <= n ; idx1++){
            for(int idx2 = 1; idx2 <= m ; idx2++){
                 if(s1.charAt(idx1-1)==(s2.charAt(idx2-1))){
                     dp[idx1][idx2] = 1 +dp[idx1 - 1][idx2 - 1];
                 }else {
                     dp[idx1][idx2] = 0 + Math.max(dp[idx1][idx2 - 1], dp[idx1 - 1][idx2]);
                 }
            }
        }
                                                   
          return dp[n][m];                                         
    }
}
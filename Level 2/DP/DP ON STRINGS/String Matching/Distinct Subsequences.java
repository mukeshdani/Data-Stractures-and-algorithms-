//https://leetcode.com/problems/distinct-subsequences/
//Distinct Subsequences

//Space Optimization 
//Using Only one row

class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [] prev = new int [m + 1];
        prev[0] = 1;
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = m; j >= 1 ; j--){
                if(s.charAt(i - 1) == t.charAt(j - 1)) prev[j] = prev[j-1] + prev[j];
                else prev[j] = prev[j];
           }
        }  
        return prev[m];
    }
}

//Space optimization 
//using two row
class Solution1 {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [] prev = new int [m + 1];
        prev[0] = 1;
        for(int i = 1 ; i < n+1 ; i++){
             int [] curr = new int [m + 1];
             curr[0] = 1;
            for(int j = 1; j < m+1 ; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)) curr[j] = prev[j-1] + prev[j];
                else curr[j] =prev[j];
           }
            prev = curr;
        }  
        return prev[m];
    }
}

//Memoization 

class Solution2 {
    public int F(int i , int j , String s1 , String s2 , int[][] dp){
        if(j<0)return 1;
        if(i<0)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = (F(i-1 , j-1 , s1, s2 , dp) + F(i-1 , j , s1 , s2 , dp));
        }else return dp[i][j] = F(i-1 , j , s1 , s2 , dp);
        
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [][] dp = new int [n][m];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n-1 , m-1 , s , t , dp);
    }
}

//Memoization 
//Change the indexing for tabulation easy 

class Solution3 {
    public int F(int i , int j , String s1 , String s2 , int[][] dp){
        if(j==0)return 1;
        if(i==0)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s1.charAt(i - 1) == s2.charAt(j - 1)){
            return dp[i][j] = (F(i-1 , j-1 , s1, s2 , dp) + F(i-1 , j , s1 , s2 , dp));
        }else return dp[i][j] = F(i-1 , j , s1 , s2 , dp);
        
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [][] dp = new int [n + 1][m + 1];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n, m, s , t , dp);
    }
}


//Tabulation 

class Solution4 {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [][] dp = new int [n + 1][m + 1];
        
        for(int i = 0 ; i<n+1 ; i++)dp[i][0] = 1;
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1; j < m+1 ; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                else dp[i][j] = dp[i-1][j];
           }
        }  
        return dp[n][m];
    }
}
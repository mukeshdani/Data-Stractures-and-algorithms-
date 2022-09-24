//Edit Distance
//https://leetcode.com/problems/edit-distance/


//Space optimization 
//using prev and curr tow row
class Solution1{
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [] prev = new int [m + 1];
         
        
        for(int j = 0 ; j<=m ; j++){
            prev[j] = j;
        }
       
        for(int i = 1 ; i<=n ; i++){
             int [] curr = new int [m + 1];
            curr[0] = i; 
            for(int j = 1 ; j<=m ; j++){
                if(word1.charAt(i - 1)==word2.charAt(j - 1)){
                      curr[j] = 0 +prev[j-1];
                    }else {
                      curr[j] = Math.min(1+ prev[j-1], Math.min(1 + curr[j-1], 1 + prev[j]));
                } 
            }
            prev = curr;
        }
        return prev[m];
    }
}


//Memoization

class Solution3 {
    public int F(int i , int j , String s1 , String s2 , int [][] dp){
        if(i<0)return j+1;
        if(j<0)return i+1;
        
        if(dp[i][j]!=-1)return dp[i][j] ;
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 0 + F(i-1 , j-1, s1 , s2 , dp);
        }else {
            return dp[i][j] = Math.min(1+ F(i-1 , j-1 , s1 , s2 , dp) , Math.min(1 + F(i, j-1 , s1 , s2 , dp) , 1 + F(i - 1, j , s1 , s2 , dp)));
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][] dp = new int [n][m];
        for(int i = 0 ;i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n-1 , m-1 , word1 , word2 , dp);
    }
}

//Tabulation 

class Solution4 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][] dp = new int [n + 1][m + 1];
         
        
        for(int j = 0 ; j<=m ; j++){
            dp[0][j] = j;
        }
        for(int i = 0 ; i<=n ; i++){
            dp[i][0] = i;
        }
        
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=m ; j++){
                if(word1.charAt(i - 1)==word2.charAt(j - 1)){
                      dp[i][j] = 0 +dp[i-1][j-1];
                    }else {
                      dp[i][j] = Math.min(1+ dp[i-1][j-1], Math.min(1 + dp[i][j-1], 1 + dp[i - 1][j]));
                    } 
            }
        }
        return dp[n][m];
    }
}
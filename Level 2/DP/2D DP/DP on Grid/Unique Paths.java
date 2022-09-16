//Unique Paths
//https://leetcode.com/problems/unique-paths/

//Best and Space Optimsed Solution 

class Solution {

  public int uniquePaths(int m, int n) {
     int prev[] = new int[n];
      for(int i = 0 ; i< m ; i++){
          int temp [] = new int[n];
          for(int j =0 ; j< n ; j++){
              if(i==0 && j==0 ) {
                   temp[j] = 1;
                   continue;
              }
              else {
                  int up = 0 ;
                  if(i>0) up = prev[j];
                  int down = 0;
                  if(j>0) down = temp[j-1];
                  
                  temp[j] = up + down;
              }
          }
          prev = temp;
      }
      return prev[n - 1];
  }
}


//memoization 
class Solution2 {
    public int countWaysUtil(int i, int j , int [][] dp) {
      if(i==0 && j == 0)
        return 1;
      if(i<0 || j<0)
        return 0;
       if(dp[i][j] != -1)return dp[i][j];
      int up = countWaysUtil(i-1,j , dp);
      int left = countWaysUtil(i,j-1 , dp);
      
      return dp[i][j] = up+left;
      
    }
        public int uniquePaths(int m, int n) {
            int [][] dp = new int [m][n];
            for(int i  = 0 ; i < m ; i++ ){
                for(int j = 0 ; j < n ; j++){
                    dp[i][j] = -1;
                }
            }
            return countWaysUtil(m - 1 , n - 1 , dp);
        }
    }

    //Tabulation 
    class Solution3 {

      public int uniquePaths(int m, int n) {
          int [][] dp = new int [m][n];
          for(int i = 0 ; i< m ; i++){
              for(int j =0 ; j< n ; j++){
                  if(i==0 && j==0 ) {
                      dp[0][0] = 1;
                       continue;
                  }
                  else {
                      int up = 0 ;
                      if(i>0) up = dp[i-1][j];
                      int down = 0;
                      if(j>0) down = dp[i][j-1];
                      
                      dp[i][j] = up + down;
                  }
              }
          }
          return dp[m-1][n-1];
      }
  } 



//Unique Paths II
//https://leetcode.com/problems/unique-paths-ii/


///Space Optimsed 

class Solution {
  
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int [] prev = new int [m];
        
         for(int i=0; i<n ;i++){
             int [] temp = new int [m];
           for(int j=0; j<m; j++){
                 if(obstacleGrid[i][j]==1){
                    temp[j]=0;
                    continue;
                  }
                  if(i==0 && j==0){
                      temp[j]=1;
                      continue;
                  }

                   int up=0;
                    int left =0;

                    if(i>0)
                        up = prev[j];
                    if(j>0)
                        left = temp[j-1];

                    temp[j] = up + left;
                }
                prev = temp;
            }
        
          return prev[m - 1];
    }
}

//Memoization 

class Solution2 {
    public  int F(int n , int m , int[][] arr , int[][] dp){
        if(n >= 0 && m >= 0 && arr[n][m] == 1)return 0;
        if(n==0 && m==0)return 1;
        if(n<0 || m<0)return 0;
        
        if(dp[n][m] != -1)return dp[n][m];
        
        int up = 0;
        int left = 0;
        
        
        if(n>0) up = F(n-1 , m  ,arr , dp );
        if(m>0) left = F(n , m-1 , arr , dp );
        
        return dp[n][m] = up + left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int [][] dp = new int [n][m];
        for(int i =  0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                dp[i][j] = -1;
            }
        }
        return F( n - 1 , m - 1 , obstacleGrid , dp);
    }
}

//Tabulations
class Solution3 {
  
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int [][] dp = new int [n][m];
        
         for(int i=0; i<n ;i++){
           for(int j=0; j<m; j++){
                 if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                  }
                  if(i==0 && j==0){
                      dp[i][j]=1;
                      continue;
                  }

                  int up=0;
                  int left = 0;

                  if(i>0) 
                    up = dp[i-1][j];
                  if(j>0)
                    left = dp[i][j-1];

                  dp[i][j] = up+left;
                }
            }
        
          return dp[n-1][m-1];
    }
} 
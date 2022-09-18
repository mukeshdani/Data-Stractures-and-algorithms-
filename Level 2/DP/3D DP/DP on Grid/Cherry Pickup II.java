//Cherry Pickup II
//https://leetcode.com/problems/cherry-pickup-ii/

//Space Optimiztaion 

class Solution {
    
    public int cherryPickup(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length;
         int[][] front = new int[m][m];
            int[][] cur = new int[m][m];

            for (int j1 = 0; j1 < m; j1++) {
              for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2)
                  front[j1][j2] = grid[n - 1][j1];
                else
                  front[j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
              }
            }
     
    
    for (int i = n - 2; i >= 0; i--) {
      for (int j1 = 0; j1 < m; j1++) {
        for (int j2 = 0; j2 < m; j2++) {

          int maxi = Integer.MIN_VALUE;
          for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {

              int ans;

              if (j1 == j2)
                ans = grid[i][j1];
              else
                ans = grid[i][j1] + grid[i][j2];

              if ((j1 + di < 0 || j1 + di >= m) ||
                (j2 + dj < 0 || j2 + dj >= m))

                ans += (int) Math.pow(-10, 9);
              else
                ans += front[j1 + di][j2 + dj];

              maxi = Math.max(ans, maxi);
            }
          }
          cur[j1][j2] = maxi;
        }
      }

      for (int a = 0; a < m; a++) {
        front[a] = (int[])(cur[a].clone());
      }
    }

    return front[0][m - 1];
    }
}

//Memoization 

class Solution2 {
    public int F(int i , int j1 , int j2 , int r  , int c  , int[][] grid , int [][][] dp){
        if(j1 < 0 || j2 < 0 || j1>= c || j2>= c)return (int)-1e9;
        
        if(i == r - 1){
            if(j1 == j2)return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1 )return dp[i][j1][j2];
        
        int maxi = (int)-1e9;
        for(int j1i = -1 ; j1i <= +1 ; j1i++){
            for(int j2i = -1 ; j2i <= +1 ; j2i++){
                int value = 0 ;
                
                if(j1 == j2) value = grid[i][j1];
                else value = grid[i][j1] + grid[i][j2];
                
                value += F(i+1 , j1 + j1i , j2 + j2i ,  r, c, grid , dp);
                
                maxi = Math.max(maxi , value);
            }
        }
        return dp[i][j1][j2] = maxi;
    }
    public int cherryPickup(int[][] grid) {
        int [][][] dp = new int [grid.length][grid[0].length][grid[0].length];
        for(int i = 0; i<grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                for(int k = 0 ; k<grid[0].length ; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return F(0 , 0 , grid[0].length - 1 , grid.length , grid[0].length , grid , dp);
    }
}


//Tabulation

class Solution3 {
    
    public int cherryPickup(int[][] grid) {
        int [][][] dp = new int [grid.length][grid[0].length][grid[0].length];
      
        //base 
        for(int j1 = 0 ; j1 < grid[0].length ; j1++){
            for(int j2 = 0 ; j2 < grid[0].length ; j2++){
                if(j1 == j2 ) dp[grid.length - 1][j1][j2] = grid[grid.length - 1][j1];
                else dp[grid.length - 1][j1][j2] = grid[grid.length - 1][j1] + grid[grid.length - 1][j2] ;
            }
        }
        
        for(int i = grid.length - 2 ; i >=0 ; i--){
            for(int j1 = 0 ; j1 < grid[0].length ; j1++){
                for(int j2 = 0 ; j2 < grid[0].length ; j2++){
                        int maxi = (int)-1e9;
                    for(int j1i = -1 ; j1i <= +1 ; j1i++){
                        for(int j2i = -1 ; j2i <= +1 ; j2i++){
                          
                            int ans = 0 ;
                            if(j1 == j2) ans = grid[i][j1];
                            else ans = grid[i][j1] + grid[i][j2];
                            
                            if((j1+j1i < 0 || j1+j1i >= grid[0].length) || (j2+j2i < 0 || j2 + j2i >= grid[0].length) )
                                ans+=(int)-1e9;
                            else
                                ans+=dp[i+1][j1 + j1i][j2+j2i];
                            
                            maxi = Math.max(maxi ,ans);
                        }
                    }
                    dp[i][j1][j2] = maxi;
                }
            }
        }
        return dp[0][0][grid[0].length - 1];
    }
}
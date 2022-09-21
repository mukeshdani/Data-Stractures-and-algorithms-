// /Cherry Pickup
//https://leetcode.com/problems/cherry-pickup/

//Memoizations

class Solution1 {
    public int F(int row1 , int col1 , int row2, int col2 , int[][] grid , int [][][] dp){
       
        if(row1 >= grid.length || col1 >= grid[0].length || grid[row1][col1] == -1 ||
          row2 >= grid.length || col2 >= grid[0].length || grid[row2][col2] == -1){
            return (int)-1e8;
        }
        
        if(row1 == grid.length - 1 && col1 == grid[0].length - 1){
            return grid[row1][col1];
        }
        if(dp[row1][col1][row2] != -1)return dp[row1][col1][row2];
        
        int ans = grid[row1][col1] + grid[row2][col2];
        if(row1 == row2 && col1 == col2) ans -= grid[row1][col1];
        
        int RR = F(row1 , col1 + 1 , row2 , col2 + 1 , grid , dp);
        int RD = F(row1 , col1 + 1 , row2 + 1, col2 , grid , dp);
        int DR = F(row1 + 1 , col1 , row2 , col2 + 1 , grid , dp);
        int DD = F(row1 + 1 , col1, row2 + 1 , col2  , grid , dp);
        
        return dp[row1][col1][row2] =  Math.max(Math.max(RR , RD) , Math.max(DR , DD)) + ans;
        
    }
    public int cherryPickup(int[][] grid) {
        int [][][] dp = new int [grid.length][grid[0].length][grid.length];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                for(int k = 0 ; k< dp[0][0].length ; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans =  F(0 , 0 , 0 , 0  , grid , dp);
        if(ans <= 0)return 0;
        return ans;
    }
}

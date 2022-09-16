//Minimum Path Sum
//https://leetcode.com/problems/minimum-path-sum/


//Space Optimised 

class Solution1 {
  
    public int minPathSum(int[][] grid) {
        int[] prev = new int[grid[0].length];
        
        for(int i = 0 ; i< grid.length ; i++){
            int [] temp = new int[grid[0].length];
            for(int j = 0 ; j< grid[0].length ; j++){
                if(i==0 && j==0){
                    temp[j] = grid[0][0];
                    continue;
                }else {
                    int up = grid[i][j];
                    int left = grid[i][j];
                    if(i>0) up+=prev[j];
                    else up+=(int)Math.pow(10,9);
                    if(j>0) left+=temp[j-1];
                    else left+=(int)Math.pow(10,9);
                    
                    temp[j] =  Math.min(up , left);
                }
            }
            prev = temp;
        }
        return prev[grid[0].length - 1];
        
    }
}





//memoization

class Solution2 {
    public int F(int i , int j , int[][] arr , int[][] dp){
        if(i==0 && j==0)return arr[0][0];
        if(i < 0 || j < 0)return (int)Math.pow(10,9);
        
        if(dp[i][j] != -1)return dp[i][j];
        
        int up = arr[i][j] + F(i-1 , j , arr , dp);
        int left = arr[i][j] + F(i , j-1 , arr , dp);
        
        return dp[i][j] = Math.min(up , left);
    }
    public int minPathSum(int[][] grid) {
        int [][] dp = new int [grid.length][grid[0].length];
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(grid.length - 1, grid[0].length - 1, grid , dp);
    }
}



//Tabulation 
class Solution3 {
  
    public int minPathSum(int[][] grid) {
        int [][] dp = new int [grid.length][grid[0].length];
        
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                if(i==0 && j==0){
                    dp[i][j] = grid[0][0];
                    continue;
                }else {
                    int up = grid[i][j];
                    int left = grid[i][j];
                    if(i>0) up+=dp[i-1][j];
                    else up+=(int)Math.pow(10,9);
                    if(j>0) left+=dp[i][j-1];
                    else left+=(int)Math.pow(10,9);
                    
                    dp[i][j] = Math.min(up , left);
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
        
    }
}
//Minimum Falling Path Sum
//https://leetcode.com/problems/minimum-falling-path-sum/

//Space Optimised 

class Solution1{
    
    public int minFallingPathSum(int[][] matrix) {
        
         int mini = Integer.MAX_VALUE;
        int [] prev = new int [matrix.length];
      
        for(int j = 0 ; j< matrix.length ; j++)prev[j] = matrix[0][j];
        
        for(int i = 1 ; i< matrix.length ; i++){
            int [] curr = new int [matrix.length];
            for(int j = 0  ; j < matrix[0].length ; j++){
                int s = matrix[i][j] + prev[j];
                
                int sl = matrix[i][j];
                if(j-1>=0) sl+=prev[j-1];
                else sl+=(int)Math.pow(10,9);
                
                int sr = matrix[i][j];
                if(j+1 < matrix[0].length) sr+= prev[j+1];
                else sr+=(int)Math.pow(10,9);
                
                curr[j] = Math.min( s, Math.min(sr , sl));
            }
            prev = curr;
        }
        
        for(int j = 0 ; j < matrix[0].length ; j++){
            mini = Math.min(mini , prev[j]);
        }
       return mini;
    }
}

//Mamoization 

class Solution2{
    public int F(int i , int j , int [][] arr , int [][] dp){
        if(j < 0 || j >= arr.length) return (int)Math.pow(10,9);;
        if(i==0) return arr[0][j];
        
        if(dp[i][j] != -1)return dp[i][j];
        int up = arr[i][j] + F(i-1 , j , arr , dp);
        int upl = arr[i][j] + F(i-1 , j-1 , arr , dp);
        int upr = arr[i][j] + F(i-1 , j+1 , arr , dp);
        
        return dp[i][j] = Math.min(up , Math.min(upr , upl));
    }
    public int minFallingPathSum(int[][] matrix) {
        
         int mini = Integer.MAX_VALUE;
        int [][] dp = new int [matrix.length][matrix[0].length];
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0  ;j < matrix[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        
        for(int j=0; j<matrix.length;j++){
            int ans = F(matrix.length - 1,j,matrix , dp);
            mini = Math.min(mini,ans);
        }
       return mini;
    }
}

//tabulation 

class Solution3 {
    
    public int minFallingPathSum(int[][] matrix) {
        
         int mini = Integer.MAX_VALUE;
        int [][] dp = new int [matrix.length][matrix[0].length];
      
        for(int j = 0 ; j< matrix.length ; j++)dp[0][j] = matrix[0][j];
        
        for(int i = 1 ; i< matrix.length ; i++){
            for(int j = 0  ; j < matrix[0].length ; j++){
                int s = matrix[i][j] + dp[i-1][j];
                
                int sl = matrix[i][j];
                if(j-1>=0) sl+=dp[i-1][j-1];
                else sl+=(int)Math.pow(10,9);
                
                int sr = matrix[i][j];
                if(j+1 < matrix[0].length) sr+= dp[i-1][j+1];
                else sr+=(int)Math.pow(10,9);
                
                dp[i][j] = Math.min( s, Math.min(sr , sl));
            }
        }
        
        for(int j = 0 ; j < matrix[0].length ; j++){
            mini = Math.min(mini , dp[matrix.length - 1][j]);
        }
       return mini;
    }
}
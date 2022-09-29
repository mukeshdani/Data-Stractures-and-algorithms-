//Matrix Chain Multiplication
//https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1



//Memoization 

class Solution2{
    public static int F(int i , int j  , int [] arr , int [][] dp){
        if(i == j) return 0;
        if(dp[i][j] != -1)return dp[i][j] ;
        int mini = (int)1e9;
        for(int k = i ; k < j ; k++){
            int steps = arr[i-1]*arr[k]*arr[j] + F(i, k , arr , dp) + F(k+1 , j , arr , dp);
            mini = Math.min(mini , steps);
        }
        return dp[i][j] = mini;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        int [][] dp = new int[N][N];
        for(int i = 0 ; i< N ; i++){
            for(int j = 0 ; j<N ; j++){
                dp[i][j] = -1;
            }
        }
       return F(1 , N-1 , arr , dp);
    }
}

//Tabulation 

class Solution{
   
    static int matrixMultiplication(int N, int arr[])
    {
        int [][] dp = new int[N][N];
        
        for(int i = 0 ; i< N ; i++){
            dp[i][i] = 0;
        }
        
        for(int i = N-1 ; i>=1 ; i--){
            for(int j = i+1 ; j<N ; j++){
                int mini = (int)1e9;
                 for(int k = i ; k < j ; k++){
                    int steps = arr[i-1]*arr[k]*arr[j] + dp[i][k]+ dp[k+1][j];
                    mini = Math.min(mini , steps);
                }
                dp[i][j] = mini;
            }
        }
        
        return dp[1][N-1];
    }
}
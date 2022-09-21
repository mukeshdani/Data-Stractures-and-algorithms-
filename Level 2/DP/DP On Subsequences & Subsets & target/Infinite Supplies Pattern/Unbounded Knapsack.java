//Unbounded Knapsack
//https://www.codingninjas.com/codestudio/problems/unbounded-knapsack_1215029

//Space Opimised 
//Using only 1 row 

class Solution {
  
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int [] curr = new int [w+1];
        for(int i = weight[0] ; i <= w ; i++){
            curr[i] = ((int)i/weight[0])*profit[0];
        }
        
        for(int idx = 1 ; idx < n ; idx++){
            for(int W = 0 ; W <= w ; W++){
                int notTake = 0 + curr[W];
                int Take = (int)-1e9;
                if(weight[idx] <= W) Take = profit[idx] + curr[W - weight[idx]];

                curr[W] = Math.max(notTake , Take);
            }
        }
        
      return curr[w];
    }
}




//Space Optimized
//Using 2 row 
class Solution1{
  
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int [] prev = new int [w+1];
        for(int i = weight[0] ; i <= w ; i++){
            prev[i] = ((int)i/weight[0])*profit[0];
        }
        
        for(int idx = 1 ; idx < n ; idx++){
            int [] curr = new int [w+1];
            for(int W = 0 ; W <= w ; W++){
                int notTake = 0 + prev[W];
                int Take = (int)-1e9;
                if(weight[idx] <= W) Take = profit[idx] + curr[W - weight[idx]];

                curr[W] = Math.max(notTake , Take);
            }
            prev = curr;
        }
        
      return prev[w];
    }
}



//Memoiztaion 

 class Solution2 {
    public static int F(int idx , int W , int[] profit , int [] wt , int[][] dp){
        if(idx == 0){
            return (W/wt[0])*profit[0];
        }
        if(dp[idx][W] != -1)return dp[idx][W];
        
        int notTake = 0 + F(idx - 1, W , profit , wt , dp);
        int Take = (int)-1e9;
        if(wt[idx] <= W) Take = profit[idx] + F(idx , W - wt[idx] , profit , wt , dp);
        
        return dp[idx][W] = Math.max(notTake , Take);
    }
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int [][] dp = new int [n][w+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
      return F(n - 1 , w , profit , weight , dp);
    }
}


//Tabulation 

class Solution3 {
  
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int [][] dp = new int [n][w+1];
        for(int i = weight[0] ; i <= w ; i++){
            dp[0][i] = ((int)i/weight[0])*profit[0];
        }
        
        for(int idx = 1 ; idx < n ; idx++){
            for(int W = 0 ; W <= w ; W++){
                int notTake = 0 +dp[idx - 1][W];
                int Take = (int)-1e9;
                if(weight[idx] <= W) Take = profit[idx] + dp[idx][W - weight[idx]];

                dp[idx][W] = Math.max(notTake , Take);
            }
        }
        
      return dp[n - 1][w];
    }
}

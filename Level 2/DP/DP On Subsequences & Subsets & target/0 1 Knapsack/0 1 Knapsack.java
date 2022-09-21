//0 1 Knapsack
//https://www.codingninjas.com/codestudio/problems/0-1-knapsack_920542?leftPanelTab=0


//Space Optimization
//Uisng One row only 


class Solution0{ 
    static int knapsack(int[] wt, int[] val, int n, int maxWeight) {
        int [] prev = new int [maxWeight + 1];
        for(int W = wt[0] ; W<= maxWeight ; W++)prev[W] = val[0];
        
        for(int i = 1 ; i < n ; i++){
            for(int w = maxWeight ; w >= 0  ; w--){
                 int notTake = 0 +prev[w];
                 int Take = Integer.MIN_VALUE;
                 if(wt[i] <= w) Take = val[i] + prev[w - wt[i]];
                 prev[w] =  Math.max(notTake , Take);
            }
        }
        return prev[maxWeight];
    }
}



//Space Optimization
//Using 2 rows 


class Solution1{ 
    static int knapsack(int[] wt, int[] val, int n, int maxWeight) {
        int [] prev = new int [maxWeight + 1];
        for(int W = wt[0] ; W<= maxWeight ; W++)prev[W] = val[0];
        
        for(int i = 1 ; i < n ; i++){
            int [] curr =new int [maxWeight + 1];
            for(int w = 0 ; w <= maxWeight ; w++){
                 int notTake = 0 +prev[w];
                 int Take = Integer.MIN_VALUE;
                 if(wt[i] <= w) Take = val[i] + prev[w - wt[i]];
                 curr[w] =  Math.max(notTake , Take);
            }
            prev = curr;
        }
        return prev[maxWeight];
    }
}







//Memoization 


class Solution2{
    static int F(int idx , int w , int [] wt , int [] val  , int[][] dp ){
        if(idx == 0){
            if(wt[0] <= w)return val[0];
            else return 0;
        }
        if(dp[idx][w] != -1)return dp[idx][w];
        int notTake = 0 + F(idx - 1 , w, wt , val , dp);
        int Take = Integer.MIN_VALUE;
        if(wt[idx] <= w) Take = val[idx] + F(idx - 1 , w - wt[idx] , wt , val, dp);
        return dp[idx][w] =  Math.max(notTake , Take);
    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int [][] dp = new  int [n][maxWeight + 1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1 ;
            }
        }
        return F(n - 1 , maxWeight , weight , value , dp );
    }
}


//Tabulation



class Solution3{
    
    static int knapsack(int[] wt, int[] val, int n, int maxWeight) {
        int [][] dp = new  int [n][maxWeight + 1];
        for(int W = wt[0] ; W<= maxWeight ; W++)dp[0][W] = val[0];
        
        for(int i = 1 ; i < n ; i++){
            for(int w = 0 ; w <= maxWeight ; w++){
                 int notTake = 0 +dp[i - 1][w];
                 int Take = Integer.MIN_VALUE;
                 if(wt[i] <= w) Take = val[i] + dp[i - 1][w - wt[i]];
                 dp[i][w] =  Math.max(notTake , Take);
            }
        }
        return dp[n - 1][maxWeight];
    }
}
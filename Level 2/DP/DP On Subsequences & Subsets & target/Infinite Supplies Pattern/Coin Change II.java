//Coin Change II
//https://leetcode.com/problems/coin-change-ii/


//Space optimization 

class Solution1 {
  
    public int change(int amount, int[] coins) {
        int n = coins.length ;
        int [] prev = new int [amount + 1];
        for(int i = 0 ; i<= amount ; i++){
            if(i%coins[0] == 0)prev[i] = 1;
            else prev[i] = 0;
        }
        
        for(int idx = 1 ; idx < n ; idx++){
            int [] curr = new int [amount + 1];
            for(int target = 0 ; target <= amount ; target++){
               int notTake =prev[target] ;
               int Take = 0; 
               if(coins[idx] <= target) Take =curr[target - coins[idx]] ;

               curr[target] = Take + notTake; 
            }
            prev = curr;
        }
        
        return prev[amount];
    }
}

//Memoization 

class Solution2 {
    public int F(int idx , int target , int [] arr , int [][] dp){
        if(idx == 0){
            if(target % arr[0] == 0)return 1 ;
            else return 0;
        }
        if(dp[idx][target] != -1) return dp[idx][target];
        
        int notTake = F(idx - 1 , target , arr , dp);
        int Take = 0; 
        if(arr[idx] <= target) Take = F(idx , target - arr[idx] , arr , dp);
        
        return dp[idx][target] = Take + notTake;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length ;
        int [][] dp = new int [n][amount + 1];
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(n-1 , amount , coins , dp);
    }
}

///tabulation 

class Solution3{
  
    public int change(int amount, int[] coins) {
        int n = coins.length ;
        int [][] dp = new int [n][amount + 1];
        for(int i = 0 ; i<= amount ; i++){
            if(i%coins[0] == 0)dp[0][i] = 1;
            else dp[0][i] = 0;
        }
        
        for(int idx = 1 ; idx < n ; idx++){
            for(int target = 0 ; target <= amount ; target++){
               int notTake = dp[idx - 1][target] ;
               int Take = 0; 
               if(coins[idx] <= target) Take =dp[idx][target - coins[idx]] ;

               dp[idx][target] = Take + notTake; 
            }
        }
        
        return dp[n-1][amount];
    }
}
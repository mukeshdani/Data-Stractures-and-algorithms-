//Coin Change
//https://leetcode.com/problems/coin-change/

//Space Optimization 

class Solution1 {
  
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ; 
        int []  prev = new int [amount+1];
        
        for(int i=0; i<=amount; i++){
            if(i%coins[0] == 0)  
               prev[i] = i/coins[0];
            else prev[i] = (int)Math.pow(10,9);
        }
        for(int idx = 1 ; idx < n ; idx++){
             int []  curr = new int [amount+1];
            for(int target = 0 ; target <= amount ; target++){
                 int notTake = 0 + prev[target];
                 int Take = Integer.MAX_VALUE;
                 if(coins[idx] <= target)Take = 1 + curr[target - coins[idx]];

                 curr[target] = Math.min(Take , notTake);
            }
            prev = curr;
        }
        int ans = prev[amount];
        if(ans>=(int)1e9)return -1;
        return ans;
    }
}

//Memoization 

class Solution2 {
    public int F(int idx , int target , int[] arr,  int [][]  dp  ){
        if(idx == 0 ){
            if(target % arr[0] == 0)return target/arr[0];
            else return (int)1e9;
        }
        if(dp[idx][target] != -1)return dp[idx][target];
        
        int notTake = 0 + F(idx - 1, target , arr , dp);
        int Take = Integer.MAX_VALUE;
        if(arr[idx] <= target)Take = 1 + F(idx , target - arr[idx] , arr , dp);
        
        return dp[idx][target] = Math.min(Take , notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ; 
        int [][]  dp = new int [n][amount+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = -1;
            }
        } 
        int ans = F(n-1, amount , coins , dp);
        if(ans>=(int)1e9)return -1;
        return ans;
    }
}


//tabulation 

class Solution3 {
  
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ; 
        int [][]  dp = new int [n][amount+1];
        
        for(int i=0; i<=amount; i++){
            if(i%coins[0] == 0)  
                dp[0][i] = i/coins[0];
            else dp[0][i] = (int)Math.pow(10,9);
        }
        for(int idx = 1 ; idx < n ; idx++){
            for(int target = 0 ; target <= amount ; target++){
                 int notTake = 0 + dp[idx - 1][target];
                 int Take = Integer.MAX_VALUE;
                 if(coins[idx] <= target)Take = 1 + dp[idx][target - coins[idx]];

                 dp[idx][target] = Math.min(Take , notTake);
            }
        }
        int ans = dp[n-1][amount];
        if(ans>=(int)1e9)return -1;
        return ans;
    }
}
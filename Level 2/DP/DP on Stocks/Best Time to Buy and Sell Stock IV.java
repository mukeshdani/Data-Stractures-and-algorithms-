//Best Time to Buy and Sell Stock IV
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/


class Solution {
    public int maxProfit(int k, int[] prices) {
            int n = prices.length;
            int [][] after = new int [2][k+1];
            int [][] curr = new int [2][k+1];
            int profit = 0;
            for(int idx = n-1 ; idx>=0 ; idx--){
                for(int buy = 0 ; buy <=1 ; buy++){
                    for(int cap = 1 ; cap <= k; cap++){
                         if(buy==1){
                            profit = Math.max(-prices[idx] + after[0][cap], 0 + after[1][cap]); 
                        }else {
                            profit = Math.max(prices[idx] + after[1][cap - 1], 0 + after[0][cap]);
                        }
                           curr[buy][cap] = profit ;
                    }
                }
                after = curr;
            }
            return after[1][k];
    }
}



//Memoization 
//Diffrenet app.

class Solution2{
    public int F(int idx , int tran , int k , int[] arr , int[][] dp){
        if(idx == arr.length  || tran == 2*k)return 0; 
        if(dp[idx][tran] != -1)return dp[idx][tran];
        if(tran % 2 == 0) return dp[idx][tran]=Math.max(-arr[idx] + F(idx + 1 , tran + 1 , k , arr , dp) , 0 + F(idx + 1 , tran , k , arr , dp));
         return dp[idx][tran]=Math.max(arr[idx] + F(idx + 1 , tran + 1 , k , arr , dp) , 0 + F(idx + 1 , tran , k , arr , dp));
    }
    public int maxProfit(int k, int[] prices) {
        int [][] dp = new int [prices.length][2*k];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(0,0,k,prices,dp);
    }
}


//Tabulation 
class Solution3{
  
    public int maxProfit(int k, int[] prices) {
        int [][] dp = new int [prices.length + 1][2*k + 1];
        
        for(int idx = prices.length - 1 ; idx >= 0 ; idx--){
            for(int tran = 2*k - 1 ; tran >=0 ; tran--){
              if(tran % 2 == 0) dp[idx][tran]=Math.max(-prices[idx] + dp[idx + 1][tran + 1] , 0 + dp[idx + 1][tran]);
              else dp[idx][tran]=Math.max(prices[idx] + dp[idx + 1][tran + 1], 0 + dp[idx + 1][tran]);   
            }
        }
        return dp[0][0];
    }
}


//Space 
class Solution4{
  
    public int maxProfit(int k, int[] prices) {
        int []ahead= new int [2*k + 1];
        int []curr= new int [2*k + 1];
        for(int idx = prices.length - 1 ; idx >= 0 ; idx--){
            for(int tran = 2*k - 1 ; tran >=0 ; tran--){
              if(tran % 2 == 0) curr[tran]=Math.max(-prices[idx] + ahead[tran + 1] , 0 + ahead[tran]);
              else curr[tran]=Math.max(prices[idx] + ahead[tran + 1], 0 + ahead[tran]);   
            }
            ahead = curr;
        }
        return ahead[0];
    }
}
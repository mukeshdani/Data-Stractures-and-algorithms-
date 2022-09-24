//Best Time to Buy and Sell Stock with Cooldown
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/

//Memoization 

class Solution3{
    public int F(int idx , int buy , int [] arr , int [][] dp){
        if(idx >= arr.length)return 0;
        if(dp[idx][buy]!=-1)return dp[idx][buy];
        if(buy == 1){
            return dp[idx][buy]=Math.max(-arr[idx] + F(idx + 1 , 0 , arr , dp) , 0 + F(idx + 1 , 1 , arr , dp));
        }else {
            return dp[idx][buy]=Math.max(arr[idx] + F(idx + 2 , 1 , arr , dp) , 0 + F(idx + 1 , 0 , arr , dp));
        }
    }
    public int maxProfit(int[] prices) {
        int [][] dp = new int [prices.length][2];
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(0 , 1 , prices , dp);
    }
}

//Tabulation 
class Solution4{
   
    public int maxProfit(int[] prices) {
        int [][] dp = new int [prices.length + 2][2];
        
        for(int idx = prices.length - 1 ; idx >=0 ; idx--){
            for(int buy = 0; buy<=1 ; buy++){
                 if(buy == 1){
                    dp[idx][buy]=Math.max(-prices[idx] + dp[idx + 1][0], 0 + dp[idx + 1][1]);
                }else {
                    dp[idx][buy]=Math.max(prices[idx] + dp[idx + 2][1], 0 + dp[idx + 1][0]);
                }
            }
        }
        return dp[0][1];
    }
}



//Space 
class Solution {
   
    public int maxProfit(int[] prices) {
        int [][] dp = new int [prices.length + 2][2];
        
        for(int idx = prices.length - 1 ; idx >=0 ; idx--){
                    dp[idx][1]=Math.max(-prices[idx] + dp[idx + 1][0], 0 + dp[idx + 1][1]);
                    dp[idx][0]=Math.max(prices[idx] + dp[idx + 2][1], 0 + dp[idx + 1][0]);
        }
        return dp[0][1];
    }
}

//Space optimisd 

class Solution1{
   
    public int maxProfit(int[] prices) {
         int [] front2 = new int [2];
         int [] front1 = new int [2];
         int [] curr = new int [2];
        
        for(int idx = prices.length - 1 ; idx >=0 ; idx--){
             curr[1]=Math.max(-prices[idx] + front1[0],front1[1]);
             curr[0]=Math.max(prices[idx] + front2[1],front1[0]);
             front2 = (int[])(front1.clone());
             front1 = (int[])(curr.clone());
        }
        return curr[1];
    }
}
//Best Time to Buy and Sell Stock II
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

//Space optimization 
//Using Two variable only 
class Solution{
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int aheadNotBuy , aheadBuy ;
        aheadNotBuy = aheadBuy = 0;
        for(int idx = n-1 ; idx>=0 ; idx--){
              aheadNotBuy = Math.max(0+aheadNotBuy, prices[idx] + aheadBuy); 
            aheadBuy = Math.max(0+aheadBuy, -prices[idx] + aheadNotBuy);
         
        }
        return aheadBuy;
    }
}



//Space optimization 
//Using only one row

class Solution0 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        long []prev = new long[2];
        prev[0] = prev[1] = 0;
        long profit=0;
        for(int idx = n-1 ; idx>=0 ; idx--){
              for(int buy=0; buy<=1; buy++){
                if(buy==0){
                    profit = Math.max(0+prev[0], -prices[idx] + prev[1]);
                }
                if(buy==1){
                    profit = Math.max(0+prev[1], prices[idx] + prev[0]);
                }
                prev[buy]  = profit;
              }
        }
        return (int)prev[0];
    }
}


//Space Optmization 
//Using two row 
class Solution1{
  
    public int maxProfit(int[] prices) {
        int n = prices.length;
        long []prev = new long[2];
        prev[0] = prev[1] = 0;
        long profit=0;
        for(int idx = n-1 ; idx>=0 ; idx--){
            long []curr = new long[2];
              for(int buy=0; buy<=1; buy++){
                if(buy==0){
                    profit = Math.max(0+prev[0], -prices[idx] + prev[1]);
                }
                if(buy==1){
                    profit = Math.max(0+prev[1], prices[idx] + prev[0]);
                }
                curr[buy]  = profit;
              }
            prev = curr;
        }
        return (int)prev[0];
    }
}


//Memoization 

class Solution2{
    public int F(int idx , int buy , int[] arr , int[][] dp){
        if(idx == arr.length)return 0;
        int profit;
        
        if(dp[idx][buy] != -1)return dp[idx][buy];
        if(buy == 1){
            profit = Math.max(-arr[idx] + F(idx+1 , 0 , arr , dp) , 0 + F(idx+1 , 1, arr , dp));
        }else {
            profit = Math.max(+arr[idx] + F(idx+1 , 1, arr , dp) , 0 + F(idx+1 , 0 , arr , dp));
        }
        return dp[idx][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int[n][2];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j  = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return F(0,1,prices , dp);
    }
}

//Tabulation 

class Solution3{
  
    public int maxProfit(int[] prices) {
        int n = prices.length;
        long [][] dp = new long[n+1][2];
        dp[n][0] = dp[n][1] = 0;
        long profit=0;
        for(int idx = n-1 ; idx>=0 ; idx--){
              for(int buy=0; buy<=1; buy++){
                if(buy==0){
                    profit = Math.max(0+dp[idx+1][0], -prices[idx] + dp[idx+1][1]);
                }
                if(buy==1){
                    profit = Math.max(0+dp[idx+1][1], prices[idx] + dp[idx+1][0]);
                }
                dp[idx][buy]  = profit;
              }
        }
        return (int)dp[0][0];
    }
}
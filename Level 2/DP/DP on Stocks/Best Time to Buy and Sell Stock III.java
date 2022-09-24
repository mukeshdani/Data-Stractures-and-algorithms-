//Best Time to Buy and Sell Stock III

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

//Space optimization 

class Solution1{
    public int maxProfit(int[] prices) {
         int n = prices.length;
        int [][] after = new int [2][3];
        int profit = 0;
        for(int idx = n-1 ; idx>=0 ; idx--){
            int [][] curr = new int [2][3];
            for(int buy = 0 ; buy <=1 ; buy++){
                for(int cap = 1 ; cap <= 2 ; cap++){
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
        return after[1][2];
    }
}

//Memoization 
class Solution3{
    public int F(int idx , int buy , int cap , int[] arr , int [][][] dp ){
        if(cap == 0)return 0;
        if(idx == arr.length)return 0;
        int profit = 0;
        if(dp[idx][buy][cap]!=-1)return dp[idx][buy][cap];
        if(buy==1){
            profit = Math.max(-arr[idx] + F(idx + 1 , 0 , cap , arr , dp) , 0 + F(idx + 1 , 1 , cap , arr , dp)); 
        }else {
            profit = Math.max(arr[idx] + F(idx + 1 , 1 , cap - 1 , arr , dp) , 0 + F(idx + 1 , 0 , cap , arr , dp));
        }
        return dp[idx][buy][cap] = profit ;
    }
    public int maxProfit(int[] prices) {
         int n = prices.length;
        int [][][] dp = new int [n][2][3];
        for(int i = 0 ;  i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                for(int k = 0 ; k < dp[0][0].length ; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return F(0,1,2,prices , dp);
    }
}
//Tabultaion 
class Solution4 {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        int [][][] dp = new int [n+1][2][3];
        int profit = 0;
        for(int idx = n-1 ; idx>=0 ; idx--){
            for(int buy = 0 ; buy <=1 ; buy++){
                for(int cap = 1 ; cap <= 2 ; cap++){
                     if(buy==1){
                        profit = Math.max(-prices[idx] + dp[idx + 1][0][cap], 0 + dp[idx + 1][1][cap]); 
                    }else {
                        profit = Math.max(prices[idx] + dp[idx + 1][1][cap - 1], 0 + dp[idx + 1][0][cap]);
                    }
                        dp[idx][buy][cap] = profit ;
                }
            }
        }
        return dp[0][1][2];
    }
}
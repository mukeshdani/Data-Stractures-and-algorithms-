//Best Time to Buy and Sell Stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0] , profit = 0;
        
        for(int i = 1; i<prices.length;i++){
            int cost = prices[i] - mini;
            profit = Math.max(cost , profit);
            mini = Math.min(mini , prices[i]);
        }
        return profit;
    }
}
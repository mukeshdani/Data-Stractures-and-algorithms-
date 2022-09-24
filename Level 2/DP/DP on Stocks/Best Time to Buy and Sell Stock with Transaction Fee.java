//Best Time to Buy and Sell Stock with Transaction Fee
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/


class Solution {
    public int maxProfit(int[] prices, int fee) {
            int n = prices.length;
            int aheadNotBuy , aheadBuy ;
            aheadNotBuy = aheadBuy = 0;
            for(int idx = n-1 ; idx>=0 ; idx--){
                  aheadNotBuy = Math.max(0+aheadNotBuy, prices[idx]-fee+ aheadBuy); 
                  aheadBuy = Math.max(0+aheadBuy, -prices[idx] + aheadNotBuy);
            }
            return aheadBuy;
    }
}
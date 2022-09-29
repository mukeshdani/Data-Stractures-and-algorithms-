//Largest Divisible Subset
//https://leetcode.com/problems/largest-divisible-subset/


import java.util.*;
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int [] dp = new int [n];
        int [] hash = new int [n];
        Arrays.fill(hash , 1);
        Arrays.fill(dp , 1);
        
        for(int i = 0 ; i<n ; i++){
            hash[i] = i;
            for(int j = 0 ; j<i ; j++){
                if(nums[i] % nums[j] == 0 && dp[i] < 1 + dp[j]){
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
            }
        }
        
        int ans = -1;
        int last_idx = -1;
        for(int i = 0 ; i< n ; i++){
            if(dp[i] > ans){
                ans = dp[i];
                last_idx = i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[last_idx]);
        while(hash[last_idx] != last_idx){
              last_idx = hash[last_idx];
              list.add(nums[last_idx]);    
        }
        
        
        return list;
    }
}
//Distinct Subsequences II
//https://leetcode.com/problems/distinct-subsequences-ii/

import java.util.*;
class Solution {
    public int distinctSubseqII(String s) {
            int[] dp = new int[s.length()+1];
            int mod = 1000000007;
            dp[0] = 1;
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 1; i<dp.length; i++){
                dp[i] = (dp[i-1]*2)%mod;
                char ch = s.charAt(i-1);
                if(map.containsKey(ch)){
                    int j = map.get(ch);
                    dp[i] = (dp[i] - dp[j-1] + mod)%mod;
                }
                map.put(ch,i);
            }
            return dp[dp.length-1]-1;
    }
}
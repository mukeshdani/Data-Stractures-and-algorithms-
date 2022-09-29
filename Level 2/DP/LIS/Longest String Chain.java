//Longest String Chain
//https://leetcode.com/problems/longest-string-chain/



import java.util.*;
class Solution {
    public boolean compare(String s1 , String s2){
        if(s1.length() != s2.length() + 1)return false;
        
        int first = 0 ;
        int second = 0 ;
        while(first < s1.length()){
            if(second < s2.length() && s1.charAt(first) == s2.charAt(second)){
                first++;
                second++;
            }else {
                first++;
            }
        }
        if(first == s1.length() && second == s2.length())return true;
        return false;
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        Arrays.sort(words,(a,b)->a.length()-b.length());
        
        int [] dp = new int [n];
        Arrays.fill(dp,1);
        int maxi =  0;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                if(compare(words[i] , words[j]) && dp[i] < dp[j] + 1){
                    dp[i] = 1 + dp[j];
                }
            }
            if(maxi < dp[i]){
                maxi = dp[i];
            }
        }
        return maxi;
    }
}
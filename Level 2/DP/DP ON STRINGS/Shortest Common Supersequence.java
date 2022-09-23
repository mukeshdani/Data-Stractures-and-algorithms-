//Shortest Common Supersequence//
//https://leetcode.com/problems/shortest-common-supersequence/


class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int  n = str1.length();
        int  m = str2.length();
        int [][]dp = new int [n+1][m+1];
        for(int j = 0 ; j<= m ; j++){
            dp[0][j] = 0 ;
        }
        
        for(int idx1 = 1 ; idx1 <= n ; idx1++){
            for(int idx2 = 1 ;idx2 <= m ; idx2++){
                if(str1.charAt(idx1-1) == str2.charAt(idx2-1)){
                    dp[idx1][idx2] = 1 + dp[idx1-1][idx2-1];
                }else {
                    dp[idx1][idx2] = 0 + Math.max(dp[idx1-1][idx2],dp[idx1][idx2-1]);
                }
            }
        }
        
        int i = n , j = m;
        String ans ="";
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                ans+=str1.charAt(i-1);
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                ans+=str1.charAt(i-1);
                i--;
            }else {
                ans+=str2.charAt(j-1);
                j--;
            }
        }
        
        while(i>0){
            ans+=str1.charAt(i-1);
            i--;
        }
        
        while(j>0){
            ans+=str2.charAt(j-1);
            j--;
        }
        
        String ns = "";
        for(int k = ans.length()-1 ; k>=0 ; k--){
            ns+=ans.charAt(k);
        }
        return ns;
    }
}
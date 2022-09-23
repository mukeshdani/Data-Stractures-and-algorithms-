//Longest Palindromic Subsequence
//https://leetcode.com/problems/longest-palindromic-subsequence/


//Space optimised 


class Solution {
    public int LCS(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();
        
        int [] prev = new int[m+1];
        
        for(int j = 0 ; j<=m ; j++){
            prev[j] = 0;
        }
        
        for(int idx1 = 1; idx1<=n ; idx1++){
            int [] curr = new int [m+1];
            for(int idx2 = 1 ; idx2 <= m ; idx2++){
                if(s1.charAt(idx1-1)==s2.charAt(idx2 - 1)){
                    curr[idx2] = 1 + prev[idx2 - 1];
                }else {
                   curr[idx2] = 0 + Math.max(prev[idx2] , curr[idx2 - 1]);
                }
            }
            prev = curr;
        }
        return prev[m];
    }
    public int longestPalindromeSubseq(String s) {
        String a = "";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        
        return LCS(s , a);
    }
}

//More Optimised 

class Solution2{
    public int longestPalindromeSubseq(String s) {
    
        int m = s.length();
        int n = s.length();
        int[] curr = new int[n+1];

        for(int i=m;i>0;i--){
            int prev = curr[0];
            for(int j=1;j<=n;j++){
                int temp = curr[j];
                if(s.charAt(i-1) == s.charAt(j-1)){
                     curr[j] =  1 + prev;
                } else {
                    curr[j] = Math.max(curr[j],curr[j-1]);
                }
                prev = temp; 
            }
        }

        return curr[n];        
}
}
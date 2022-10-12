//Palindrome Partitioning II
//https://leetcode.com/problems/palindrome-partitioning-ii/


//Memoization 
class Solution1 {
    public boolean isPalindrome(int i , int j , String temp){
        
        while(i<j){
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int F(int i , int n , String s , int [] dp){
        if(i==n)return 0;
        int mini = Integer.MAX_VALUE;
        if(dp[i] != -1)return dp[i];
        for(int j = i ; j<n ; j++){
            if(isPalindrome(i , j , s) == true){
                int cost = 1 + F(j+1 , n , s , dp);
                mini = Math.min(mini , cost);
            }
        }
        return dp[i] = mini;
    }
    public int minCut(String s) {
        int []dp = new int [s.length()];
        for(int i = 0 ; i < dp.length ; i++){
            dp[i] = -1;
        }
        return  F(0 , s.length() , s , dp) - 1;
    }
}


//Tabulation 
class Solution {
    public boolean isPalindrome(int i , int j , String temp){
        
        while(i<j){
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {
        int []dp = new int [s.length() + 1];
        
        dp[s.length() - 1] = 0;
        
        for(int i = s.length() - 1; i>=0 ; i--){
           int mini = Integer.MAX_VALUE;
            for(int j = i ; j<s.length() ; j++){
                if(isPalindrome(i , j , s) == true){
                    int cost = 1 + dp[j+1];
                    mini = Math.min(mini , cost);
                }
            }
             dp[i] = mini;  
        }
        return  dp[0]- 1;
    }
}
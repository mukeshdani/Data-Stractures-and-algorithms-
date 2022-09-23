//Longest Common Substring
//https://www.codingninjas.com/codestudio/problems/longest-common-substring_1235207?leftPanelTab=0
///


//Space optimization
 class Solution1{
	public static int lcs(String str1, String str2) {
		int n = str1.length();
        int m = str2.length();
        
        int []prev = new int [m+1];
       
        for(int j = 0 ; j<= m ; j++){
            prev[j] = 0;
        }
        int ans = 0 ;
        for(int idx1  = 1 ; idx1 <= n ; idx1++){
              int []curr = new int [m+1];
            for(int idx2 = 1 ; idx2 <= m ; idx2++){
                if(str1.charAt(idx1 - 1)==str2.charAt(idx2 - 1)){
                    curr[idx2] = 1 + prev[idx2 - 1];
                    ans = Math.max(ans , curr[idx2]);
                }else {
                    curr[idx2] = 0;
                }
            }
            prev = curr;
        }
        return ans;
	}
}

//tabulation
class Solution {
	public static int lcs(String str1, String str2) {
		int n = str1.length();
        int m = str2.length();
        
        int [][] dp= new int [n+1][m+1];
        for(int i = 0 ; i<= n ; i++){
            dp[i][0] = 0 ;
        }
        for(int j = 0 ; j<= m ; j++){
            dp[0][j] = 0;
        }
        int ans = 0 ;
        for(int idx1  = 1 ; idx1 <= n ; idx1++){
            for(int idx2 = 1 ; idx2 <= m ; idx2++){
                if(str1.charAt(idx1 - 1)==str2.charAt(idx2 - 1)){
                    dp[idx1][idx2] = 1 + dp[idx1 - 1][idx2 - 1];
                    ans = Math.max(ans , dp[idx1][idx2]);
                }else {
                    dp[idx1][idx2] = 0;
                }
            }
        }
        return ans;
	}
}
//Minimum Number of Deletions and Insertions
//https://www.codingninjas.com/codestudio/problems/can-you-make_4244510?leftPanelTab=0

class Solution {
    public static int LCS(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int [] prev = new int[m+1];
        for(int j = 0 ; j<=m;j++){
            prev[j] = 0;
        }
        for(int idx1 = 1 ; idx1 <= n ; idx1++){
            int [] curr = new int [m+1];
            for(int idx2 = 1 ; idx2 <= m ; idx2++){
                if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
                    curr[idx2] = 1 + prev[idx2-1];
                }else {
                    curr[idx2] = 0 + Math.max(prev[idx2] , curr[idx2-1]);
                }
            }
            prev = curr;
        }
        return prev[m];
    }
    public static int canYouMake(String str, String ptr) {
       return str.length() + ptr.length() - 2*LCS(str , ptr);
    }

}

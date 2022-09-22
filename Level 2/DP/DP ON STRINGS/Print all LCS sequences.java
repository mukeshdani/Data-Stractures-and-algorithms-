//Print all LCS sequences
//https://practice.geeksforgeeks.org/problems/print-all-lcs-sequences3413/1

import java.util.*;
class Solution
{
    List<String> al = new ArrayList<>();
    List<String> res = new ArrayList<>();
    HashSet<String> hs = new HashSet<>();
    
    int tabulation(String s, String t, int n, int m){
        int[][]dp = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            dp[i][0] = 0;
        }
        
        for(int j=0; j<=m; j++){
            dp[0][j] = 0;
        }
        
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
    }
    
    
    void backtrack(String s, String t, int n, int m, int i, int j, int cou){
        
        if(cou==0){
            String ns = String.join("", al);
            
            if(!hs.contains(ns)){
                hs.add(ns);
                res.add(ns);
            }
            return;
        }
        
        for(int r=i; r<n; r++){
            for(int c=j; c<m; c++){
                
                if(s.charAt(r)==t.charAt(c)){
                    al.add(Character.toString(s.charAt(r)));
                    backtrack(s, t, n, m, r+1, c+1, cou-1);
                    al.remove(al.size()-1);
                }
            }
        }
    }
    
    public List<String> all_longest_common_subsequences(String s, String t)
    {
        // Code here
        int n = s.length();
        int m = t.length();
        
        int cou = tabulation(s, t, n, m);
        
        backtrack(s, t, n, m, 0, 0, cou);
        
        Collections.sort(res);
        
        return res;
    }
}

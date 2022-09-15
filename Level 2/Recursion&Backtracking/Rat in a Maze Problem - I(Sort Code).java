//Rat in a Maze Problem - I
//

import java.util.*;
class Solution {
    public static void FindPath(int i , int j , int[][] m, ArrayList<String> ans
    , boolean [][] vis  , String path , int [] di , int [] dj){
        if(i == m.length - 1 && j == m[0].length - 1){
            ans.add(path);
            return ;
        }
        
       String dir = "DLRU";
       for(int idx = 0 ; idx <  4 ; idx++){
           int nexti = i + di[idx];
           int nextj = j + dj[idx];
           if(nexti >= 0  && nextj >= 0 && nexti < m.length && nextj < m.length && vis[nexti][nextj] == false && m[nexti][nextj] == 1){
               vis[i][j] = true;
               FindPath(nexti , nextj , m, ans , vis , path + dir.charAt(idx) , di , dj );
               vis[i][j] = false;
           }
       }
      
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        ArrayList<String> ans = new ArrayList<>();
        boolean [][] vis = new boolean[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j< n ; j++){
                vis[i][j] = false;
            }
        }
        
        int[] di = {+1 , 0  , 0 , -1};
        int[] dj = {0 , -1  , +1 , 0};
        if(m[0][0] == 1){
            FindPath(0 , 0 , m , ans , vis , "" , di , dj);
        }
        return ans;
    }
}
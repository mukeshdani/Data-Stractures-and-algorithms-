//Rat in a Maze Problem - I
//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1


import java.util.*;
class Solution {
    public static void FindPath(int i , int j , int[][] m, ArrayList<String> ans , boolean [][] vis  , String path ){
        if(i == m.length - 1 && j == m[0].length - 1){
            ans.add(path);
            return ;
        }
        
        //Downword
        if(i+1 < m.length && vis[i+1][j] == false && m[i+1][j] == 1 ){
            vis[i][j] = true;
             FindPath(i+1 , j , m , ans , vis , path + 'D');
              vis[i][j] = false;
        }
        //Left
        if(j-1>=0 && vis[i][j-1] == false && m[i][j-1] == 1 ){
            vis[i][j] = true;
            FindPath(i , j-1 , m , ans , vis , path + 'L');
            vis[i][j] = false;
        }
        //up
        if(i-1 >= 0 && vis[i-1][j] == false && m[i-1][j] == 1){
            vis[i][j] = true;
            FindPath(i-1 , j , m  ,ans , vis , path + 'U');
            vis[i][j] = false;
        }
        
        //right
        if(j+1 < m.length && vis[i][j+1] == false && m[i][j+1] == 1){
            vis[i][j] = true;
            FindPath(i , j+1, m , ans, vis , path + 'R');
            vis[i][j] = false;
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
        if(m[0][0] == 1){
            FindPath(0 , 0 , m , ans , vis , "");
        }
        return ans;
    }
}
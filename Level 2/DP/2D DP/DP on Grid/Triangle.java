//Triangle
//https://leetcode.com/problems/triangle/

//Space Optimised 

import java.util.*;

class Solution1 {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int [] Front = new int [triangle.size()];
        
        for(int j = 0 ; j < triangle.size() ; j++){
            Front[j] = triangle.get(triangle.size() - 1).get(j);
        }
        
        for(int i = triangle.size() - 2 ; i>=0 ; i--){
            int [] curr = new int [triangle.size()];
            for(int j = i ; j >= 0  ; j--){
                
                int down = triangle.get(i).get(j) + Front[j];
                int dig = triangle.get(i).get(j) + Front[j+1];
                
                curr[j]= Math.min(down , dig);
            }
            Front = curr;
        }
        return Front[0];
    }
}

//Memoization 

class Solution2 {
    public int F(int i , int j , List<List<Integer>> triangle , int [][] dp ) {
        if(i == triangle.size() - 1)return triangle.get(i).get(j);
        if(dp[i][j] != -1)return dp[i][j];
        
        int down = triangle.get(i).get(j)+ F(i+1 , j , triangle , dp);
        int dig = triangle.get(i).get(j) + F(i+1 , j+1 , triangle , dp);
        
        return dp[i][j] = Math.min(down , dig);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int [][] dp = new int [triangle.size()][triangle.size()];
        for(int i = 0 ; i< triangle.size()  ; i++){
            for(int j = 0 ; j< triangle.size()  ; j++){
                dp[i][j] = -1;
            }
        }
        return F(0 , 0  , triangle , dp);
    }
}


//tabulation


class Solution3 {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int [][] dp = new int [triangle.size()][triangle.size()];
        
        for(int j = 0 ; j < triangle.size() ; j++){
            dp[triangle.size() - 1][j] = triangle.get(triangle.size() - 1).get(j);
        }
        
        for(int i = triangle.size() - 2 ; i>=0 ; i--){
            
            for(int j = i ; j >= 0  ; j--){
                
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int dig = triangle.get(i).get(j) + dp[i + 1][j+1];
                
                dp[i][j] = Math.min(down , dig);
            }
        }
        return dp[0][0];
    }
}
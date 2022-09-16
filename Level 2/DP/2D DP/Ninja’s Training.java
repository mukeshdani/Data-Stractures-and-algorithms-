//Ninja’s Training//
//https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos


class main {
    public static int ninjaTraining(int n, int points[][]) {
      
        int[] prev = new int[4];
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
        
        for(int day = 1; day < n ; day++){
            int []temp = new int[4];
            for(int last = 0 ; last < 4 ; last++){
                temp[last] = 0;
                for(int task = 0 ; task < 3 ; task++){
                     if (task != last) {
                           temp[last] = Math.max(temp[last], points[day][task] + prev[task]);
                     }
                }
            }
            prev = temp;
        }
        return prev[3];   
    }
}


/* 
import java.util.*;
public class Solution2 {
   
    public static int ninjaTraining(int n, int points[][]) {
      
        int[][] dp = new int[n][4];
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
        
        for(int day = 1; day < n ; day++){
            for(int last = 0 ; last < 4 ; last++){
                dp[day][last] = 0;
                for(int task = 0 ; task < 3 ; task++){
                     if (task != last) {
                        int point = points[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(point , dp[day][last]);
                     }
                }
            }
        }
        return dp[n-1][3];   
    }
}
 */



/* 
import java.util.*;
public class Solution {
    public static int F(int day , int last , int [][] points , int [][] dp){
         if(dp[day][last] != -1)return dp[day][last];
        
        if(day == 0){
            int maxi = Integer.MIN_VALUE;
            for(int task = 0 ; task < 3 ; task++){
                if(task != last){
                    maxi = Math.max(maxi , points[0][task]);
                }
            }
            return maxi;
        }
       
        int maxi = Integer.MIN_VALUE;
        for(int task = 0 ; task < 3 ; task++){
            if(task != last){
                int point = points[day][task] + F(day - 1 , task , points , dp);
                maxi = Math.max(maxi , point);
            }
        }
        return dp[day][last] = maxi;
    }
    public static int ninjaTraining(int n, int points[][]) {
        int [][] dp = new int[n][4];
       for(int i = 0 ; i<dp.length ; i++){
           for(int j = 0 ; j < dp[0].length ; j++){
               dp[i][j] = -1;
           }
       }
        return F(n - 1, 3 , points , dp);
    }

}
 */


/* 
//TLE 
import java.util.*;
public class Solution {
    public static int F(int day , int last , int [][] points){
        if(day == 0){
            int maxi = Integer.MIN_VALUE;
            for(int task = 0 ; task < 3 ; task++){
                if(task != last){
                    maxi = Math.max(maxi , points[0][task]);
                }
            }
            return maxi;
        }
        
        int maxi = Integer.MIN_VALUE;
        for(int task = 0 ; task < 3 ; task++){
            if(task != last){
                int point = points[day][task] + F(day - 1 , task , points);
                maxi = Math.max(maxi , point);
            }
        }
        return maxi;
    }
    public static int ninjaTraining(int n, int points[][]) {
             return F(n - 1, 3 , points);
    }

} */
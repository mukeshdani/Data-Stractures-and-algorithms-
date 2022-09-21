//Subset Sum Equal To K
//https://www.codingninjas.com/codestudio/problems/subset-sum-equal-to-k_1550954?leftPanelTab=0
import java.util.*;

//Space Optimised 

class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
         
          boolean prev[]= new boolean[k+1];
    
            prev[0] = true;
    
            if(arr[0]<=k)
                prev[arr[0]] = true;

            for(int ind = 1; ind<n; ind++){
                boolean cur[]=new boolean[k+1];
               cur[0] = true;
                for(int target= 1; target<=k; target++){

                    boolean notTaken = prev[target];

                    boolean taken = false;
                        if(arr[ind]<=target)
                            taken = prev[target-arr[ind]];

                    cur[target]= notTaken||taken;
                }
                prev = cur;
            }

            return prev[k];
    }
}



//Memoization 

class Solution1 {
    public static boolean F(int idx , int k , int[] arr , int [][] dp){
        if(k == 0 )return true;
        if(idx == 0) return (arr[0] == k);
         if(dp[idx][k]!=-1)
             return dp[idx][k]==0?false:true;
        
        boolean notTake = F(idx - 1 , k , arr , dp);
        boolean take = false;
        if(k >= arr[idx])take = F(idx - 1, k - arr[idx] , arr , dp);
          dp[idx][k]=notTake||take?1:0;
        return (notTake || take);
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int [][] dp = new int [n][k+1];
        for(int row[]: dp)
           Arrays.fill(row,-1);
        return F(n-1 , k , arr , dp);
    }
}


//Tabulation 
class Solution3 {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
         
            boolean dp[][]= new boolean[n][k+1];
    
            for(int i=0; i<n; i++){
                dp[i][0] = true;
            }

            if(arr[0]<=k)
                dp[0][arr[0]] = true;

            for(int ind = 1; ind<n; ind++){
                for(int target= 1; target<=k; target++){

                    boolean notTaken = dp[ind-1][target];

                    boolean taken = false;
                        if(arr[ind]<=target)
                            taken = dp[ind-1][target-arr[ind]];

                    dp[ind][target]= notTaken||taken;
                }
            }

            return dp[n-1][k];
    }
}
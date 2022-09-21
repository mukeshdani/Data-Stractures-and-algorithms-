//Number Of Subsets
//https://www.codingninjas.com/codestudio/problems/number-of-subsets_3952532?leftPanelTab=0

//Space Optimised 

 class Solution1 {
   
    public static int findWays(int num[], int k) {
       int n = num.length;
            int[] prev=new int[k+1];

            prev[0] = 1;

            if(num[0]<=k)
               prev[num[0]] = 1;

            for(int ind = 1; ind<n; ind++){
                int [] curr = new int [k+1];
                curr[0] = 1;
                for(int target= 1; target<=k; target++){

                    int notTaken = prev[target];

                    int taken = 0;
                        if(num[ind]<=target)
                            taken = prev[target-num[ind]];

                   curr[target]= notTaken + taken;
                }
                prev = curr;
            }

            return prev[k];
    }
}



//Memoization 
class Solution2 {
    public static int F(int idx , int sum , int arr [] ,  int [][] dp){
        if(sum == 0 )return 1;
          if(idx==0){
                return arr[0] == sum?1:0;
          }
        if(dp[idx][sum] != -1)return dp[idx][sum];
        int notPic = F(idx - 1, sum , arr , dp);
        int pic = 0 ;
        if(arr[idx] <= sum ) pic = F(idx - 1 , sum - arr[idx] , arr , dp);
        
        return dp[idx][sum] = pic + notPic;
    }
    public static int findWays(int num[], int tar) {
        int [][] dp = new int [num.length][tar + 1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j  = 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
       return F(num.length-1, tar , num , dp);
    }
}

//Tabulation 

class Solution3 {
   
    public static int findWays(int num[], int k) {
       int n = num.length;

    int[][] dp=new int[n][k+1];
    
    for(int i=0; i<n; i++){
        dp[i][0] = 1;
    }
    
    if(num[0]<=k)
        dp[0][num[0]] = 1;
    
    for(int ind = 1; ind<n; ind++){
        for(int target= 1; target<=k; target++){
            
            int notTaken = dp[ind-1][target];
    
            int taken = 0;
                if(num[ind]<=target)
                    taken = dp[ind-1][target-num[ind]];
        
            dp[ind][target]= notTaken + taken;
        }
    }
    
    return dp[n-1][k];
    }
}
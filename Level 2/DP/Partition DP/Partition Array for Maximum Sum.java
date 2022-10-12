//Partition Array for Maximum Sum
//https://leetcode.com/problems/partition-array-for-maximum-sum/

//Memoization 
class Solution {
    public int F(int idx , int n , int [] arr , int k , int [] dp){
        if(idx == n)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int maxAns = Integer.MIN_VALUE;
        int len = 0 ;
        int maxi = Integer.MIN_VALUE;
        
        for(int i = idx ; i < Math.min(n , idx + k) ; i++){
            len++;
            maxi = Math.max(maxi , arr[i]);
            int sum = len * maxi + F(i+1 , n , arr , k , dp);
            maxAns = Math.max(maxAns , sum);
        }
        return dp[idx] = maxAns;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int [] dp = new int [arr.length];
        for(int i = 0 ; i< dp.length ; i++){
            dp[i] = -1;
        }
        return F(0 , arr.length , arr , k , dp);
    }
}


//Tabulation 
class Solution2{
   
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int [] dp = new int [arr.length + 1];
        dp[arr.length]=0;
        for(int idx = arr.length -1 ; idx >=0 ; idx--){
             int maxAns = Integer.MIN_VALUE;
                int len = 0 ;
                int maxi = Integer.MIN_VALUE;

                for(int i = idx ; i < Math.min(arr.length , idx + k) ; i++){
                    len++;
                    maxi = Math.max(maxi , arr[i]);
                    int sum = len * maxi + dp[i+1];
                    maxAns = Math.max(maxAns , sum);
                }
                 dp[idx] = maxAns;
        }
        return dp[0];
    }
}
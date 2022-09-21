//Partitions With Given Difference
//https://www.codingninjas.com/codestudio/problems/partitions-with-given-difference_3751628?leftPanelTab=0

 class Solution {
    static int mod =(int)(Math.pow(10,9)+7);
    public static int F(int idx , int sum , int arr [] ,  int [][] dp){
        
          if(idx == 0){
            if(sum==0 && arr[0]==0)
                return 2;
            if(sum==0 || sum == arr[0])
                return 1;
            return 0;
        }
        if(dp[idx][sum] != -1)return dp[idx][sum];
        int notPic = F(idx - 1, sum , arr , dp);
        int pic = 0 ;
        if(arr[idx] <= sum ) pic = F(idx - 1 , sum - arr[idx] , arr , dp);
        
        return dp[idx][sum] = (pic + notPic)%mod;
    }
    public static int findWays(int num[], int tar) {
        int [][] dp = new int [num.length][tar + 1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j  = 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
       return F(num.length-1, tar , num , dp)%mod;
    }

	public static int countPartitions(int n, int d, int[] arr) {
		int totalSum = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            totalSum+=arr[i];
        }
        
        if((totalSum - d) < 0 )return 0;
        if((totalSum - d) % 2 == 1)return 0;
        return findWays(arr , (totalSum - d)/2);
	}
}
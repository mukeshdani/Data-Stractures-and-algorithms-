//Jump Game


//Gready Solution

//TC => O(N)
//ES => O(1)
class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(i>reach)return false ;
            
            if(i+nums[i] > reach){
                reach = i+nums[i];
            }
        }
        return true;
    }
}



//DP Solution 

//TLE

class Solution {
    
    public long memo(int src , int [] jumps , long[] dp){
       if(src == jumps.length -1 )return 0;//length 
       if(dp[src]!= -1)return dp[src];
       long min = Integer.MAX_VALUE;
       
       for(int jump = 1 ; jump<=jumps[src] ; jump++){
           if(src + jump < jumps.length ){
               min = Math.min(min , memo(src + jump , jumps , dp) + 1l);
           }
       }
       dp[src] = min;
       
       return min;
   }
   public boolean canJump(int[] nums) {
        long[] dp = new long[nums.length + 1];
       Arrays.fill(dp , -1);
       if((int)memo(0 , nums , dp) == Integer.MAX_VALUE){
        return false;   
       }return true;
   }
}
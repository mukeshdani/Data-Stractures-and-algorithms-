//Partition Equal Subset Sum
//https://leetcode.com/problems/partition-equal-subset-sum/

//Spaced Optimised 

class Solution {
    public boolean subsetSumToK(int n, int k, int arr[]){
   
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
   public boolean canPartition(int[] nums) {
    int sum = 0 ;
       for(int i = 0 ; i< nums.length ; i++){
           sum += nums[i];
       }
       
       if(sum % 2 == 1)return false;
       else return subsetSumToK(nums.length  , sum / 2 , nums);
   }
}

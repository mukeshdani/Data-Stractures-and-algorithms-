//3Sum Closest
//https://leetcode.com/problems/3sum-closest/

// normal loop + 2 sum closest

class Solution {
    
    public int twoSumClosest(int[] nums,int left ,  int target) {
       
       int right = nums.length-1;

       int abs = Integer.MAX_VALUE;
        
        int ans= Integer.MAX_VALUE ;

       while ( left < right ){
         int sum = nums[left] + nums[right];
         if (sum == target ){
             return target ;
         }else if ( sum > target){
             if ( sum-target<abs){
                 abs = sum - target;
                 ans = sum;
             }
            // ans = Math.min(ans , sum - target);
             right --;
         }else {
              if ( target-sum<abs){
                 abs=target-sum;
                 ans = sum;
             }
            // ans = Math.min(ans , target - sum );
             left ++;
         }
        }

       return ans ;
   }
   public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int ans = 0 ;
       int abs = Integer.MAX_VALUE ;
        for ( int f = 0 ; f<nums.length-2;f++){
            int curr = twoSumClosest(nums , f+1 , target-nums[f])+nums[f];
            if (Math.abs(curr-target)<abs){
                 abs = Math.abs(curr-target);
                 ans = curr;    
            }
        }
        return ans ;
   }
}



/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
 

Constraints:

3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-104 <= target <= 104*/

//533 · Two Sum - Closest to target

//https://www.lintcode.com/problem/533

public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here

        Arrays.sort(nums);
        int left = 0 , right = nums.length-1;

        int ans = Integer.MAX_VALUE;

        while ( left < right ){
          int sum = nums[left] + nums[right];
          if (sum == target ){
              return 0 ;
          }else if ( sum > target){
              ans = Math.min(ans , sum - target);
              right --;
          }else {
              ans = Math.min(ans , target - sum );
              left ++;
          }
         }

        return ans ;
    }
}

/*Description
Given an array nums of n integers, find two integers in nums such that the sum is closest to a given number, target.

Return the absolute value of difference between the sum of the two numbers and the target.

Example
Example1

Input:  nums = [-1, 2, 1, -4] and target = 4
Output: 1
Explanation:
The minimum difference is 1. (4 - (2 + 1) = 1).
Example2

Input:  nums = [-1, -1, -1, -4] and target = 4
Output: 6
Explanation:
The minimum difference is 6. (4 - (- 1 - 1) = 6).
Challenge
Do it in O(nlogn) time complexity.*/
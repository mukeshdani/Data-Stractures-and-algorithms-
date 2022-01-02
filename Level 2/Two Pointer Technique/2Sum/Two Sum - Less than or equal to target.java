//Two Sum - Less than or equal to target
//https://www.lintcode.com/problem/609

//Time -->O(NlogN)

public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int left = 0 , right = nums.length-1;
       int count = 0 ;
        while ( left<right){
         int sum = nums[left]+nums[right];

         if ( sum <= target){
       count += right-left;
       left ++;
         }else {
             right--;
         }

        }
        return count ;
    }
}


/*Description
Given an array of integers, find how many pairs in the array such that their sum is less than or equal to a specific target number. Please return the number of pairs.

Example
Example 1:

Input: nums = [2, 7, 11, 15], target = 24. 
Output: 5. 
Explanation:
2 + 7 < 24
2 + 11 < 24
2 + 15 < 24
7 + 11 < 24
7 + 15 < 24
Example 2:

Input: nums = [1], target = 1. 
Output: 0. */

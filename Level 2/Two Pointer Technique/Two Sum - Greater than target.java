//Two Sum - Greater than target


public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: an integer
     */
    public int twoSum2(int[] nums, int target) {
        // write your code here
         Arrays.sort(nums);
        int left = 0 , right = nums.length-1;
       int count = 0 ;
        while ( left<right){
         int sum = nums[left]+nums[right];

         if ( sum <= target){
       
       left ++;
         }else {
             count += right-left;
             right--;
         }

        }
        return count ;
    }
}
/*Description
Given an array of integers, find how many pairs in the array such that their sum is bigger than a specific target number. Please return the number of pairs.

Example
Example 1:

Input: [2, 7, 11, 15], target = 24
Output: 1
Explanation: 11 + 15 is the only pair.
Example 2:

Input: [1, 1, 1, 1], target = 1
Output: 6*/
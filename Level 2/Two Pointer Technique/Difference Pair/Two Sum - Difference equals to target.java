///Two Sum - Difference equals to target

//https://www.lintcode.com/problem/610
public class Solution {
    
    public int[] twoSum7(int[] nums, int target) {
        int ptr1 = 0 ; 
        int ptr2 = 1 ;

        while ( ptr1 != nums.length && ptr2 != nums.length){
                
             if (ptr1 == ptr2 ) {
                 if (target < 0){
                 ptr1++; continue ;
              }else {
                  ptr2++;
                  continue;
              } }

             int diff = nums[ptr2] - nums[ptr1];
                
               if ( diff == target) {
                   int min = Math.min(nums[ptr1], nums[ptr2]);
                   int max = Math.max(nums[ptr1], nums[ptr2]);
                   return new int []{min , max};
               }else if (diff<target){
                     ptr2++;   
               }     else {
                   ptr1++;
               }
        }
        return null;
    }
    
}

/*Description
Given an sorted array of integers, find two numbers that their difference equals to a target value.
Return a list with two number like [num1, num2] that the difference of num1 and num2 equals to target value, and num1 is less than num2.

It's guaranteed there is only one available solution.
Note: Requires O(1) space complexity to comple

Example
Example 1:

Input: nums = [2, 7, 15, 24], target = 5 
Output: [2, 7] 
Explanation:
(7 - 2 = 5)
Example 2:

Input: nums = [1, 1], target = 0
Output: [1, 1] 
Explanation:
(1 - 1 = 0)*/
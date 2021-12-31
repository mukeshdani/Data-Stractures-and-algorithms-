//587 · Two Sum - Unique pairs

//https://www.lintcode.com/problem/587


public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: An integer
     */
    public int twoSum6(int[] nums, int k) {
        // write your code here
Arrays.sort(nums);
        int left = 0 , right = nums.length - 1;
        int count = 0 ;
        
        while ( left < right){
            if ( left >0 && nums[left - 1 ] == nums[left]){
                left ++;
                continue;
            }
            int sum = nums[left]+nums[right];
            if (sum == k){
                count ++;
                left ++;
                right --;
                
            }else if (sum > k ){
                right --;
            }else {
                left ++;
            }
        }
        return count ; 
    }
    }


/*Description
Given an array of integers, find how many unique pairs in the array such that their sum is equal to a specific target number. Please return the number of pairs.

Example
Example 1:

Input: nums = [1,1,2,45,46,46], target = 47 
Output: 2
Explanation:

1 + 46 = 47
2 + 45 = 47
Example 2:

Input: nums = [1,1], target = 2 
Output: 1
Explanation:
1 + 1 = 2*/
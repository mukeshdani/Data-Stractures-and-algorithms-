//918 · 3Sum Smaller
//https://www.lintcode.com/problem/918



// normal Loop and Two small problem (two pointer )
//Time -->O(N^2)
public class Solution {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
        public int twoSum5(int[] nums, int left , int target) {
        // write your code here
       
        int  right = nums.length-1;
       int count = 0 ;
        while ( left<right){
         int sum = nums[left]+nums[right];

         if ( sum < target){
       count += right-left;
       left ++;
         }else {
             right--;
         }

        }
        return count ;
    }


    public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
         Arrays.sort(nums);
         int ans = 0 ;
         for ( int f = 0 ; f<nums.length;f++){
               ans+=twoSum5(nums, f+1 , target-nums[f]);
         }
         return ans ;
        }
}


/*Description
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

Example
Example1

Input:  nums = [-2,0,1,3], target = 2
Output: 2
Explanation:
Because there are two triplets which sums are less than 2:
[-2, 0, 1]
[-2, 0, 3]
Example2

Input: nums = [-2,0,-1,3], target = 2
Output: 3
Explanation:
Because there are three triplets which sums are less than 2:
[-2, 0, -1]
[-2, 0, 3]
[-2, -1, 3]
Challenge
Could you solve it in O(n2) runtime?*/
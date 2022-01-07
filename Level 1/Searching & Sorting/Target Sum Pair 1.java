//Target Sum Pair 1


//LeetCode 
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Brute force 
        // O(N^2)
       /* 
        for ( int i = 0 ; i< nums.length ; i++){
            for ( int j =i+1 ; j<nums.length ; j++){
                if ( nums[i]+nums[j]==target){
                    return new int []{i+1 , j+1};
                }
            }
        }
        return null;
      */
        //optimised using two pointer 
        
        int left = 0 , right = nums.length-1;
        
        while(left<right){
            if ( nums[left]+nums[right] == target){
                return new int []{left+1 , right+1};
            }else if ( nums[left]+nums[right] < target){
                left++;
            }else {
                right--;
            }
        }
        
        return null;
        
    }
}
/*Target Sum Pair 1
Easy

1. You are given an array(arr) of distinct integers and a target.
2. You have to print all the pairs having their sum equal to the target.

Constraints

1 <= N <= 10000
-10^9<= arr[i] <= 10^9

Format

Input

An Integer N 
arr1
arr2..
n integers
An integer target

Output

Check the sample output and question video.

Example

Sample Input

12
9 
-48 
100 
43 
84 
74 
86 
34 
-37 
60 
-29 
44
160

Sample Output

60, 100
74, 86*/


//Find Minimum in Rotated Sorted Array
// Modified Binary search 
// time ---> O(logN)

class Solution {
    
    public boolean isMinimum(int[] nums, int mid){
        int lval = (mid - 1 < 0) 
                            ? Integer.MAX_VALUE : nums[mid - 1]; 
        int rval = (mid + 1 >= nums.length) 
                            ? Integer.MAX_VALUE : nums[mid + 1];
            
        if(nums[mid] < lval && nums[mid] < rval) return true;
        return false;
    }
    
    public boolean isMaximum(int[] nums, int mid){
        int lval = (mid - 1 < 0) 
                            ? Integer.MIN_VALUE : nums[mid - 1];
        
        int rval = (mid + 1 >= nums.length) 
                            ? Integer.MIN_VALUE : nums[mid + 1];
            
        if(nums[mid] > lval && nums[mid] > rval) return true;
        return false;
    }
    
    public int findMin(int[] nums) {
        //corner case when entire array is sorted
        if(nums[0] < nums[nums.length - 1]){
            return nums[0];    
        }
        
        int left = 0, right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            // mid is minimum / pivot
            if(isMinimum(nums, mid)){
                return nums[mid];
            }
            
            // mid is maximum -> next Element will be minimum
            else if(isMaximum(nums, mid)){
                return nums[mid + 1];
            }
            
            // left range sorted -> discard left
            else if(nums[left] < nums[mid]){
                left = mid + 1;
            }
            
            // right range sorted -> discard right
            else if(nums[mid] < nums[right]){
                right = mid - 1;
            }
            
        }
        
        return 0;
    }
}











/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 

Constraints:

n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
All the integers of nums are unique.
nums is sorted and rotated between 1 and n times.*/
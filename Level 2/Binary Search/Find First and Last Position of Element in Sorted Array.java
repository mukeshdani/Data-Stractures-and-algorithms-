
//Find First and Last Position of Element in Sorted Array


class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int [] ans = {-1,-1};
        
        if (nums.length ==0)return ans;
        
        ans[0]=firstOcc(nums,target);
        ans[1]=lastOcc(nums,target);
        
        return (ans);
        
    }
    
    public int firstOcc(int []arr  , int target){
        int left = 0 , right = arr.length-1;
        int ans = -1 ;
        while ( left <=right ){
            int mid = left + (right - left)/2;
            
            if ( arr[mid]==target){
                ans = mid ;
                right = mid-1;
            }else if ( arr[mid]<target){
                left = mid +1;
            }else {
                right = mid -1;
            }
            
        }
        return ans ;
    }
    public int lastOcc(int []arr,int target){
        int left = 0 , right = arr.length-1;
        int ans = -1 ;
        while ( left <=right ){
            int mid = left + (right - left)/2;
            
            if ( arr[mid]==target){
                ans = mid ;
                left = mid +1;
            }else if ( arr[mid]<target){
                left = mid +1;
            }else {
                right = mid -1;
            }
            
        }
        return ans ;
    }
}


/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109*/
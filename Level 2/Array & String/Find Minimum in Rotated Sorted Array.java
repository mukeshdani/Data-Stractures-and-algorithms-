//Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int left = 0 ;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        
        while(left < right){
            
            int mid = left  - ( left - right)/2;
            
            if(nums[right] > nums[mid]){
                right = mid;
            }else if(nums[right] < nums[mid]){
                left = mid + 1;
            }
            
        }
       return nums[left];
    }
}
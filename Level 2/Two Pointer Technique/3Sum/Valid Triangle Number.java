//Valid Triangle Number

class Solution {
    public int twoSum2(int[] nums,int right, int target) {
      
       int left = 0 ;
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
   public int triangleNumber(int[] nums) {
       Arrays.sort(nums);
       int ans = 0 ;
       for ( int a= nums.length-1 ;a>1;a--){
           ans+=twoSum2(nums , a-1 , nums[a]);
       }
       
       return ans ;
   }
}

/*Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Example 2:

Input: nums = [4,2,3,4]
Output: 4
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 1000*/
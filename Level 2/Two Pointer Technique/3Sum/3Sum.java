//15. 3Sum
//https://leetcode.com/problems/3sum/


// Two Method 
//1 . three Loop Time--->O(N^3)

//2 . one loop and Two Pointer time --->O(N^2)
class Solution {
    public List<List<Integer>> TwoSum(int[] nums , int left , int right ,int target){
             List<List<Integer>> ans = new ArrayList<>();
              int start = left;
        while ( left < right){
            
            if (left>start && nums[left-1] == nums[left]){
                left++; 
                continue;
            }
            int sum =  nums[left]+nums[right];
            
            if (sum == target){
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[left]);
                pair.add(nums[right]);
                ans.add(pair);
                left++; right--;
            }else if (sum<target){
                left++;
            }else{
                right--;
            }
        }
        return ans ;
    }
    
   
    public List<List<Integer>> threeSum(int[] nums) {
          Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for ( int first =0 ; first<nums.length ; first++){
            
            if ( first> 0 && nums[first-1] == nums[first]){
                continue;
            }
            List<List<Integer>> pairs = TwoSum(nums , first+1 , nums.length-1 , -nums[first]);
            for ( List<Integer> triplet : pairs){
           triplet.add( 0 , nums[first]);
                ans.add(triplet);
            }
        }return ans;
        
      
    }
}

/*15. 3Sum
Medium

15016

1439

Add to List

Share
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105*/

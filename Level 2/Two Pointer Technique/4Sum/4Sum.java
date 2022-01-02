//4Sum
//https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> TwoSum(int[] nums , int left  ,int target){
        int right = nums.length -1 ;    
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
   
   public List<List<Integer>> ksum (int []nums , int start , int target , int k){
      if ( k==2 ){
          return TwoSum(nums, start , target);
      }
       
       List<List<Integer>>res = new ArrayList<>(); 
       for ( int i=start; i<=nums.length-k ; i++){
           if ( i>start && nums[i] == nums[i-1]){
               continue;
           }
            List<List<Integer>> subRes = ksum(nums , i+1 , target-nums[i],k-1);
            for ( List<Integer> sub:subRes){
                sub.add(0,nums[i]);
                res.add(sub);
            }
        }
       return res;
   }
   public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
       return ksum(nums,0 , target , 4);
   }
}

/*Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109*/
//Missing Number
//https://leetcode.com/problems/missing-number/submissions/


class Solution {
    public int missingNumber(int[] nums) {
        //Indexing based firat question 
        
        int n = nums.length  ;
        
        //visiting each number and fill 
        for(int i =0 ; i<nums.length ; i++){
            int val = nums[i] % (n+1);
            if(val < n) nums[val] += (n+1);
        }
        
        // find missing number 
        for(int i = 0 ; i< n  ; i++){
            if(nums[i] < n+1) return i;
        }
      return n;//if all boxes are visited then n itself is n ans
    }
}
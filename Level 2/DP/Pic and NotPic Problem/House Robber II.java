//House Robber II
//https://leetcode.com/problems/house-robber-ii/


class Solution {
    
    public int rob1(int[] nums) {
      int n = nums.length ;
      int prev = nums[0];
      int prev2 = 0;
      
      for(int i = 1; i< n ; i++){
          int pic = nums[i] + prev2;
          int notPic = 0 + prev;
          int curr = Math.max(pic , notPic);
          prev2 = prev;
          prev = curr;
      }
      
      return prev;
  }
  public int rob(int[] nums) {
      
      if(nums.length == 1)return nums[0];
      
      int [] arr1 = new int [nums.length];
      int [] arr2 = new int [nums.length];
      for(int i = 0 ; i< nums.length ; i++){
          if(i != 0) arr1[i] = nums[i];
          if(i != nums.length -1) arr2[i] = nums[i];
      }
      
      return Math.max(rob1(arr1) , rob1(arr2));
  }
}
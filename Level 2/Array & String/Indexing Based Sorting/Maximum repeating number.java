//Maximum repeating number

//https://practice.geeksforgeeks.org/problems/maximum-repeating-number4858/1


class Solution {
    int maxRepeating(int[] nums, int n, int k) {
      for(int i = 0 ; i<n ; i++){
          int val = nums[i] % k;
          nums[val] +=k;
      }
      
      int maxRepeating = 0 , maxfreq = nums[0] /k;
      for(int i = 0 ; i< n ; i++){
          if(nums[i]/k > maxfreq){
              maxfreq = nums[i] / k;
              maxRepeating = i;
          }
      }
      
      return maxRepeating;
    }
}
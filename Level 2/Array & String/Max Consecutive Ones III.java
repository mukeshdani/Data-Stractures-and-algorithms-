//Max Consecutive Ones III
//https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0; 
        int j = 0;
        
        int res = 0;
        int count0 = 0 ;
        
        for(i = 0 ; i< nums.length ; i++){
            if(nums[i] == 0){
                count0++;
            }
            
            while(count0 > k){
                if(nums[j] == 0){
                    count0--;
                }
                j++;
            }
            //
            int length = i-j + 1;
            res = Math.max(res , length);
            
        }
        
        return res;
    }
}
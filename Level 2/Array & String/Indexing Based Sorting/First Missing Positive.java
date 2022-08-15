//First Missing Positive
//https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
     //Discard number <=0 AND >= n+1
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] <= 0 || nums[i] >= nums.length+1){
                nums[i] = 0 ;
            }
        }
        
        //Visiting each element and fill
        
        for(int i = 0 ; i< nums.length ; i++){
            int val = nums[i] % (nums.length + 1);
            if(val != 0) nums[val -1] += (nums.length +1);
        }
        
        //Missing Positive 
        for(int i  = 0 ; i< nums.length ; i++){
            if((nums[i]) < nums.length+1) return (i+1); 
        }
        return nums.length+1;
    }
}

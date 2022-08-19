//Majority Element
//https://leetcode.com/problems/majority-element/


class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0]; 
        int freq  = 0;
        
        for(int val : nums){
            if(majority == val){
                freq ++;
            }else {
                freq--;      
             if(freq == 0){
                majority = val;
                freq = 1;
            }
          }    
        }
        
        return majority;
    }
}
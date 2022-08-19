//Majority Element II
//https://leetcode.com/problems/majority-element-ii/

import java.util.*;
class Solution {
    
    public boolean isGreater(int[] nums , int val){
        int count = 0 ;
        for(int value : nums){
            if(val == value){
                count++;
            }
        }
        
        return count > (nums.length/3);
    }
    public List<Integer> majorityElement(int[] nums) {
      
        List<Integer> list  = new ArrayList<>();
        int pot1 = Integer.MIN_VALUE;
        int pot2 = Integer.MIN_VALUE;
        
        int freq1 = 0;
        int freq2 = 0;
        
        for(int val : nums){
            if(pot1 == val){
                freq1++;
            }else if(pot2 == val) {
                freq2++;
            }else {
              if(freq1==0){
                    pot1 = val;
                freq1=1;
                }
            
             else if(freq2 == 0){
                    pot2 = val;
                 freq2 = 1;
                }else {
                 freq1--;
                freq2--;
             }
            }
        }
    
            if(isGreater(nums , pot1) == true){
                list.add(pot1);
            }
  
            if(pot1 != pot2 && isGreater(nums , pot2) == true){
                list.add(pot2);
            }
        return list;
    }
}
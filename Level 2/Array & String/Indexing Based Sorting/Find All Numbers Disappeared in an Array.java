//Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/


import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //visiting Each elemnets
        
        int n = nums.length ;
        
        for(int i = 0 ; i< n ; i++){
            int val = nums[i] % (n+1);
            
            nums[val - 1] += (n+1);
        }
        
        // Find 
        List<Integer> missing = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < n+1){
                missing.add(i+1);
            }
        }
        return missing ;
    }
}

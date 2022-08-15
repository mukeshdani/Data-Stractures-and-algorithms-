//Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int n = nums.length ; 
        for(int i=0 ; i< n ; i++){
            int val = nums[i] % (n+1);
            nums[val - 1] += (n+1);
        }
        List<Integer> List = new ArrayList<>();
        for(int i = 0 ; i<  n; i++){
            if(nums[i]/(n+1) > 1){
                List.add(i+1);
            }
        }
        return List;
    }
}
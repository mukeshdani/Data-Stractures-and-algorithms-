//Contains Duplicate II

//https://leetcode.com/problems/contains-duplicate-ii/


import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> valueToIndexMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(valueToIndexMap.containsKey(nums[i]) &&
                    (Math.abs(valueToIndexMap.get(nums[i]) - i)) <= k) {
                return true;
            } else {
                valueToIndexMap.put(nums[i], i);
            }
        }
        return false;
    }
}
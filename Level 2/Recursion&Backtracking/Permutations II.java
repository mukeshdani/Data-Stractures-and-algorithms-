//Permutations II
//https://leetcode.com/problems/permutations-ii/


//Box on item 

import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(freq.containsKey(nums[i])){
                int val = freq.get(nums[i]);
                freq.put(nums[i] , val + 1);
            }else {
                freq.put(nums[i] , 1);
            }
        }
        permutations(nums , freq , new ArrayList<>(),ans );
        return ans;
    }
    
    public void permutations(int [] nums , HashMap<Integer, Integer> freq , List<Integer> curr ,    List<List<Integer>> ans ){
        
        if(curr.size() == nums.length){
            ans.add(new ArrayList(curr));
        }
        
        for(Integer key :freq.keySet() ){
            int val = freq.get(key);
            if(val > 0){
                freq.put(key , val -1);
                curr.add(key);
                permutations(nums , freq , curr , ans);
                curr.remove(curr.size() - 1);
                freq.put(key , val);
            }
        }
    }
}


//Items on box
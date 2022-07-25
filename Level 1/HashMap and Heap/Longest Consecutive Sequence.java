//Longest Consecutive Sequence
//https://leetcode.com/problems/longest-consecutive-sequence/

//nlog(n)
//sorting and two pointer 



/* class Solution {

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int left = 0, max = 1;
        while(left < nums.length){

            int right = left + 1, count = 1;
            while(right < nums.length && nums[right] <= nums[right - 1] + 1){
                if(nums[right] == nums[right - 1] + 1)
                    count++;
                right++;
            }

            max = Math.max(max, count);
            left = right;
        }

        return max;
    }
}  */





//Optimised 
//O(n)
//Uisng HashSet




/* 
class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums.length == 0) return 0;
 
         // Unique Key
         HashMap<Integer, Boolean> isStarting = new HashMap<>();
 
         // 1. Take All Elements as Potential Starting Sequence
         for(int i=0; i<nums.length; i++){
             isStarting.put(nums[i], true);
         }
 
         // 2. Remove Elements which cannot start a new Sequence
         for(int i=0; i<nums.length; i++){
             if(isStarting.containsKey(nums[i] - 1) == true){
                 // We Will Join the Previous Sequence, 
                 // Hence, we cannot start the sequence
                 isStarting.put(nums[i], false);
             }
         }
 
         int max = 0;
         for(int start: isStarting.keySet()){
 
             if(isStarting.get(start) == true){
                 int curr = 1;
                 for(int end=start+1; isStarting.containsKey(end) == true; end++){
                     curr++;
                 }
 
                 max = Math.max(max, curr);
             }
 
         }
 
         return max;
     }
 }  */
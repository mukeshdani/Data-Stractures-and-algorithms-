//K-diff Pairs in an Array
//https://leetcode.com/problems/k-diff-pairs-in-an-array/
class Solution {
    public int diffPair(int [] nums , int target ){
       int left = 0 ,right = 1 , count = 0 ;
        while(left<nums.length && right<nums.length){
            if ( left > 0 && nums[left - 1] == nums[left]){
                left++; 
                continue ;
            }
            if (left == right){
                right++; 
                continue ;
            }
            
            int diff = nums[right] - nums[left];
            
            if ( diff == target){
                count++ ; 
                left++;
            }else if (diff < target){
                right++;
            }else {
                left++;
            }
        }
        return count ;  
    }
    public int findPairs(int[] nums, int k) {
       
       Arrays.sort(nums);
        return diffPair(nums , k);
    }
}


// Using Set (Ordered )
//TC--> O(NlohN)
class Solution {
    public int findPairs(int[] nums, int k) {
       Set<Integer> uniquePair = new HashSet<>();
        Arrays.sort(nums);
        int n  = nums.length;
        
        for(int i = 0 ; i< n-1 ; i++){
            
            if(Arrays.binarySearch(nums , i+1 , n , nums[i]+k)>0){
                uniquePair.add(nums[i]);
            }
        }
        return uniquePair.size();
    }
}

//Using HashMap
// TC--> O(N)

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }
}
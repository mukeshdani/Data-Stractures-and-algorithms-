//Count Number of Pairs With Absolute Difference K
//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

class Solution {
    
    public int countKDifference(int[] nums, int k) {
       HashMap<Integer , Integer> freq = new HashMap<>();
        
        for( int i = 0 ; i<nums.length ; i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i], 0)+1);
        }
        
        int count = 0 ;
        
        for ( Integer key : freq.keySet()){
            int freq1= freq.get(key);
            if ( k ==0 ){
                count = count + (k*(k-1))/2;
            }else {
                int freq2 = freq.getOrDefault(k+key , 0);
                count = count + freq1*freq2;
            }
        }
        return count;
    }
}

/*Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.
 

Example 1:

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
Example 2:

Input: nums = [1,3], k = 3
Output: 0
Explanation: There are no pairs with an absolute difference of 3.
Example 3:

Input: nums = [3,2,1,5,4], k = 2
Output: 3
Explanation: The pairs with an absolute difference of 2 are:
- [3,2,1,5,4]
- [3,2,1,5,4]
- [3,2,1,5,4]
 

Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= 100
1 <= k <= 99*/

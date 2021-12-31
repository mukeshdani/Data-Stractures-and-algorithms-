//Two Sum

//  Method to solve this problem 
// 1 . Two Pointer 
// 2 . Hasmap ---> O(N) extra Space ---> O(N) Time Single Traversal 


// Brute Force Approach 
//Time --> O(N^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        
        for ( int i = 0; i<nums.length ; i++){
            for ( int j = i+1; j<nums.length ; j++ ){
            if (nums[i]+nums[j] == target){
            return new int[] {i,j};     
            }
                 
            }
        }
        return new int[] {-1,-1}; 
    } 
    }  
    
//HashMap method 
// Time --> O(N)
//space --> O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer > comp = new HashMap<>();
        
        for ( int i = 0 ; i< nums.length ; i++){
            // Check kia ki target - element map mai persent hai ya nhi 
            if ( comp.containsKey(target - nums[i]) == true ){
                return new int []{comp.get(target - nums[i]), i};
            }
            
            // hame target nhi milta hai toh Map mai dal do us elemet ko 
            
            comp.put(nums[i],i);
        }
        
        return null ;
    }
}

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
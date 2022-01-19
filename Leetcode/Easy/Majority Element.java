//Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int cnt=1;
        for(int i=1;i<n;i++)
        {
            if(cnt==0)
            {
                candidate=nums[i];
                cnt=1;
            }
            else
            {
                if(candidate==nums[i])cnt++;
                else cnt--;
            }
        }
        
        
        return candidate;
    } 
    }

      /*  int idx = 0 , freq = 1 ;
        for ( int i = 1 ; i< nums.length ; i++){
            if ( nums[idx] == nums[i])freq++;
            else freq--;
            
            if ( freq == 0 ){
                idx = i;
                freq = 1;
            }
        }
        return nums[idx];*/
    



/*
 int index = 0, freq = 1;
        
        for(int i=1; i<nums.length; i++){
            if (nums[index] == nums[i]) freq++;
            else freq--;
            
            if (freq == 0){
                index = i;
                freq = 1;
            }
        }
        
        return nums[index];
    }}*/
/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
 

Follow-up: Could you solve the problem in linear time and in O(1) space?*/
//1879 · Two Sum VII

//https://www.lintcode.com/problem/1879

public class Solution {
    /**
     * @param nums: the input array
     * @param target: the target number
     * @return: return the target pair
     */

    public int getNext(int[] nums, int index){
        // negative -> right to left

        if(index == nums.length || nums[index] < 0){
            index--;
            if(index == nums.length) return index;
            while(index >= 0 && nums[index] >= 0){
                index--;
            }
            if(index >= 0) return index;
        }

        // positive -> left to right
        if(index < 0)
            index = 0;
        else index++;

        while(index < nums.length && nums[index] < 0){
            index++;
        }

        return index;
    }

    public int getPrev(int[] nums, int index){
        // positive -> right to left
        
        if(index == nums.length || nums[index] >= 0)
        {
            index--;

            if(index == nums.length) return index;

            while(index >= 0 && nums[index] < 0){
                index--;
            }

            if(index >= 0) return index;
        }

        // negative -> left to right
        if(index < 0)
            index = 0;
        else index++;

        while(index < nums.length && nums[index] >= 0){
            index++;
        }

        return index;
    }

    public List<List<Integer>> twoSumVII(int[] nums, int target) {
        int left = getNext(nums, nums.length);
        int right = getPrev(nums, nums.length);

        List<List<Integer>> res = new ArrayList<>();
        while(left < nums.length && right < nums.length && nums[left] < nums[right]){
            System.out.println(left + " " + right);
            int sum = nums[left] + nums[right];

            if(sum == target){
                int idx1 = Math.min(left, right);
                int idx2 = Math.max(left, right);

                List<Integer> ans = new ArrayList<>();
                ans.add(idx1); ans.add(idx2);
                res.add(ans);

                left = getNext(nums, left); 
                right = getPrev(nums, right);
            } else if(sum < target){
                left = getNext(nums, left);
            } else {
                right = getPrev(nums, right);
            }
        }
        return res;
    }
}


/*Description
Given an array of integers that is already sorted in ascending absolute order, find two numbers so that the sum of them equals a specific number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Note: the subscript of the array starts with 0

You are not allowed to sort this array.

It is guaranteed that all numbers in the numsnums is distinct.
The length of numsnums is \leq 100\,000≤100000.
The number in numsnums is \leq 10^9≤10 
9
 .
Example
Input: 
[0,-1,2,-3,4]
1
Output: 
[[1,2],[3,4]]
Explanation: 
nums[1] + nums[2] = -1 + 2 = 1, nums[3] + nums[4] = -3 + 4 = 1
You can return [[3,4],[1,2]], the system will automatically help you sort it to [[1,2],[3,4]]. But [[2,1],[3,4]] is invaild.
Challenge
\mathcal{O}(n)O(n) time complexity and \mathcal{O}(1)O(1) extra space*/

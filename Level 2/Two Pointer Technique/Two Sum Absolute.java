//1879 · Two Sum VII

//https://www.lintcode.com/problem/1879




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

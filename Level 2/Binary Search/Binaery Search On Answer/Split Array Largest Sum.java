//Split Array Largest Sum


 class Solution 
{
        public static int splitArray(int[]arr, int m) {   
        int max = 0;
    int sum = 0;

    for (int val : arr) {
      sum += val;
      max = Math.max(val, max);
    }

    if (m == arr.length) {
      return max;
    }

    int lo = max;
    int hi = sum;
    int ans = 0;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (isPossible(arr, mid, m) == true) {
        ans = mid;
        hi = mid - 1;
      }
      else {
        lo = mid + 1;
      }
    }

    return ans;
  }

  public static boolean isPossible(int[]nums, int mid, int m) {
    int sc = 1;
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum > mid) {
        sum = nums[i];
        sc++;
      }
    }

    return sc <= m;
   
    
}
    }








/*Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these m subarrays.

 

Example 1:

Input: nums = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], m = 2
Output: 9
Example 3:

Input: nums = [1,4,4], m = 3
Output: 4
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= m <= min(50, nums.length)*/
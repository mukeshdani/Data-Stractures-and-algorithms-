//Minimum Moves to Equal Array Elements II
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

/* 
class Solution {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);
        int sum = 0 ;
        int left = 0 ;
        int right = nums.length -1 ;
        while(left < right){
            sum += Math.abs(nums[left] -nums[right]);
            left++;
            right--;
        }
        return sum;
    }
} */
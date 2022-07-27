//Wiggle Sort II
//https://leetcode.com/problems/wiggle-sort-ii/

class Solution {
    public void wiggleSort(int[] nums) {
        //1. Sort the array
        Arrays.sort(nums);
        
        //2. extra space and manage equility
        int n = nums.length ;
        int []res = new int[n];
        int i = 1;
        int j = n-1;
        while(i<n){
            res[i] = nums[j];
            i+=2;
            j--;
        }
        i=0;
        while(i<n){
            res[i] = nums[j];
            i+=2;
            j--;
        }
        
        for(i = 0 ; i< nums.length ; i++){
            nums[i] = res[i];
        }
    }
}
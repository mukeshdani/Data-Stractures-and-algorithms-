//Sort Array By Parity
//https://leetcode.com/problems/sort-array-by-parity/



class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0 ;
        int j = 0 ;
       while(i<nums.length){
           if(nums[i] % 2==1 ){
               i++;
           }else {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
               i++;
               j++;
           }
       }
        return nums;
    }
}



/* 

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int [] ans = new int[nums.length];
        int j = nums.length -1;
        int k = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] % 2 == 0){
                ans[k] = nums[i];
                k++;
            }else {
                ans[j] = nums[i];
                j--;
            }
        }
        return ans;
    }
} */
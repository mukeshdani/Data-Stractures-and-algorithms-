//Set Mismatch
//https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i<n ; i++){
            int val = nums[i] % (n+1);
            nums[val - 1] +=(n+1);
        }
        
        int missing = 0;
        int Repeating = 0;
        
        for(int i = 0 ;i< n;i++){
            if(nums[i]/(n+1) ==2){
                Repeating = i+1;
            }
            if(nums[i] / (n+1) == 0){
                missing  = i+1;
            }
        }
        
        return new int []{Repeating,missing};
    }
}

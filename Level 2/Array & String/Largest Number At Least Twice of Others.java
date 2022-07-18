//Largest Number At Least Twice of Others

class Solution {
    public int dominantIndex(int[] nums) {
        int l1 = -1 ;
        int l2 = -1 ;
        
        for(int i =0 ; i< nums.length ; i++){
            if(l1 == -1 || nums[i]>=nums[l1]){
                l2 = l1;
                l1 = i;
            }else if(l2 == -1 || nums[i]>= nums[l2]){
                l2 = i;
            }
        }
        
        if(nums[l1] >= 2*nums[l2])return l1;
        else return -1;
    }
}
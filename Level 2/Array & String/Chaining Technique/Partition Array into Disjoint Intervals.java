//Partition Array into Disjoint Intervals
//https://leetcode.com/problems/partition-array-into-disjoint-intervals/

/* 
class Solution {
    public int partitionDisjoint(int[] nums) {
        //1. Make right min array
        int n = nums.length;
        int [] rmin = new int[n+1];
        rmin[n] = Integer.MAX_VALUE;
        for(int i = n-1 ; i>=0 ; i--){
            rmin[i] = Math.min(rmin[i+1] , nums[i]);
        }
        
        //2. maintain left max and figureout the partition index 
        
        int lmax = Integer.MIN_VALUE;
         int ans = 0 ;
        for(int i = 0 ; i<nums.length ; i++){   
            lmax = Math.max(lmax , nums[i]);
            if(lmax <= rmin[i+1]){
                ans = i ;
                break;
            }
        }
        
        return ans + 1;//length 
    }
}
 */



 //With out extra space 
 //o(1) extra space 

 class Solution {
    public int partitionDisjoint(int[] nums) {
       int leftmax = nums[0];
        int greater = nums[0];
        int ans = 0 ;
        
        for(int i = 1; i<nums.length ; i++){
            if(nums[i] > greater){
                greater = nums[i];
            }else if( nums[i] < leftmax){
                ans = i ;
                leftmax = greater;
            }
        }
        return ans + 1 ;//length 
    }
}
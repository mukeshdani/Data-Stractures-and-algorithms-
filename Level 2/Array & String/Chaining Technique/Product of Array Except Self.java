//Product of Array Except Self
//https://leetcode.com/problems/product-of-array-except-self/


/* class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        //1. right array fill 
        int product = 1 ;
        int [] right = new int[nums.length];
        for(int i = nums.length -1 ; i>=0 ; i--){
           product *= nums[i];
            right[i] = product;
        }
        
        //2. make result with maintaing the left product 
        product = 1;
        int [] res= new int [nums.length];
        for(int i = 0 ; i<nums.length - 1; i++){
            int lp = product;
            int rp = right[i+1];
            res[i] = lp * rp ;
            
            product *= nums[i]; 
            
        }
        
        res[nums.length - 1] = product;
        
        return res;
    }
} */




class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            if(i==0){
                left[i] = 1;
            }else {
                left[i] = left[i-1] * nums[i-1];
            }
        }
        
        int right = 1;
        for(int i = nums.length -2; i >= 0 ; i-- ){
            right = right * nums[i+1];
            left[i] = left[i] * right;
        }
        return left;
    }
}
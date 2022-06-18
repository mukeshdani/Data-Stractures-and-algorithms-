//Squares of a Sorted Array
//https://leetcode.com/problems/squares-of-a-sorted-array/


/////////////////////////////////////// OPTIMISED APPROACH ///////////////////////////////////////
//T.C --> O(n)
//S.C --> O(n)




/* class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res  = new int [nums.length];
        
        int i = 0 ; 
        int j = nums.length - 1;
        int idx = res.length -1;
        while(i<=j){
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            
            if(val1 > val2){
                res[idx] = val1;
                i++;
            }else {
                res[idx] = val2;
                j--;
            }
            
            idx--;
        }
        
        return res;
    }
} */


//Brute Force 
//T.C --> O(n) + O(nlog(n))
//S.C --> O(1)



/* public int[] sortedSquares(int[] arr) {
        
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        
        return arr;
    } */

//Reverse Pairs
class Solution {
    public int reversePairs(int[] nums) {
         return mergeSort(nums, 0, nums.length- 1);
    }


  public int mergeSort(int [] nums, int left, int right){
       // 0 or 1 elements in array
        if(left >= right){
            return 0; 
        }
        
        int mid = left + (right - left) / 2;
        int leftCount = mergeSort(nums, left, mid); // left Sorted
        int  rightCount = mergeSort(nums, mid + 1, right); // right Sorted

        // Add both the sorted Array 
        int ans = merge(nums, left, mid, mid + 1, right);

        // Return the count
        return leftCount + rightCount + ans;
    }
    
    public int InversionCount(int []nums , int a1l ,int a1r , int a2l , int a2r){
        int InvCount =0 ;
        int ptr1 = a1l, ptr2 = a2l;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if((long)nums[ptr1] <=2l*(long)nums[ptr2]){
               ptr1++;
            } 
            else {
              InvCount += (a1r - ptr1 + 1l);          
               ptr2++;
            }
        }
        return InvCount;
        
    }
    
    public int merge(int [] nums, int a1l, int a1r, int a2l, int a2r){
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        int[] res = new int[totalRes];
        
        int invCount = InversionCount(nums ,a1l , a1r , a2l , a2r);
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
              
                res[ptr3] = nums[ptr2];
                ptr3++; ptr2++;
            }
        }
        
        while(ptr1 <= a1r){
           res[ptr3] = nums[ptr1];
           ptr3++; ptr1++; 
        }
        
        while(ptr2 <= a2r){
           res[ptr3] = nums[ptr2];
           ptr3++; ptr2++;  
        }
        
        for(int i=a1l; i<=a2r; i++){
            nums[i] = res[i - a1l];
        }
        
        return invCount;
    }
}
   






/*Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].

 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1*/
//Sort an Array


// uisng Merge Sort 
// With Extra Space 
// Inplace becuse hm same hi array mai chenges la rhe hai 
// Stable hai 

class Solution {
    
    public void mergeSort(int[] nums, int left, int right){
        // 0 or 1 elements in array
        if(left >= right){
            return;
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid); // left Sorted
        mergeSort(nums, mid + 1, right); // right Sorted   
        // Merge both the left and right sorted array 
        merge(nums, left, mid, mid + 1, right);
    }
    
    public void merge(int[] nums, int a1l, int a1r, int a2l, int a2r){
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        int[] res = new int[totalRes];
        
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
    }
    
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}




/*912. Sort an Array
Medium

1584

468

Add to List

Share
Given an array of integers nums, sort the array in ascending order.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104*/
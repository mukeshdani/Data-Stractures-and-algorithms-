//Count Inversions
// Similar to Inversion Count Only two Changes in Code 

//other Method to solve this problem 
// 1 . Merge Sort --Time -->NlogN
// 2 . Fenvic Tree 
// 3 . Policy Based Data stracture 
// 4 . Self Balancing BST 




class Solution
{
    public static long mergeSort(long[] nums, int left, int right){
       // 0 or 1 elements in array
        if(left >= right){
            return 0; 
        }
        
        int mid = left + (right - left) / 2;
        long leftCount = mergeSort(nums, left, mid); // left Sorted
        long rightCount = mergeSort(nums, mid + 1, right); // right Sorted

        // Add both the sorted Array 
        long ans = merge(nums, left, mid, mid + 1, right);

        // Return the count
        return leftCount + rightCount + ans;
    }
    
    public static long merge(long[] nums, int a1l, int a1r, int a2l, int a2r){
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        long[] res = new long[totalRes];
        
        long invCount = 0;
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
                /*---------------------- Second Change -------------- */
                invCount += (a1r - ptr1 + 1l); 
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
    
    static long inversionCount(long nums[], long N) {
        return mergeSort(nums, 0, (int)N - 1);
    }
}





/*Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018*/
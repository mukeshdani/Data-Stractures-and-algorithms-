//Median of Two Sorted Arrays

// Very important  

// Time ---> O(logNa)
// 2 cases -1) Same size 
//          -) Different Size 

                           /* Same Size  */
// Brute force 
// noraml merge both the array then find median 
// Always become even 
// Time ---> O(N);

// Binary search 
// Time --> O(logN)
// Am==Bm  return (Am+Bm)/2
// Am<Bm   discard left in A and discard right in B  
// Am > Bm discard right in A and discard left in B 


                          /* Diffrent Size  */

         // Odd and even Both cases possible 
         // Time --> O(logNa)
         // binary search A wali array mai lgani hai 
         // if B is small then we have to swap                  

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int low = 0, high = nums1.length;
        int N = nums1.length + nums2.length;
        int Nby2 = (N + 1) / 2;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            int aleft = (mid - 1 >= 0) 
                        ? nums1[mid - 1] : Integer.MIN_VALUE;
            
            int aright = (mid < nums1.length) 
                        ? nums1[mid] : Integer.MAX_VALUE;
            
            int bleft = (Nby2 - mid - 1 >= 0) 
                        ? nums2[Nby2 - mid - 1] : Integer.MIN_VALUE; 
                
            int bright = (Nby2 - mid < nums2.length)
                        ? nums2[Nby2 - mid] : Integer.MAX_VALUE;
            
            if(aleft <= bright && bleft <= aright){
                // return median
                if(N % 2 == 1){
                    // odd elements
                    return Math.max(aleft, bleft);
                } else{
                    int[] arr = {aleft, bleft, aright, bright};
                    Arrays.sort(arr);
                    return (arr[1] + arr[2]) / 2.0;
                }
                
            }
            else if(aleft > bright){
                high = mid - 1;
            } else {
                // bleft > aright
                low = mid + 1;
            }
        }
        
        return 0.0;
    }
}


/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/
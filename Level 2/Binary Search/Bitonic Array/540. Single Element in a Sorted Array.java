
//540. Single Element in a Sorted Array

// Brute force approach 

// time = O(n)
class Solution {
    
    // Broute force approach
    public int singleNonDuplicate(int[] arr) {
        int xor = arr[0];
        for ( int i = 1 ; i<arr.length ;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}


// Optimised approach 

// time = O(log(n))

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0 ; 
        int high = arr.length - 1 ;
        
        while ( low <= high ){
            
            int mid = low + (high-low)/2;
            
            // corner cases
            
            int lval = (mid - 1 >=0)? arr[mid-1] : -1 ;
            int rval = (mid+1<arr.length)? arr[mid+1]:-1;
            // condition 
            if (arr[mid]!=lval && arr[mid]!=rval){
                // mid is the only element 
                return arr[mid];
            }
            
            // check even and odd side 
            // hame odd side mai move krna hai 
            
            // if hame left ko jana hai 
            if (arr[mid]==lval) {
                int lcount = mid-low-1;
                if ( lcount % 2 ==1 ){
                    high = mid-2;
                }else {
                    low = mid+1;
                }
            }
            // agr hame right side move karna hai 
            else {
                int lcount = mid-low;
                if(lcount % 2==1){
                    high = mid -1 ;
                }else {
                    low = mid + 2;
                }
            }
        }
        return -1;
    }
}


















/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105*/

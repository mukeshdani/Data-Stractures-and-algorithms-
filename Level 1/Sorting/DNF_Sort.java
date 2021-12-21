/* ------------- DNF or Sort 012 or Three Way Partitioning---------- */
//DNF---> Duch National flag algorithm

//          Dual Pivot Partising

/* --------------------------------Variations--------------------------- */

// 1.  %3 ==0 , %3 ==1 , %3==2
// 2. 0 , 1, 2 
// 3. <pivot , =pivot , >pivot
// 4. <a , [a,b] , >b


/* ------------------------------------------------------------------------- */
// Single Traversal



//75. Sort Colors

class Solution {
    
    public void swap ( int []arr , int n , int m ){
        int temp = arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
    public void sortColors(int[] arr) {
        int  i = 0 , j = 0 , k=arr.length-1; 
    while (j<=k){
        if ( arr[j]==0){
            swap(arr,j,i);
            i++;
            j++;
        }else if ( arr[j]==2){
            swap(arr, j , k);k--;
        }else j++;
    }
    }
}






/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is 0, 1, or 2.
 */
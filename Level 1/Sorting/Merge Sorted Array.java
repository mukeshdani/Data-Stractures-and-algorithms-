//Merge Sorted Array

/* ----------------------------With Extra Space -------------------------- */
// Merge Sorted array Using Extra space 
// space -->O(n+m)
// Time --> O(n+m)
class Solution {
  public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j = 0 , k=0;
        int []arr = new int [m+n];
        while (i<m && j<n){
            if ( nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while (i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        
        while ( j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
     return arr;
    }
}

/* ------------------------With Out Extra Space-------------------------------- */
// Sort By Using Insertion sort
// Space ---> O(1)
// Time ----> O( N*M + M^2 )   Compromise in Time

class Solution {
    
    public void swap ( int [] nums1 , int a , int b ){
        int temp = nums1[a];
        nums1[a]=nums1[b];
        nums1[b]= temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Sbse phle sare element nums1 mai paste kr deta hai 
        for ( int i =m ; i<n+m ;i++){
            nums1[i]=nums2[i-m];
        }
        
        // Ab Nums1 mai Insertion Sort use krenge 
        // mai i ko m se start kr rha hu bcz m tk toh array already dorted hogi 
        // Beacuse In question hame given hai ki dono array sorted hai 
        for ( int i=m ; i<m+n ;i++ ){
            for ( int j = i-1 ; j >=0 ; j--){
                if ( nums1[j] > nums1[j+1] ){
                    swap(nums1 , j , j+1);
                }else break;
            }
        }
    }
}


/*  --------------------Using Shell Sort -------------------- */
// gap bnana pdta hai shell sort mai 
// Time --> O(N+M)log(N+m)
//Space ----> O(1)

class Solution {
    
    public void swap ( int [] nums1 , int a , int b ){
        int temp = nums1[a];
        nums1[a]=nums1[b];
        nums1[b]= temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Sbse phle sare element nums1 mai paste kr deta hai 
        for ( int i =m ; i<n+m ;i++){
            nums1[i]=nums2[i-m];
        }
        
        // Ab Nums1 mai shell sort use krenge 
        // with ceill value 
        for ( double gap = (m+n)/2.0; gap >0 ; gap = gap /2.0){
              // check 
            int jstart = (int)Math.ceil(gap);
            for (int i = 0, j=jstart ; j < m+n ; i++ ,j++){
                if ( nums1[i] > nums1[j] ){
                    swap(nums1 , i, j);
                }
            }
            if ( jstart == 1 )break ;
        }
        }
    }






class Solution {
    
    public void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return; // 0 or 1 elements in array
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid); // left Sorted
        mergeSort(nums, mid + 1, right); // right Sorted
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






/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109*/

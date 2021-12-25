//Searching in an array where adjacent differ by at most k

// Step Search 

// Time 
// WC --> O(N)
// BC --> O(1) constant
// AC --> O(rootN)


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int target, int k) {
        //Complete the function
        int idx = 0 ;
    while ( idx <n){
        if ( arr[idx] == target )return idx ;
        int mj = (Math.abs(target - arr[idx]))/k;
        // corner case 
        if ( mj ==0 )mj = 1;
        
        idx = idx + mj ;
    }return -1;
    }
    
    
}


/*A step array is an array of integer where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of k if multiple elements exist, return the first occurrence of the key.


Example 1:

â€‹Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1 
        and X = 6
Output : 2
Explanation:
In an array arr 6 is present at index 2.
So, return 2.

â€‹Example 2:

Input : arr[ ] = {20 40 50}, K = 20 
        and X = 70
Output :  -1 
 

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function search() that takes an array (arr), sizeOfArray (n), an integer value X, another integer value K, and return an integer displaying the index of the element X in the array arr. If the element is not present in the array return -1. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 102
1 ≤ arr[i], X ≤ 105*/
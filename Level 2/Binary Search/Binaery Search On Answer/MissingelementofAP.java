//Missing element of AP



class Solution {
    public static int findMissing(int[] arr, int n) {
        // Common Difference
  int d = (arr[n - 1] - arr[0]) / n;
  int low = 0;
  int high = n - 1;

  while (low <= high) {
    // Find the middle index
    int mid = low + (high - low) / 2;

    // if mid and the immediate next element to mid are not in AP, then missing
    // element is arr[mid] + d.
    if (arr[mid + 1] - arr[mid] != d)
      return arr[mid] + d;

    // if mid and the immediate previous element to mid are not in AP, then missing
    // element is arr[mid-1] + d.
    if (mid > 0 && arr[mid] - arr[mid - 1] != d)
      return arr[mid - 1] + d;

    // if elements of the left half are in AP, then missing element is in right
    // half.
    if (arr[mid] == arr[0] + mid * d)
      low = mid + 1;

    // else missing element is in the left half.
    else
      high = mid - 1;
  }

}
}




/*Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.

Example 2:

Input:
N = 6
Arr[] = {1, 6, 11, 16, 21, 31}
Output: 26
Explanation: Actual AP should be 
1, 6, 11, 16, 21, 26, 31.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findMissing() which takes the array of integers arr[] and its size n as input parameters and returns an integer denoting the answer.
 

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)


Constraints:
2 <= N <= 105
0 <= |Arr[i]| <= 107
There will always be only one missing element.*/
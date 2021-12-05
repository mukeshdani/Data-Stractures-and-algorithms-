
//Number of occurrence

public class NumberOfOccurance{
    

public int firstOcc(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int ans = -1;
    while(left <= right){
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target){
            ans = mid;
            right = mid - 1;
        } else if(nums[mid] < target){
            left = mid + 1;
        } else {
            // nums[mid] > target
            right = mid - 1;
        }
    }
    return ans;
}

public int lastOcc(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int ans = -1;
    while(left <= right){
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target){
            ans = mid;
            left = mid + 1;
        } else if(nums[mid] < target){
            left = mid + 1;
        } else {
            // nums[mid] > target
            right = mid - 1;
        }
    }
    return ans;
}

int count(int[] arr, int n, int x) {
    int first = firstOcc(arr, x);
    if(first == -1) return 0;
    int last = lastOcc(arr, x);
    return (last - first + 1);
}
}

/*Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.
Your Task:
You don't need to read input or print anything. Your task is to complete the function count() which takes the array of integers arr, n and x as parameters and returns an integer denoting the answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
1 ≤ X ≤ 106*/
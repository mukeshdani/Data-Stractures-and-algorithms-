
//UnBounded Binary Serach 
// Infinite Sorted array 

/* 
doubling the window size take least time as compared to fixed size
low = 0;
high = 1;

after 
low = high+1;
high = 2*high;
*/

import java.io.*;
import java.util.*;

public class Main {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);
        return binarySearch(arr, mid + 1, high, target);
    }

    public static int binarySearchInfinite(int[] arr, int low, int high, int target) {
        if (target >= arr[low] && target <= arr[high]) {
            return binarySearch(arr, low, high, target);
        } else {
            return binarySearchInfinite(arr, high + 1, 2 * high, target);
        }
    }

    // Invokation -> binarySearch(arr, 0, n - 1, target)
    // Invokation -> binarySearchInfinite(arr, 0, 1, target)

}
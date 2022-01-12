//Quick Select

import java.io.*;
import java.util.*;

public class Main {

  public static int quickSelect(int[] arr, int lo, int hi, int k) {
    //write your code here
    if ( lo == hi) return arr[lo];
    int pivotidx = partition(arr , arr[hi], lo , hi);
    
    if ( pivotidx == k ){
        return arr[pivotidx];
    }else if ( pivotidx < k ){
        return quickSelect(arr , pivotidx + 1, hi, k);
    }else {
         return quickSelect(arr ,lo, pivotidx - 1,k);
    }
    
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
  }

}

/*1. You are given an array(arr) of integers.
2. You have to find the k-th smallest element in the given array using the quick-select algorithm.
Input Format
An Integer n 
arr1
arr2..
n integers
An integer k
Output Format
Check the sample output and question video.
Question Video

  COMMENTConstraints
1 <= N <= 100000
-10^9 <= arr[i] <= 10^9
1 <= k <= N
Sample Input
5
7 
-2 
4 
1 
3
3
Sample Output
pivot -> 3
Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4
pivot index -> 2
3*/
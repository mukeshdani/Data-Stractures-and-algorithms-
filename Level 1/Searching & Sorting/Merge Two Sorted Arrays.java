//Merge Two Sorted Arrays
//Time --> O(n+m)

import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] nums1, int[] nums2){
    int m = nums1.length;
      int n = nums2.length;
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

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}

/*1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity.

Constraints

1 <= N <= 10^8
-10^9 <= a[i],b[i] <= 10^9

Format

Input

An Integer n 
a1
a2..n integers
An integer m
b1
b2..m integers

Output

Check the sample output and question video.

Example

Sample Input

4
-2 
5 
9 
11
3
4 
6 
8

Sample Output

-2
4
5
6
8
9
11*/
//Radix Sort
//Time  ===> N * log base 10 (Max)


import java.io.*;
import java.util.*;

public class Main {

  

  public static void radixSort(int[] arr) {
    // write code here  
    int max = 0 ; 
    for ( int val : arr )max = Math.max(max , val);
    int digits = (int)Math.log10(max)+1 ; 
        int maxPlaceValue = (int)Math.pow(10 , digits-1 );
    for (int i  = 1 ; i<= maxPlaceValue ; i*= 10  ){
      countSort(arr , i);
    }  
     

  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    System.out.print("After sorting on " + exp + " place -> ");


      int [] freq = new int [10];
    
    for ( int i = 0 ; i < arr.length ; i++){
        int idx  = (arr[i] /exp )%10 ; 
        freq[idx]++;
    }

     int [] prefSum = new int [10];
     prefSum[0]= freq[0];

     for ( int i = 1 ; i< freq.length ; i++){
       prefSum[i] = prefSum[i-1] + freq[i];
     }

     int [] res   = new int [arr.length];

     for ( int  i = arr.length-1 ; i>=0 ;i--){
       prefSum[(arr[i] /exp )%10]--;
       int idx = prefSum[(arr[i] /exp )%10];
       res[idx] = arr[i];
     }

     for ( int i = 0 ; i< arr.length ; i++){
       arr[i] = res[i];
     }


    print(arr);
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
    radixSort(arr);
    print(arr);
  }

}

/*1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using radix sort.

Constraints
1 <= N <= 10000
0 <= arr[i] <= 10^8

Format
Input
An Integer n 
arr1
arr2..
n integers

Output
Check the sample ouput and question video.

Example
Sample Input

5
7 
2 
4 
1 
3

Sample Output
After sorting on 1 place -> 1 2 3 4 7 
1 2 3 4 7 */
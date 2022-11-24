//Partition An Array


//Quick Sort 
//Time --> O(N)

// Variation 
// 1. Partition an array 
// 2. Positive , Negative
// 3. 0. Non zero
// 4. <=Pivot , >Pivot 

/* ----------------------------Partition An Array -------------------------- */

import java.io.*;
import java.util.*;

class Main {


       
  public static void partition(int[] arr, int pivot){
    //write your code here
    int i = 0 , j = 0 ;
    while ( i<arr.length){
        if ( arr[i]<=pivot){
            swap(arr, i , j);
            i++;
            j++;
        }else i++;
    }
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
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}


/* ---------------------------------sort 0 / 1------------------------------- */
// only one change in above solution 
/*

public static void sort_O/1(int[] arr, int pivot){
    //write your code here
    int i = 0 , j = 0 ;
      while ( i<arr.length){

        // Here is the Chnage 
        if ( arr[i]==0){
            swap(arr, i , j);
            i++;
            j++;
        }else i++;
    }
  }


*/


/* -------------------------Positive and Negative ------------------- */


/* 

public static void Positive&Negative(int[] arr, int pivot){
    //write your code here
    int i = 0 , j = 0 ;
      while ( i<arr.length){

        // Here is the Chnage 
        if ( arr[i]<0){
            
            swap(arr, i , j);
            i++;
            j++;
        }else i++;
    }
  }

 */

 /* -----------------------------------Odd and even -------------------------- */


 /* 
 
public static void Odd&Even(int[] arr, int pivot){
    //write your code here
    int i = 0 , j = 0 ;
      while ( i<arr.length){

        // Here is the Chnage 
        if ( arr[i]%2==1){

            swap(arr, i , j);
            i++;
            j++;
        }else i++;
    }
  }
 */
/*1. You are given an array(arr) of integers and a pivot.
2. You have to re-arrange the given array in such a way that all elements smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.
3. You have to achieve this in linear time.

Note -> For more information, watch question video.
Input Format
An Integer n 
arr1
arr2..
n integers
An integer pivot
Output Format
Check the sample output and question video.*/

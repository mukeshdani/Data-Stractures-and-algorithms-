//Sort 012
import java.io.*;
import java.util.*;

public class Main {

  public static void sort012(int[] arr){
    //write your code here
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

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }

}
/*
1. You are given an array(arr) containing only 0's, 1's, and 2's.
2. You have to sort the given array in increasing order and in linear time.
Input Format
An Integer N 
arr1
arr2..
n integers
Output Format
Check the sample output and question video.
Question Video

  COMMENTConstraints
1 <= N <= 10000
arr[i] = 0,1,2
Sample Input
10
1
0
2
2
1
0
2
1
0
2
Sample Output
Swapping index 1 and index 0
Swapping index 2 and index 9
Swapping index 2 and index 8
Swapping index 2 and index 1
Swapping index 3 and index 7
Swapping index 5 and index 2
Swapping index 6 and index 6
0
0
0
1
1
1
2
2
2
2
*/
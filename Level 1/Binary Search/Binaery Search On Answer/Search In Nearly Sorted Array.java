
//Search In Nearly Sorted Array
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(solve(num, k));
  }

  public static int  solve(int[] arr, int target) {


int low = 0 , high = arr.length - 1; 

while( low <= high){
    int mid = low +(high-low )/2;
    // check corner cases first 
   int lval = (mid-1>=0)?arr[mid-1]:Integer.MIN_VALUE;
   int rval = (mid+1<arr.length)?arr[mid+1]:Integer.MAX_VALUE;
   
   if (target == arr[mid])return mid ;
   if (target == lval)return mid-1;
   if (target == rval)return mid+1;
   
   if(target<arr[mid]) high =mid-2;
   else low = mid+2;
}
return -1;
  }
}




/*Given an array that is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].

For example consider the array {2, 3, 10, 4, 40}, 4 is moved to the next position and 10 is moved to the previous position.
Input Format
Integer N followed by N elements of the nearly sorted array.
Integer target representing the element to be searched.
Output Format
Print the index of the element if found, else -1.
Question Video

Constraints
Number of Elements in Array <= 10^6.
All the elements in the array will be distinct.
Sample Input
7
10 3 40 20 50 80 70
40*/
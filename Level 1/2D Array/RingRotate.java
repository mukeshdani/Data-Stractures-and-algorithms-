
//Ring Rotate

//Source Code

import java.io.*;
import java.util.*;

public class RingRotate  {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int[n][m];
        for ( int  i = 0 ; i<arr.length ; i++){
            for ( int j = 0 ; j<arr[0].length ; j++){
              arr[i][j]=scn.nextInt();
            }
        }
    
    // r represent ki kitna rotate krna hai 
       int r = scn.nextInt();

       // s means ki konsi shell mai rotation lgana hai 
       int s = scn.nextInt();

       //rotation k lia function call kr dia 

       rotateShell(arr , s, r);
       
       // now time to display the 2d rotated array 

       display(arr);

    }

    public static void rotateShell(int [][] arr , int s , int r){
//First of all we have to extract the element in 1D array so that we can easily rotate the array

       int[] oned = convertOneDArray(arr , s);

       // now we will rotate the array 

       rotate(oned , r);

       // now rotated array element again shift in 2D array 

       ConvertTwoDArray(arr,s,oned);

    }

    // first of all we have to convert 2D in 1D

    public static int[] convertOneDArray(int[][] arr , int s){
        // now use the concept of Spiral Display question 

       int frow = s - 1;
        int fcol = s - 1;
       int lrow = arr.length-s;
       int lcol = arr[0].length-s;

        // now first of all we have to find the size of 1D array

        int size = 2*(lrow-frow+1)+2*(lcol-fcol+1)-4;

        int [] oned = new int [size];

        // for left wall 
          int idx=0 ;
         for ( int i = frow , j = fcol ; i<=lrow ;i++ ){
             oned[idx] = arr[i][j];
             idx ++;
         } 

         // for bottom wall 

         for (int i = lrow, j = fcol+1 ; j<=lcol ; j++){

             oned[idx]= arr[i][j];
             idx++;
         }  

         //for right wall 
          for( int i = lrow-1, j = lcol ; i>=frow ; i-- ){
            oned[idx]= arr[i][j];
              idx++;
          }

          // for Top wall 
          for ( int i = frow , j= lcol-1 ;j>=fcol+1; j--){
              oned[idx]= arr[i][j];
              idx++;
          }

          return oned;
    }

  // now time to rotate the one d array 

  
   public static void swap (int[] arr , int lt , int rt){ 
    int temp = arr[lt];
    arr[lt]=arr[rt];
    arr[rt]=temp;
   }
public static void reverse (int[] a, int left ,int rigth ){

    while(left <= rigth){

        swap(a, left , rigth);
        left ++;
        rigth --;
    }
}
  
  public static void rotate(int[] a, int k){
    // write your code here

    k=k%a.length;
    if ( k<0){
        k = k+a.length;
    }

    reverse(a,0,a.length-k-1);
    reverse(a,a.length-k,a.length-1);
    reverse(a,0,a.length-1);

  }

  // now time to convert one d array into 2D array 

  public static void ConvertTwoDArray (int [][] arr ,int s ,int []oned){

      int frow = s-1;
        int fcol = s-1;
        int lrow = arr.length-s;
        int lcol = arr[0].length-s;

      
        // for left wall 
          int idx=0 ;
         for ( int i = frow , j = fcol ; i<=lrow ;i++ ){
            arr[i][j] =  oned[idx] ;
             idx ++;
         } 

         // for bottom wall 

         for (int i = lrow, j = fcol+1 ; j<=lcol ; j++){

             arr[i][j] =  oned[idx] ;
             idx ++;
         }  

         //for right wall 
          for ( int i = lrow-1 , j= lcol ; i>=frow;i--){
           arr[i][j] =  oned[idx] ;
             idx ++;
          }

          // for Top wall 
          for ( int i = frow , j= lcol-1 ;j>=fcol+1; j--){
              arr[i][j] =  oned[idx] ;
             idx ++;
          }
  }




    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

/*
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

Constraints

1 

Format

Input

A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r

Output

output is handled by display function

Example

Sample Input

5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3

Sample Output

11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57

*/
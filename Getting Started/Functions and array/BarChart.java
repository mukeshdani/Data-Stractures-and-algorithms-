/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Constraints

1 

Format

Input

A number n
n1
n2
.. n number of elements

Output

A bar chart of asteriks representing value of array a

Example

Sample Input

5
3
1
0
7
5

Sample Output

			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	
*/

//Source Code

import java.io.*;
import java.util.*;

public class BarChart{

public static int max (int[] arr){

    int max=Integer.MIN_VALUE;
    for( int i = 0 ; i<arr.length ; i++){
        max = Math.max(arr[i],max);

    }
    return max;
}


public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner (System.in );
    int n = scn.nextInt();
    int [] arr= new int [n];

    for(int i = 0; i<n ;i++){
    arr[i]=scn.nextInt();
    }
     
    int totalcol = n ;
     int totalrow=max(arr);

     for(int i = totalrow-1 ; i>=0 ; i--){
         for ( int j=0 ; j<totalcol; j++){

             if ( i < arr[j]){
                 System.out.print("*\t");
             }else {
                 System.out.print("\t");
             }
         }
         System.out.println();
     }


 }

}
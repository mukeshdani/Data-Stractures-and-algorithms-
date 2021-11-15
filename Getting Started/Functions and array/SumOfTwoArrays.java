// SumOfTwoArrays 
/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Constraints

1 

Format

Input

A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output

A number representing sum of two numbers, represented by two arrays.

Example

Sample Input

5
3
1
0
7
5
6
1
1
1
1
1
1

Sample Output

1
4
2
1
8
6
*/

//Source Code

import java.io.*;
import java.util.*;

public class SumOfTwoArrays {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in );

    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for ( int i=0 ; i<n1 ; i++){
        arr1[i]=scn.nextInt();
    }

     int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for ( int i = 0 ; i<n2 ; i++){
        arr2[i]=scn.nextInt();
    }
   

   
   int[] res = new int[Math.max(n1,n2) + 1];

    int carry = 0 ;
    int i1 = n1-1;
    int i2 = n2-1;
    int i3 = res.length-1;

    while(i3>=0){

     int d1 = (i1 >= 0) ? arr1[i1] : 0;
     int d2 = (i2 >= 0) ? arr2[i2] : 0;
     

     int temp = carry + d1 +d2;

     int quet = temp/10;
     int rem = temp%10;

     carry= quet;

     res[i3]= rem;

     i1--;
     i2--;
     i3--;
    }

//leading zeores remove
    int idx = 0 ;
    while (res[idx]==0){
        idx++;
    }
  for( int i=idx ; i<res.length ; i++){

      System.out.println(res[i]);
  }


 }

}

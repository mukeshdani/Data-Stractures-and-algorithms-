// Subsets Of Array

/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.         

Constraints

1 

Format

Input

A number n
n1
n2
.. n number of elements

Output

[Tab separated elements of subset]
..
All subsets

Example

Sample Input

3
10
20
30

Sample Output

-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	

*/


//Source Code

import java.io.*;
import java.util.*;

public class SubsetsOfArray {

 public static int decimalToBinary(int n){
       // write code here

       int res = 0 ;
        int multiplier = 1; 
        while ( n>0){
            int divisor = n/2;
            int remainder = n%2;
            n = divisor;
            res = res + remainder*multiplier;
            multiplier*=10;
        }
        return res ;
   }



public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner ( System.in );
    int n = scn.nextInt();

    int[] arr = new int[n];

    for(int i = 0; i<n;i++){

        arr[i]=scn.nextInt();
    }

    int totalSubset = (int)Math.pow(2,n);

    for(int dec = 0 ; dec<totalSubset ; dec++){
        int binaryNo = decimalToBinary(dec);

        // Convert binary to equivalent decimal subset 
      int Power = (int)Math.pow(10,n-1);
      for( int i = 0 ;  i<n ;i++){
        int bit =(binaryNo / Power)%10;

        if ( bit == 1){
            System.out.print(arr[i] + "\t");
        }else {
            System.out.print("-\t");
        }
        Power/=10;

      }

      System.out.println();

    }

 }

}
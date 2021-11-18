

//Saddle Price

/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

Constraints

1 

Format

Input

A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a

Output

Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Example

Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output

41

*/

//Source Code

import java.io.*;
import java.util.*;

public class Saddle_Price{

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner (System.in );
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for ( int i=0 ; i<n ; i++){
            for ( int j = 0 ; j<n ; j++){

                arr[i][j]=scn.nextInt();
            }
        }
      // first of all create a loop in  row
          
          int minCol=0;

      for (int i= 0 ;i<arr.length ; i++ ){

          // now check minimum of the ith row element 

          for (int j = 0 ; j<arr[0].length ; j++){
           // check kro konse element minimum hai is row mai colunm ko aage badate hua

           if (arr[i][j]<arr[i][minCol]){

               minCol=j;
           }
          }

          // ab max check krna 
           int maxRow= 0 ;

          for ( int k = 0 ; k<arr.length;k++){

         if(arr[k][minCol]>arr[maxRow][minCol]){
             maxRow=k ;
         }
          }
// ab check krna  hai ki min in row -->max in col hai ya nhi 

          if (maxRow==i){
              System.out.println(arr[maxRow][minCol]);
              return;
          }
      } 
// agr koi saddle point nhi aata toh invalid ya fir 0 saddle point hoga 

System.out.println("Invalid input");


    }

}

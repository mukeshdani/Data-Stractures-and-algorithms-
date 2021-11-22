


// TwoDArray_1WavePrint

//Source Code
import java.io.*;
import java.util.*;

public class TwoDArray_1WavePrint{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    

        Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] mat = new int[n][m];
    for (int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m;j++){

            mat[i][j]=scn.nextInt();
        }
    }
        
        int count = 0 ;
       int frow = 0 ;
         int fcol = 0 ; 
         int lrow = n-1;
         int lcol= m-1;
    
         for ( int i = 0 ; i<n ;i++){
          for ( int j = fcol ; j<=lcol ; j++){
           System.out.print(mat[frow][j] + " ");
           count++;
          }
           frow++;
              if ( count==n*m){
                  break;
              }

           for ( int j=lcol; j >= fcol ; j--){
               System.out.print(mat[frow][j] + " ");
               count++;
           }
           frow++;
              if ( count==n*m){
                  break;
              }
       }
        
    
        System.out.println();
         count =0 ;
         frow = 0 ;
          fcol = 0 ; 
         lrow = n-1;
          lcol= m-1;
        
        for ( int j = 0 ; j<mat[0].length; j++){
            for ( int i = frow ; i<=lrow ; i++){
                System.out.print(mat[i][fcol] + " ");
                count++;
            }
            fcol++;
             if ( count==n*m){
                  break;
              }
            for ( int i = lrow ; i>=frow ; i--){
                System.out.print(mat[i][fcol] + " ");
                count++;
            }
            fcol++;
             if ( count==n*m){
                break;
              }
        }
           
}
}



/*

1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Wave print it row-wise and then column wise.

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 5 4 7 8 9
1 4 7 8 5 2 3 6 9
Input Format

Integer representing r and c.
Integer representing r*c numbers.
Constraints

N cannot be Negative.
0 <= r & c<= 10^9
-10^9 <= Arr[i] <= 10^9
Output Format

print the output.
Sample Input 0

5 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
Sample Output 0

1 2 3 4 5 10 9 8 7 6 11 12 13 14 15 20 19 18 17 16 21 22 23 24 25
1 6 11 16 21 22 17 12 7 2 3 8 13 18 23 24 19 14 9 4 5 10 15 20 25

*/



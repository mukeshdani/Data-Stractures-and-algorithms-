
// Pep_Java_5TwoDArray_5TraceByAddingTwoMatrices

//Source Code
import java.io.*;
import java.util.*;

public class Pep_Java_5TwoDArray_5TraceByAddingTwoMatrices {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scn = new Scanner ( System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr1 = new int[n][m];
         for ( int i = 0 ; i<n ; i++){
             for ( int j= 0 ; j <m ; j++){
                 arr1[i][j]=scn.nextInt();
             }
         }
        
        int [][] arr2 = new int[n][m];
         for ( int i = 0 ; i<n ; i++){
             for ( int j= 0 ; j <m ; j++){
                 arr2[i][j]=scn.nextInt();
             }
         }
        
        int c[][]=new int[n][m];  
    
            
           for(int i=0;i<n;i++){    
         for(int j=0;j<m;j++){    
         c[i][j]=arr1[i][j]+arr2[i][j];        
           }    
           }
        int add = 0 ;
        for ( int i = 0 ; i<c.length ; i++){
            for ( int j = 0 ; j<c.length ;j++){
                if ( i==j){
                   add = add +c[i][j]; 
                }
            }
        }
        
        System.out.println(add);
        
    }
}

/*

1.Take an input r, the size of row.
2.Take an input c, the size of column.
3.Take r*c more inputs and store that in an Matrix.
4.Take r*c more inputs and store that in an another Matrix.


Consider two matrix ANXM, BNXM. Both matrix A and matrix B contains equal
elements. The task is to find the trace of the matrix formed by addition of
A and B. Trace of matrix PNXM is defined as
P[0][0] + P[1][1] + P[2][2] +….. + P[min(n – 1, m – 1)][min(n – 1, m – 1)]
i.e addition of main diagonal.

Example(To be used only for expected output):

Input:
3 3
1 2 3
4 5 6
7 8 9
1 4 7
2 5 8
3 6 9

output
30

Explanation:
    1 2 3
A = 4 5 6
    7 8 9

     1 4 7
B =  2 5 8
     3 6 9

        2 6 10
A + B = 6 10 14
        10 14 18

Trace = 2 + 10 + 18 = 30
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

3 3
1 2 3
4 5 6
7 8 9
1 4 7
2 5 8
3 6 9
Sample Output 0

30

*/
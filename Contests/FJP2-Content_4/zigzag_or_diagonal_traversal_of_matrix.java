
//zigzag-or-diagonal-traversal-of-matrix


//Source Code

import java.io.*;
import java.util.*;

public class zigzag_or_diagonal_traversal_of_matrix  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in );
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int [n][m];
        
        for ( int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for ( int sum = 0 ; sum < arr.length+arr[0].length ;sum++){
            
            if ( sum <(arr.length+arr[0].length)/2){
                
                for ( int j = 0 , i = sum - j ; i>=0&&j<m ; i--, j++){
                       System.out.print(arr[i][j]+" ") ;  
                }
                
            }else {
                for ( int  i = arr.length-1,j =sum - i ; i>=0&&j<m ; i--, j++){
                       System.out.print(arr[i][j]+" ") ;  
                }
            }
            
            System.out.println();
            
        }
        
    }
}



/*
Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.

input:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
   
output:
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input Format

first line of input is row and column
second line contains row*column elements
Constraints

Integer Inout.
Output Format

display matrix
Sample Input 0

5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
Sample Output 0

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
*/



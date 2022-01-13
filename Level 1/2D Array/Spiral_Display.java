//Spiral Display

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.

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
.. n * m number of elements

Output

e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Example

Sample Input

3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35

Sample Output

11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/

//Source Code


import java.util.*;

public class Spiral_Display {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] mat = new int[n][m];
    for (int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m;j++){

            mat[i][j]=scn.nextInt();
        }
    }

      int count =  0;
       int frow = 0 ;
         int fcol = 0 ; 
         int lrow = n-1;
         int lcol= m-1;
    while (true){
        
        
         //left wall 
          for ( int i = fcol ; i<=lrow ; i++){
           System.out.println(mat[i][fcol]);
           count++;
           if (count==n*m){
               return ; 
           }
          }
           fcol++;
           //bottom wall

           for ( int j=fcol; j <= lcol ; j++){
               System.out.println(mat[lrow][j]);
               count++;
               if ( count==n*m){
                   return;
               }
           }
           lrow--;
           //right wall 
           for (int k = lrow ; k>=frow ; k--){
               System.out.println(mat[k][lcol]);
               count++;
               if (count==n*m){
                   return;
               }
           }
          lcol--;

          // Top wall

          for ( int j = lcol ; j>=fcol ; j--){
              System.out.println(mat[frow][j]);
              count++;
              if ( count==n*m){
                  return;
              }
          }
          frow++;
          }


       }

       
    }


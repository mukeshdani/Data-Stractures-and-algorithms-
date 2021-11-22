


// TwoDArray_2SpiralPrint
// Source Code

import java.io.*;
import java.util.*;

public class TwoDArray_2SpiralPrint  {
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n][m];
    for (int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m;j++){

            a[i][j]=scn.nextInt();
        }
    }
        int [][] b= new int [n][m];
        for (int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m;j++){

             b [i][j]  = a[i][j];
        }
    }
         
  
  
      int i, k = 0, l = 0; 
  
    while (k < m && l < n) 
    { 
      
        for (i = l; i < n; ++i) 
        { 
            
            System.out.print(b[k][i] + " ");
        } 
        k++; 
  
       
        for (i = k; i < m; ++i) 
        { 
           
            System.out.print(b[i][n-1] + " ");
            
        } 
        n--; 
        
        if ( k < m) 
        { 
            for (i = n-1; i >= l; --i) 
            { 
                
                System.out.print(b[m-1][i] + " ");
            } 
            m--; 
        } 
  
       
        if (l < n) 
        { 
            for (i = m-1; i >= k; --i) 
            { 
                System.out.print(b[i][l] + " ");
            } 
            l++;     
        }         
    
    } 
      System.out.println();
        
        int counts =  0;
       int frow = 0 ;
         int fcol = 0 ; 
         int lrow = b.length-1;
         int lcol= b[0].length-1;

    while (true){
        
        
         //left wall 
          for ( int z= fcol ; z<=lrow ; z++){
           System.out.print(a[z][fcol] + " ");
           counts++;
           if (counts==b.length*b[0].length){
               return ; 
           }
          }
           fcol++;
           //bottom wall

           for ( int j=fcol; j <= lcol ; j++){
               System.out.print(a[lrow][j]+ " ");
               counts++;
               if ( counts==b.length*b[0].length){
                   return;
               }
           }
           lrow--;
           //right wall 
           for (int p = lrow ; p>=frow ; p--){
               System.out.print(a[p][lcol] + " ");
               counts++;
               if (counts==b.length*b[0].length){
                   return;
               }
           }
          lcol--;

          // Top wall

          for ( int j = lcol ; j>=fcol ; j--){
              System.out.print(a[frow][j] + " ");
              counts++;
              if ( counts==b.length*b[0].length){
                  return;
              }
          }
          frow++;
          }
         
     }
    }



/*

1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Spiral print it clock wise and then anti-clock wise

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 9 8 7 4 5
1 4 7 8 9 6 3 2 5
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

1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
1 6 11 16 21 22 23 24 25 20 15 10 5 4 3 2 7 12 17 18 19 14 9 8 13

*/

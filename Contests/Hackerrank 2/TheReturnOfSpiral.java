
//The Return Of Spiral

//Source code

import java.io.*;
import java.util.*;

public class TheReturnOfSpiral{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[][] a=new int[n][n];
        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=n-1;
        int i=1;
        int l=n*n;
        while(i!=l+1)
        {
            for(int j=cmin;j<=cmax && i!=l+1;j++)
            {
                a[rmin][j]=i;
                i++;
            }
            rmin++;
            for(int j=rmin;j<=rmax && i!=l+1;j++)
            {
                a[j][cmax]=i;
                i++;
            }
            cmax--;
            for(int j=cmax;j>=cmin && i!=l+1;j--)
            {
                a[rmax][j]=i;
                i++;
            }
            rmax--;
            for(int j=rmax;j>=rmin && i!=l+1;j--)
            {
                a[j][cmin]=i;
                i++;
            }
            cmin++;
        }
        
        
        for ( int k =0 ; k<a.length ;k++){
            for ( int m = 0 ; m<a[0].length;m++){
                System.out.print(a[k][m] + " ");
            }
            System.out.println();
        }
        
        
    }
}

/*


Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

Example :

image

NOTE:

These both 2d Array represention is same.

[[1,2,3],[8,9,4],[7,6,5]]       =       1 2 3
                                        8 9 4 
                                        7 6 5
Input Format

Take an input interger n.

Constraints

1 <= n <= 20
Output Format

Print the desired matrix through spiral.

Sample Input 0

3
Sample Output 0

1 2 3
8 9 4
7 6 5

*/
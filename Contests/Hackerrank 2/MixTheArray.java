
//Source Code
import java.io.*;
import java.util.*;

public class MixTheArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner (System.in );
        
        int n = scn.nextInt();
        
        int m  = 2*n;
        int[] arr = new int[m];
        
        for ( int i = 0 ; i<m ; i++){
            arr[i]= scn.nextInt();
        }
        
       int[] result = new int[arr.length];

        for(int i = 0; i < n; i++){
            result[i*2] = arr[i];
        }

        for(int j = 1; j < n+1; j++) {
            result[(j*2)-1] = arr[n+j-1];
        }
        
        
        for ( int i = 0 ; i<m ; i++){
            System.out.print(result[i]+" ");
        }
        
        
    }
    
   
}


/*

Given the array A consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input Format

First line of each test case starts with an integer N denoting the size of the array A.
Next line of input contains 2n space separated integers, where the ith integer denotes the value Ai.
Constraints

1 <= n <= 500
A.length == 2n
1 <= A[i] <= 10^3
Output Format

For each test case, print the resultant array after mixing.
Sample Input 0

3
2 5 1 3 4 7
Sample Output 0

2 3 5 4 1 7
Explanation 0

Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

*/
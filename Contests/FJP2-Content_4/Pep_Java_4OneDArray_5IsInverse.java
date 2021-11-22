//Pep_Java_4OneDArray_5IsInverse

//Source Code

import java.io.*;
import java.util.*;

public class Pep_Java_4OneDArray_5IsInverse{
    
     public static int[] inverse(int[] a){
    // write your code here
    int n=a.length ; 
    int[] b = new int[n];

    for(int i=0 ; i<n ; i++){
        int j = a[i];
        b[j]=i;
    }
    return b;
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        
        int [] arr1 = new int[n];
        
        for ( int i = 0 ; i<n ;i++){
            arr1[i]=scn.nextInt();
        }
        
        int [] arr2 =new int[n];
        
        for ( int j = 0 ; j<arr2.length;j++){
            arr2[j]= scn.nextInt();
        }
        
        int[] inv = inverse(arr1);
        int count = 0 ;
        
         for ( int k = 0 ; k<inv.length ; k++){
             
             if (arr2[k] == inv[k]){
                  count ++;                      
             }
         }
        
        if ( count == inv.length){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}

/*



1.Take an input N, the size of array.
2.Take N more inputs and store that in an array.

Write a function which returns true if the second array is inverse of first and
false otherwise. Print the value returned.

Example(To be used only for expected output):
Input:
4
1 2 3 0
3 0 1 2
Output:
true
Input Format

Integer representing N
Integer representing N numbers.
Constraints

N cannot be Negative.
0 <= N <= 10^9
-10^9 <= Arr[i] <= 10^9
Output Format

print the boolean output.
Sample Input 0

4
1 2 3 0
3 0 1 2
Sample Output 0

true

*/

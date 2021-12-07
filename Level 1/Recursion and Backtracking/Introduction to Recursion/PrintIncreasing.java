
//Print Increasing

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in );
        int n= scn.nextInt();

        printDecreasing( n );
    }

    public static void printDecreasing(int n){
        
      if ( n==0 )return ;
      
      printDecreasing(n-1);
      System.out.println(n);
    }

}

/*


1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

1 

Format

Input

A number n

Output

1
2
3
..
n

Example

Sample Input

5

Sample Output

1
2
3
4
5

*/



// Factorial
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in );
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){

         if ( n==0 ) return 1;

        
         int fact =  factorial(n-1);

         return fact*n;

        
    }

}






/*1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 

Format

Input

A number n

Output

factorial of n

Example

Sample Input

5


Sample Output

120*/
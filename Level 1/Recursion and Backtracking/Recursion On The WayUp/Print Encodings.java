
//Print Encodings

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner ( System.in );
        String str = scn.next();
        printEncodings(0 , str,"");
    }

    public static void printEncodings(int idx , String str,String output ) {
        if ( idx == str.length()){
            // positive case
          System.out.println(output);
            return;
        } 
               // corner cases
           int ch1 = str.charAt(idx)-'0';
           if ( ch1 >= 1 && ch1 <= 9){
                      printEncodings(idx+1 , str , output + (char)('a' + ch1 - 1) ); 
           }

         if ( idx + 1 < str.length()){
           int ch2 = (str.charAt(idx)-'0')*10+(str.charAt(idx+1)-'0');

           if ( ch2 >= 10 && ch2 <= 26){
               printEncodings(idx+2 , str , output + (char)('a'+ ch2 - 1));
           }

               }

    }

}




/*1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= str.length <= 10

Format

Input

A string str

Output

Permutations of str in order hinted by Sample output

Example

Sample Input

655196


Sample Output

feeaif
feesf*/
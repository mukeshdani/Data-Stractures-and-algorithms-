
//Remove Consecutive Duplicates


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
    
    }
    public static String compression1(String str){
        // write your code here
        String str1 = "";

        for ( int i = 0 ; i<str.length();i++){

            if (i == 0 || str.charAt(i)!=str.charAt(i-1) ){
                str1 = str1 + str.charAt(i);
            }
        }

        return str1;
    }
}

/*

1.Take as input String.

Write a function that removes all consecutive duplicates and then print desired
String.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
abc
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.

Sample Input 0

aabbbccccccc
Sample Output 0

abc
*/
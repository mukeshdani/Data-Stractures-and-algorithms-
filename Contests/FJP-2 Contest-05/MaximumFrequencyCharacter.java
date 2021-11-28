
// Maximum Frequency Character

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner (System.in );
        String str = scn.nextLine();
        System.out.println(getMaxOccuringChar(str ));
    }
    
    public static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
}




/*
1.Take as input String.

Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
c
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.
*/
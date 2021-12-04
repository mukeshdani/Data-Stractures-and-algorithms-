
//Check If Two String Arrays are Equivalent

import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String ans1 = "";
        String ans2 = "";
        
        for(String str:word1) {
            ans1 = ans1 + str;
        }
        
        for(String str:word2) {
            ans2 = ans2 + str;
        }
        
        return ans1.equals(ans2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        String[] arr1 = new String[n];
        
        for(int i=0;i<n;i++) {
            arr1[i] = scn.next();
        }
        int m= scn.nextInt();
        String[] arr2 = new String[m];
        
        for(int i=0;i<m;i++) {
            arr2[i] = scn.next();
        }
        scn.close();
        System.out.println(arrayStringsAreEqual(arr1,arr2));
        
}
}




/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Input Format

First Line contains length of array1, n
Following n lines of n strings
First Line contains length of array2, m
Following n lines of m strings
Constraints

1 <= word1.length, word2.length <= 103 1 <= word1[i].length, word2[i].length <= 103 1 <= sum(word1[i].length), sum(word2[i].length) <= 103 word1[i] and word2[i] consist of lowercase letters.

Output Format

true or false depending upon the equality of the arrays

Sample Input 0

2
ab
c
2
a
bc
Sample Output 0

true
Explanation 0

word1 represents string "ab" + "c" -> "abc" word2 represents string "a" + "bc" -> "abc" The strings are the same, so return true.

Sample Input 1

2
a
cb
2
a
bc
Sample Output 1

false
Sample Input 2

3
abc
d
defg
1
abcddefg
Sample Output 2

true*/
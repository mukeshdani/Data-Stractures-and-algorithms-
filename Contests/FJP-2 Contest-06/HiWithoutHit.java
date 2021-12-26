
//HiWithoutHit


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int countHi(String s){
        if(s.length() <= 2)
            return (s.charAt(0)=='h' && s.charAt(1)=='i')?1:0;
        if(s.charAt(0)=='h' && s.charAt(1)=='i' && s.charAt(2)!='t')
            return 1 + countHi(s.substring(2));
        return countHi(s.substring(1));
    }
    
    public static String removeHi(String s){
        if(s.length() <= 2)
            return (s.charAt(0)=='h' && s.charAt(1)=='i')?"":s;
        if(s.charAt(0)=='h' && s.charAt(1)=='i' && s.charAt(2)!='t'){
            String smallAns = removeHi(s.substring(2));
            return smallAns+"";
        }
        String smallAns = removeHi(s.substring(1));
        return smallAns+s.charAt(0);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(countHi(s));
        String ans = removeHi(s);
        String res = "";
        for(int i=0; i<ans.length(); i++)
            res = ans.charAt(i) + res;
        System.out.println(res.charAt(n));
        System.out.println(res);
    }
}








/*1.Take as input String.
2.Take as input Integer "i" which I used to verify your return type String.

a. Write a recursive function which counts the number of times ‘hi’ appears in
   the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’.
   Print the value returned.
b. Write a recursive function which removes all ‘hi’ in the string – but skip
   all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the i'th index
   character from the returned value.
c. Write a recursive function which removes all ‘hi’ in the string – but skip
   all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the
   output (return type void).


Example(To be used only for expected output):

Input:
hihihithi 2

output
3
t
hit
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print Output.

Sample Input 0

hihihithi 2
Sample Output 0

3
t
hit*/
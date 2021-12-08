
//Print Permutations



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
        sc.close();
    }

    public static void printPermutations(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        
        for(int i=0; i<input.length(); i++){
            String newInput = input.substring(0, i)+input.substring(i+1);
            printPermutations(newInput, output+input.charAt(i));
        }  
    }

}




/*1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= str.length <= 7

Format

Input

A string str

Output

Permutations of str in order hinted by Sample output

Example

Sample Input

abc

Sample Output

abc
acb
bac
bca
cab
cba*/
//Print All Palindromic Substrings

//Source Code


import java.util.*;

public class Print_All_Palindromic_Substrings {

    public static boolean isPalin(String s){
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static void printSubstrings(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalin(s.substring(i,j+1))){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSubstrings(s);
        sc.close();
    }    
}

/*

1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Constraints

1 

Format

Input

A String

Output

All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Example

Sample Input

abcc

Sample Output

a
b
c
cc
c

*/



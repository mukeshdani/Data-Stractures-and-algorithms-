
// String Compression


import java.util.*;

public class StringCompression{

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

	public static String compression2(String str){
		// write your code here

		String str1 ="";
        int freq = 0 ; 
		for ( int i = 0 ; i<str.length();i++){

			if (i==0 || str.charAt(i)!=str.charAt(i-1) ){
                 if ( i > 0 && freq > 1 ){
                     str1  = str1 + freq;
                 }
				str1 = str1 + str.charAt(i);
                freq=0;
			}
            freq++;
		}


     if ( freq > 1){
         str1 = str1 + freq ;
     }
		return str1;
			}
		
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		scn.close();
	}

}

/* 

1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".

Constraints

1 

Format

Input

A String

Output

Two strings representing first compressed string and second compressed string respectively.

Example

Sample Input
wwwwaaadexxxxxx

Sample Output

wadex
w4a3dex6

*/

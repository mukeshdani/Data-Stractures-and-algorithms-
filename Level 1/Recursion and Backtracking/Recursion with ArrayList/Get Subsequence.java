//Get Subsequence

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner (System.in);

         String str = scn.nextLine();

         ArrayList <String> subset = gss(0,str);

         System.out.println(subset);//invoke tostring
          

    }

    public static ArrayList<String> gss(int idx,String str) {
        if (idx==str.length()){
            ArrayList <String> base = new ArrayList<>();
            base.add("");
            return base;
        }
ArrayList<String> smallAns =  gss(idx+1,str);

        ArrayList<String> ans = new ArrayList<>();

        for ( String smallsubset : smallAns){

            ans.add(smallsubset);
        }

         for ( String smallsubset : smallAns){

            ans.add(str.charAt(idx)+smallsubset);
        }


return ans;

    }

}




/*1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 

Format

Input

A string str

Output

Contents of the arraylist containing subsequences as shown in sample output

Example

Sample Input

abc

Sample Output

[, c, b, bc, a, ac, ab, abc]*/

//Get Stair Paths 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
   ArrayList<String> arr = getStairPaths(n);
    System.out.println(arr);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n==0){
            ArrayList<String> str = new ArrayList<>();
            str.add("");
            return str;
        }

        //faith 

        ArrayList <String> ans = new ArrayList<>();


if( n-1>=0){
  ArrayList <String> smallans1 = getStairPaths(n-1);  
for (String str : smallans1){
    ans.add("1"+str);
}
}

if (n-2>=0){
  ArrayList <String> smallans2 = getStairPaths(n-2);
  
for ( String str: smallans2){
    ans.add("2"+str);
}}

if (n-3>=0){
  ArrayList <String> smallans3 = getStairPaths(n-3);

for ( String str : smallans3){
    ans.add("3"+str);
}
}
    

return ans ;

  }

}




/*1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 

Format

Input

A number n

Output

Contents of the arraylist containing paths as shown in sample output

Example

Sample Input

3

Sample Output

[111, 12, 21, 3]*/
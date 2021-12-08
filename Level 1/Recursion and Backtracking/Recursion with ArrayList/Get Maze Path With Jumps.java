
//Get Maze Path With Jumps

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner (System.in);
int n =scn.nextInt();
int m =scn.nextInt();
    
     ArrayList<String> arr = getMazePaths(0,0,n-1,m-1);
     System.out.print(arr);

    }

   
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
         }
ArrayList<String> res = new ArrayList<>();
    // Horizontal 

    int jump = 1; 

    while(sc+jump <= dc){

        ArrayList<String> rightPath = getMazePaths(sr,sc+jump,dr,dc);
        for (String str: rightPath)
            res.add("h"+jump+str);
        jump++;
    }

    //Vertical 
    jump = 1; 
    while ( sr+jump <= dr){
    ArrayList<String> downPath = getMazePaths(sr+jump,sc,dr,dc);
        for (String str :downPath)
            res.add("v"+jump+str);
        jump++;   
    }

    //Diagonal 

    jump=1; 
     while(sr+jump <= dr && sc+jump <= dc){
       ArrayList<String> diagonalPath = getMazePaths(sr+jump,sc+jump,dr,dc); 
       for ( String str:diagonalPath)
          res.add("d"+jump+str);
          jump++; 
     }

return res;
    }

}



/*1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= n <= 10 0 <= m <= 10

Format

Input

A number n
A number m

Output

Contents of the arraylist containing paths as shown in sample output

Example

Sample Input

2
2

Sample Output

[h1v1, v1h1, d1]*/
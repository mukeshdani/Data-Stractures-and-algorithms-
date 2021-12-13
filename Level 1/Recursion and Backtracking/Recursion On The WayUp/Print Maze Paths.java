

//Print Maze Paths

import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner (System.in );
          int n = scn.nextInt();
          int m = scn.nextInt();
          printMazePaths(0 , 0,n-1,m-1 ,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
           
           if (sr>dr||sc>dc){//+ve test case 
               return;
           }

           if (sr==dr&&sc==dc ){//-ve test case 
            System.out.println(psf);
            return;
           }

            printMazePaths(sr , sc+1 , dr , dc , psf + "h");// for horizontal travell 
            printMazePaths(sr+1, sc, dr , dc , psf + "v");// for vertical travell

	    }

	}













/*1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of pri tMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= n <= 10 0 <= m <= 10

Format

Input

A number n
A number m

Output

Print paths (one path in each line) in order hinted by Sample output

Example

Sample Input

2
2

Sample Output

hv
vh*/
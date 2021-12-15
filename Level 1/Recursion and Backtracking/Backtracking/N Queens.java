
//N Queens

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner ( System.in );
        int n = scn.nextInt();
         boolean  [][]arr = new boolean[n][n];

         printNQueens(arr , "", 0);
        
    }
    public static boolean isQueenSafe(boolean[][] chess , int row , int col){
        // upward
        for ( int i = 0 ; i<row; i++){
            if (chess[i][col]==true){
                return false ;
            }
        }
        // upward left 

        int i = row , j = col ;
        while ( i >=0 && j>=0){
            if ( chess[i][j]==true){
                return false ;
            }
            i--;
            j--;
        }
        // upward right 
         i = row ; j = col ;
        while ( i >=0 && j<chess.length){
            if ( chess[i][j]==true){
                return false ;
            }
            i--;
            j++;
        }
        return true;

    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
           // base case 
           if (row == chess.length ){
        System.out.println(qsf + ".");
        return ;
           }

           for ( int col = 0 ; col<chess.length ; col++){
               if ( isQueenSafe(chess, row , col )==true){
                 chess[row ][col]=true;
                 printNQueens(chess , qsf + row + "-" + col + ", ",row+1);
                 chess[row][col]=false ;

               }
           }         
    }
}



/*N Queens




Easy

1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

1 <= n <= 10

Format

Input

A number n

Output

Safe configurations of queens as suggested in sample output

Example

Sample Input

4

Sample Output

0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, */
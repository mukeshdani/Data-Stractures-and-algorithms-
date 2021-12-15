
//Knights Tour
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner ( System.in );
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        int [][]arr = new int[n][n];

        printKnightsTour(arr , r , c,1);


    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        
    
        if(r < 0 || r >= chess.length || c < 0 || c >= chess.length || chess[r][c] > 0)
        {
            // -ve base case
            return;
        }
        
        if(upcomingMove == chess.length * chess.length)
        {
            // + ve base case
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r-2, c+1, upcomingMove + 1);
        printKnightsTour(chess, r-1, c+2, upcomingMove+ 1);
        printKnightsTour(chess, r+1, c+2, upcomingMove + 1);
        printKnightsTour(chess, r+2, c+1, upcomingMove + 1);
        printKnightsTour(chess, r+2, c-1, upcomingMove + 1);
        printKnightsTour(chess, r+1, c-2, upcomingMove + 1);
        printKnightsTour(chess, r-1, c-2, upcomingMove + 1);
        printKnightsTour(chess, r-2, c-1, upcomingMove + 1);
        chess[r][c] = 0;
    }

      public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}






/*1. You are given a number n, the size of a chess board.
2. You are given a row and a column, as a starting point for a knight piece.
3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
     all cells of the board exactly once.
4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
     print all configurations of the chess board representing the route
     of knight through the chess board. Use sample input and output to get more idea.

Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
               move in clockwise manner to
               explore other options.
Note -> The online judge can't force you to write the function recursively but that is what the spirit of 
               question is. Write recursive and not iterative logic. The purpose of the question is to aid 
               learning recursion and not test you.

Constraints

n = 5 0 <= row < n 0 <= col < n

Format

Input

A number n
A number row
A number col

Output

All configurations of the chess board representing route of knights through the chess board starting in (row, col)
Use displayBoard function to print one configuration of the board.

Example

Sample Input

5
2
0


Sample Output

25 2 13 8 23 
12 7 24 3 14 
1 18 15 22 9 
6 11 20 17 4 
19 16 5 10 21 

19 2 13 8 21 
12 7 20 3 14 
1 18 15 22 9 
6 11 24 17 4 
25 16 5 10 23 

25 2 13 8 19 
12 7 18 3 14 
1 24 15 20 9 
6 11 22 17 4 
23 16 5 10 21 

19 2 13 8 25 
12 7 18 3 14 
1 20 15 24 9 
6 11 22 17 4 
21 16 5 10 23 

21 2 17 8 19 
12 7 20 3 16 
1 22 13 18 9 
6 11 24 15 4 
23 14 5 10 25 

23 2 17 8 25 
12 7 24 3 16 
1 22 13 18 9 
6 11 20 15 4 
21 14 5 10 19 

25 2 17 8 23 
12 7 24 3 16 
1 18 13 22 9 
6 11 20 15 4 
19 14 5 10 21 

19 2 17 8 21 
12 7 20 3 16 
1 18 13 22 9 
6 11 24 15 4 
25 14 5 10 23 

25 2 15 8 19 
16 7 18 3 14 
1 24 11 20 9 
6 17 22 13 4 
23 12 5 10 21 

19 2 15 8 25 
16 7 18 3 14 
1 20 11 24 9 
6 17 22 13 4 
21 12 5 10 23 

21 2 15 8 19 
16 7 20 3 14 
1 22 11 18 9 
6 17 24 13 4 
23 12 5 10 25 

23 2 15 8 25 
16 7 24 3 14 
1 22 11 18 9 
6 17 20 13 4 
21 12 5 10 19 

23 2 13 8 21 
14 7 22 3 12 
1 24 9 20 17 
6 15 18 11 4 
25 10 5 16 19 

21 2 13 8 23 
14 7 22 3 12 
1 20 9 24 17 
6 15 18 11 4 
19 10 5 16 25 

25 2 13 8 19 
14 7 18 3 12 
1 24 9 20 17 
6 15 22 11 4 
23 10 5 16 21 

19 2 13 8 25 
14 7 18 3 12 
1 20 9 24 17 
6 15 22 11 4 
21 10 5 16 23 

21 2 11 16 19 
12 17 20 3 10 
1 22 7 18 15 
6 13 24 9 4 
23 8 5 14 25 

23 2 11 16 25 
12 17 24 3 10 
1 22 7 18 15 
6 13 20 9 4 
21 8 5 14 19 

23 2 11 16 21 
12 17 22 3 10 
1 24 7 20 15 
6 13 18 9 4 
25 8 5 14 19 

21 2 11 16 23 
12 17 22 3 10 
1 20 7 24 15 
6 13 18 9 4 
19 8 5 14 25 

21 2 9 14 19 
10 15 20 3 8 
1 22 5 18 13 
16 11 24 7 4 
23 6 17 12 25 

23 2 9 14 25 
10 15 24 3 8 
1 22 5 18 13 
16 11 20 7 4 
21 6 17 12 19 

25 2 9 14 23 
10 15 24 3 8 
1 18 5 22 13 
16 11 20 7 4 
19 6 17 12 21 

19 2 9 14 21 
10 15 20 3 8 
1 18 5 22 13 
16 11 24 7 4 
25 6 17 12 23 

23 2 7 12 21 
8 13 22 17 6 
1 24 3 20 11 
14 9 18 5 16 
25 4 15 10 19 

21 2 7 12 23 
8 13 22 17 6 
1 20 3 24 11 
14 9 18 5 16 
19 4 15 10 25 

25 2 7 12 23 
8 13 24 17 6 
1 18 3 22 11 
14 9 20 5 16 
19 4 15 10 21 

19 2 7 12 21 
8 13 20 17 6 
1 18 3 22 11 
14 9 24 5 16 
25 4 15 10 23 

25 4 15 10 23 
14 9 24 5 16 
1 18 3 22 11 
8 13 20 17 6 
19 2 7 12 21 

19 4 15 10 21 
14 9 20 5 16 
1 18 3 22 11 
8 13 24 17 6 
25 2 7 12 23 

25 4 15 10 19 
14 9 18 5 16 
1 24 3 20 11 
8 13 22 17 6 
23 2 7 12 21 

19 4 15 10 25 
14 9 18 5 16 
1 20 3 24 11 
8 13 22 17 6 
21 2 7 12 23 

21 6 17 12 19 
16 11 20 7 4 
1 22 5 18 13 
10 15 24 3 8 
23 2 9 14 25 

23 6 17 12 25 
16 11 24 7 4 
1 22 5 18 13 
10 15 20 3 8 
21 2 9 14 19 

25 6 17 12 23 
16 11 24 7 4 
1 18 5 22 13 
10 15 20 3 8 
19 2 9 14 21 

19 6 17 12 21 
16 11 20 7 4 
1 18 5 22 13 
10 15 24 3 8 
25 2 9 14 23 

25 8 5 14 19 
6 13 18 9 4 
1 24 7 20 15 
12 17 22 3 10 
23 2 11 16 21 

19 8 5 14 25 
6 13 18 9 4 
1 20 7 24 15 
12 17 22 3 10 
21 2 11 16 23 

21 8 5 14 19 
6 13 20 9 4 
1 22 7 18 15 
12 17 24 3 10 
23 2 11 16 25 

23 8 5 14 25 
6 13 24 9 4 
1 22 7 18 15 
12 17 20 3 10 
21 2 11 16 19 

21 12 5 10 19 
6 17 20 13 4 
1 22 11 18 9 
16 7 24 3 14 
23 2 15 8 25 

23 12 5 10 25 
6 17 24 13 4 
1 22 11 18 9 
16 7 20 3 14 
21 2 15 8 19 

23 12 5 10 21 
6 17 22 13 4 
1 24 11 20 9 
16 7 18 3 14 
25 2 15 8 19 

21 12 5 10 23 
6 17 22 13 4 
1 20 11 24 9 
16 7 18 3 14 
19 2 15 8 25 

21 14 5 10 19 
6 11 20 15 4 
1 22 13 18 9 
12 7 24 3 16 
23 2 17 8 25 

23 14 5 10 25 
6 11 24 15 4 
1 22 13 18 9 
12 7 20 3 16 
21 2 17 8 19 

25 14 5 10 23 
6 11 24 15 4 
1 18 13 22 9 
12 7 20 3 16 
19 2 17 8 21 

19 14 5 10 21 
6 11 20 15 4 
1 18 13 22 9 
12 7 24 3 16 
25 2 17 8 23 

23 16 5 10 21 
6 11 22 17 4 
1 24 15 20 9 
12 7 18 3 14 
25 2 13 8 19 

21 16 5 10 23 
6 11 22 17 4 
1 20 15 24 9 
12 7 18 3 14 
19 2 13 8 25 

25 16 5 10 23 
6 11 24 17 4 
1 18 15 22 9 
12 7 20 3 14 
19 2 13 8 21 

19 16 5 10 21 
6 11 20 17 4 
1 18 15 22 9 
12 7 24 3 14 
25 2 13 8 23 

23 10 5 16 21 
6 15 22 11 4 
1 24 9 20 17 
14 7 18 3 12 
25 2 13 8 19 

21 10 5 16 23 
6 15 22 11 4 
1 20 9 24 17 
14 7 18 3 12 
19 2 13 8 25 

25 10 5 16 19 
6 15 18 11 4 
1 24 9 20 17 
14 7 22 3 12 
23 2 13 8 21 

19 10 5 16 25 
6 15 18 11 4 
1 20 9 24 17 
14 7 22 3 12 
21 2 13 8 23 */


//Exit Point Of A Matrix

/* You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

Constraints

1 

Format

Input

A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output

row
col (of the point of exit)

Example

Sample Input

4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0

Sample Output

1
3
*/

// Source Code

import java.io.*;
import java.util.*;

public class  ExitPointOfAMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m= scn.nextInt();
        int[][] arr=new int[n][m];
        
        for (int i = 0 ;i<n;i++){
            for(int j = 0 ; j<m ;j++){
                arr[i][j]=scn.nextInt();
            }
        }


        int currRow = 0;
        int currCol=0;
        int prevRow = 0;
        int prevCol= 0;
        //Direction rigth-->0,down-->1,left-->2,top-->3
        int direction = 0 ; 

        while( (currCol>=0) && (currRow>=0) && (currRow<n) && (currCol<m)){

            if (arr[currRow][currCol] == 1){
                //Change the direction 
                direction =((direction + 1) % 4);
            }
           
           prevRow = currRow; 
           prevCol = currCol;
             
             if(direction == 0){
                 //toward right
                 currCol++;
             }
             else if (direction == 1){
           //Toward down
                 currRow++;
             }else if (direction == 2){
                 // toward left 
                 currCol--;
             }
             else{
                 //Toward top 
                 currRow--;
             }

       
        }

        System.out.println(prevRow);
        System.out.println(prevCol);

    }

}
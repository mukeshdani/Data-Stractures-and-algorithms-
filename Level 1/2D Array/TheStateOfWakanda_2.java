
//The State Of Wakanda - 2

/*
The historic state of Wakanda has various monuments and souveniers which are visited by many travellers every day. The guides follow a prescribed route of visiting the monuments which improves them understand the relevance of each monument. The route of the monument is fixed and expressed in a 2-d matrix where the travellers visit the prescribed next monument. For example
1  2  3
4  5  6
7  8  9
is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
However, a certain visitor decides to travel a different path as follows:
1. The visitor only plans to visit the upper diagonal triangle of the monument list.
2. The visitor travels diagonally till there are no more moves left in the current journey. 
3. He then visits the adjacent monument to the first monument of current diagonal journey. 
4. He continues the same path till all the monuments of the upper half have been travelled.
For Example:
The monuments are named as:
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
Refer to the photo for a better clarification.
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.
For details check image.

diagonal-traversal

Constraints

1 

Format

Input

A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a

Output

Diagonal traversal as in image below

Example

Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output

11
22
33
44
12
23
34
13
24
14
*/

//Source Code

import java.io.*;
import java.util.*;

public class TheStateOfWakanda_2 {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner (System.in );
        int n = scn.nextInt();

        int[][] mat = new int[n][n];


        for ( int i = 0 ; i<n; i++){
            for ( int j = 0 ; j<n ; j++){
                mat[i][j]=scn.nextInt();
            }
        }
       
       for (int gap = 0 ; gap<mat[0].length ; gap++){

           for(int i = 0,j=gap+i; j<mat[0].length ;j++ ,i++){

               System.out.println(mat[i][j]);
           }
       }



    }

}
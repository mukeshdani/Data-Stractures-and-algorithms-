// The State Of Wakanda - 1

/*

The historic state of Wakanda has various monuments and souvenirs which are visited by many travelers every day. The guides follow a prescribed route of visiting the monuments which improve them understand the relevance of each monument. 

The route of the monument is fixed and expressed in a 2-d matrix where the travelers visit the prescribed next monument. For example

1  2  3
4  5  6
7  8  9

is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9

However, a certain visitor decides to travel a different path as follows: 
1. He first travels southwards till no further south places are available.
2. He then moves only 1 place eastwards.
3. He starts to move again towards north till any further north moves are available. 
This continues till all the places are covered. 

For example, the monuments are named as follows:
1  2  3
4  5  6
7  8  9

Path followed by traveler: 1->4->7->8->5->2->3->6->9

You are required to print the path that this traveler follows to visit all places.


1. You will be given a number n, representing the number of rows.
2. You will be given a number m, representing the number of columns.
3. You will be given n*m numbers, representing elements of 2d arrays.

Note - Please check the output format for details.

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

e11
e12
e13
..
e1n
e2n
e2n-1
..
e21
e31
e32
..
e3n
e4n ..

Example

Sample Input

3
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

Sample Output

11
21
31
32
22
12
13
23
33
34
24
14
*/

//Source Code

import java.io.*;
import java.util.*;

public class TheStateOfWakanda_1{


   public static void waveTraversal(int[][] arr){
    

    for (int j=0 ; j<arr[0].length;j++){ 
        if (j%2==0){
      for(int i = 0 ; i<arr.length; i++){
        System.out.println(arr[i][j]); 
      }
        }else {
            for( int i = arr.length-1; i>=0 ; i--){
                System.out.println(arr[i][j]);
            }
        }
    }

   }


public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in );
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] mat = new int[n][m];
    for (int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m;j++){

            mat[i][j]=scn.nextInt();
        }
    }

   //wave traversal 
   waveTraversal(mat);

 }

}
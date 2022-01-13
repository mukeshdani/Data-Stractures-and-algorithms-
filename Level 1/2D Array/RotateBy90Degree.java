
//Rotate By 90 Degree
/*
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*                      

Constraints

1 

Format

Input

A number n
e11
e12..
e21
e22..
.. n * n number of elements

Output

output is taken care of by display function

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

41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14

*/


//Source Code


import java.util.*;

public class RotateBy90Degree{

    public static void main(String[] args) throws Exception {
        // write your code here
     Scanner scn = new Scanner (System.in);
     int n = scn.nextInt();
     int[][] arr = new int[n][n];

     for ( int i = 0 ; i<n ; i++){
         for (int j = 0 ; j<n ; j++){
             arr[i][j]=scn.nextInt();
         }
     }

        transpose(arr);
        swapColumn(arr);
        display(arr);
    scn.close();

    }
    public static void transpose(int [][] arr){
        for ( int  i=0; i<arr.length ; i++){
            for (int j = i+1; j<arr[0].length ; j++){
                swap(arr , i , j);
            }
        }
    }
    
//transpose 
    public static void swap(int [][] arr , int i , int j ){
        int temp = arr[i][j]; 
        arr[i][j]=arr[j][i];
        arr[j][i]=temp ; 
    }

    public static void swapColumn(int [][] arr ){
        int leftCol = 0 ;
        int rightCol = arr[0].length - 1 ; 
        while(leftCol < rightCol){
            for(int i = 0 ; i<arr.length ; i++){
                swap(arr , i , leftCol,rightCol);
            }
            leftCol++;
            rightCol--;
        }
    }

    public static void swap(int [][]arr , int i , int leftCol, int rightCol){
        int temp = arr[i][leftCol];
        arr[i][leftCol]=arr[i][rightCol];
        arr[i][rightCol]=temp ;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


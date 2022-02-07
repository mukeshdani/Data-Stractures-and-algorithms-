//Celebrity Problem
//https://nados.io/question/celebrity-problem
//https://leetcode.com/problems/find-the-celebrity/

//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1/



// Without Stack 
/* 

int celebrity(int M[][], int n)
    {
    	int i = 0, j = 0;
    while (i < n && j < n) {
        if (M[i][j] == 1) 
            i = j;
        j++;
    }
    if (i == n) return -1;
    for (j = 0; j<n; j++) {
        if (M[i][j] == 1 || i != j && M[j][i] == 0)
        return -1;
    }
    return i;
    } */


    // With Extra Space 
    //TC-> O(N)
    //Extra Space ->O(N)
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it''s index (not position), if there is not then
        // print "none"

        Stack<Integer> stk = new Stack<>();

        for( int i= 0 ; i<arr.length ; i++){
            stk.push(i);
        }
       while( stk.size() > 1){
           int y = stk.pop();
           int x = stk.pop();

           if(arr[x][y] == 1){
               stk.push(y);
           }else{
               stk.push(x);
               //x may or may not  be a celebrity 
           }
       }


       //congirmation 
       int x = stk.pop();
       // its row should be zero 
       //(x should know nobody )
       for ( int i = 0 ; i < arr.length ; i++){
           if(i==x)continue;
           if(arr[x][i]==1){
               System.out.println("none");
               return;
           }
       }
        // its column shold be one (every one should know x)
        for( int i = 0 ; i< arr.length ; i++){
            if(i==x)continue;
            if(arr[i][x] == 0){
                System.out.println("none");
                return;
            }
        }
         System.out.println(x);
    }

}
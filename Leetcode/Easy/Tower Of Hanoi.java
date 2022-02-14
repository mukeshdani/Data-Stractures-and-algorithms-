//Tower Of Hanoi
//https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1/#

// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}





// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if ( N == 0 ) return 0l;
        
        toh (N-1 , from , aux , to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        toh( N-1 , aux , to , from );
        
        return (long)Math.pow(2,N)-1;
    }
}

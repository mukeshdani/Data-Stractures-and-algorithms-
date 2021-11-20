

//Find the Peak Point

//Source Code
import java.io.*;
import java.util.*;

public class FindthePeakPoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] gain = new int[n];
        
        for ( int i = 0 ; i<n ; i++){
            gain[i]=scn.nextInt();
        }
        
        
        int max=0,sum=0;
      for(int i=0;i<gain.length;i++){
       sum += gain[i];
      if(sum>=max){
        max = sum;
         }
       }
        
        System.out.println(max);
        
        
}
}

/*

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Input Format

First line of each test case starts with an integer N denoting the size of the array gain. Next line of input contains N space separated integers, where the ith integer denotes the value gain[i].

Constraints

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
Output Format

For each test case, print the resultant integer. Which is the highest peak.
Sample Input 0

5
-5 1 5 0 -7
Sample Output 0

1

*/

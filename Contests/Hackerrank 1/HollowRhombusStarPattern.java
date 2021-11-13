//You are given a number n. You've to create a pattern of * and separated by a space " " as shown in sample case.
//        *****
//       *   *
//      *   *
//     *   *
//    *****

//Source Code

import java.io.*;
import java.util.*;

public class HollowRhombusStarPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scn = new Scanner (System.in );
        int n = scn.nextInt();
        
       int i, j;
        for (i=1; i<=n; i++)
        {
            
            for (j=1; j<=n - i; j++)
                System.out.print(" ");
              
            
            if (i==1 || i==n)
                for (j=1; j<=n; j++)
                    System.out.print("*");
                  
            
            else
                for (j=1; j<=n; j++)
                    if (j==1 || j==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            
            System.out.println();
        }
        
    }
}

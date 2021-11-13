//Pep_Java_2NumberSystemAndFunctions_3Combinatorics 

/*Take as input
1. first number: n
2. second number: r

Print n!, npr & ncr separated by lines.
Input Format

Integer representing n
Integer representing r
 
*/

// Source Code

import java.io.*;
import java.util.*;

public class Pep_Java_2NumberSystemAndFunctions_3Combinatorics  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scn = new Scanner (System.in );
        
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nfact=fact(n);
        int rfact=fact(r);
      int nmrfact=fact(n-r);
        
        
        int ncr = (nfact/(rfact*nmrfact));
        int npr = (nfact/nmrfact);
    System.out.println(nfact);
        System.out.println(npr);
        System.out.println(ncr);
        
       
    
    }
    
    public static int fact (int a ){
        int facto=1;
        for(int i=1; i<=a; i++){
            facto=facto*i;
        }
        return facto;
    }
    
}


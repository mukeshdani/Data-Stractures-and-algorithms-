// *	*	*	*	*	
//	    *	*	*	*	
//          *	*	*	
//              *	*	
//                  *

import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       
        // write ur code here
        
        for( int i = 1 ; i<=n;i++){
            
            for ( int j = 1 ; j<=i-1;j++){
                System.out.print("\t");
            }
            for( int j = 1; j<=n-(i-1);j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}

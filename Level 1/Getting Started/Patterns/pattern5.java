//              *	
//          *	*	*	
//     *	*	*	*	*	
//          *	*	*	
//              *

import java.util.*;

public class pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n= scn.nextInt();
       
        // write ur code here
        //upper half
        
        for ( int i= 1 ; i<=(n/2+1);i++){
            
            for ( int j =1 ; j<=(n/2+1)-i;j++){
                System.out.print("\t");
            }
            for( int j = 1 ; j<=2*i-1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        
        //lower half
        int dec_count=n-2;
        for ( int i= 1 ; i<=(n/2);i++){
            
            for ( int j =1 ; j<=i;j++){
                System.out.print("\t");
            }
            for( int j = 1 ; j<=dec_count;j++){
                System.out.print("*\t");
            }
            System.out.println();
            dec_count=dec_count-2;
        }

    }
}
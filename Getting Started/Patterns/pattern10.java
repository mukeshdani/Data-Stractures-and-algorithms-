// 	     	*	
//  	*		*	
//  *				*	

//  	*		*	
//	    	*
import java.util.*;

public class pattern10{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
// upper
     // write ur code here
     
     for(int i=1; i<=(n/2 + 1); i++){
         
        for(int j=1; j<= (n/2 + 1)-i; j++){
            System.out.print("\t");
        } 
        
        
        System.out.print("*\t");
         
         
        for(int j=1; j<= 2*(i-1)-1; j++){
            System.out.print("\t");
        }
        
        if(i!=1){
            System.out.print("*\t");
        }
        
        System.out.println();
    }
    
    
    // lower
    for(int i=1;i<=n/2;i++)
    {
       // t1
       for(int j=1;j<=i;j++)
        {
            System.out.print("\t");
            
        }
        // t2
        
        System.out.print("*\t");
        
        //t3
        for(int j=1;j<=(n/2-1);j++)
        {
            System.out.print("\t");
        }
        //t4
        if(i!=(n/2))
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
   /* Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     // write ur code here
     //upper half 
     for ( int i= 1 ; i<=(n/2+1);i++){
         
         for ( int j = 1; j<=(n/2+1)-i;j++){
             System.out.print("\t");
         }
         System.out.print("*\t");
         
         for ( int j= 1;j<=(2*(i-1)-1);j++){
             System.out.print("\t");
         }
        if ( i!=1 ){
         System.out.print("*\t");
        }
         
     
     System.out.println();
     }


//lower half


     for ( int i=1 ; i<=n/2; i++){
         
         for ( int j = 1 ; j<=i; j++){
             System.out.print("\t");
         }
         System.out.print("*\t");
         for (int j= 1 ; j<=(n/2-1);j++){
             System.out.print("\t");
         }
         if ( i != n/2){
         System.out.print("*\t");
         }
          System.out.println("\t");

}*/


 }
}
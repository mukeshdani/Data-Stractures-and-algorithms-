// find Prime Factorisation of a given number 
import java.util.*;

public class PrimeFactorisation{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner (System.in);
  int n = scn.nextInt();
  
  for ( int fact = 2 ; fact*fact <=n ; fact=fact +1){
      while ( n % fact == 0 ){
          n=n/fact ;
          System.out.print(fact+ " ");
      }
  }
  if ( n!=1){
      System.out.print(n);
  }
 }
}
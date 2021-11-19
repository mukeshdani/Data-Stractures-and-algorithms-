//1. You are given a base b.
//2. You are given two numbers n1 and n2 of base b.
//3. You are required to subtract n1 from n2 and print the value.


import java.util.*;
  
  public class  AnyBaseSubtraction {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here

       int borrow = 0 ;
        int res = 0 ;
         int multiplier = 1 ;
          while ( n2>0){
              int d1 = n1%10;
              int d2 = n2%10;
               int temp = d2 -d1 + borrow ;

               if ( temp <0){
                   res+= (temp+b)*multiplier;
                   borrow = -1;
               }else{
                   res+= temp*multiplier;
                   borrow=0;
               }
               multiplier*=10;
               n1/=10;
               n2/=10;
          }
          return res ;
   }
  
  }

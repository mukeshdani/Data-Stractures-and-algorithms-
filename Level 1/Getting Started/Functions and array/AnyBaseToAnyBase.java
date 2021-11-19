//1. You are given a number n.
//2. You are given a base b1. n is a number on base b.
//3. You are given another base b2.
//4. You are required to convert the number n of base b1 to a number in base b2.


import java.util.*;
  
  public class  AnyBaseToAnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
       int dn = getValueIndecimal(n, sourceBase);
       int db = getValueInBase(dn , destBase);
      System.out.println(db);
   } 
public static int getValueIndecimal(int n, int b){
      // write your code here
      int res = 0 ;
      int multiplier = 1;
       while ( n>0){
           int divisor = n/10;
           int remainder  = n%10;
        
        n= divisor;

        res = res + remainder*multiplier;
        multiplier*=b;
       }
       return res;
   }

 public static int getValueInBase(int dn, int b){
       // write code here

       int res = 0 ;
        int multiplier = 1; 
        while ( dn>0){
            int divisor = dn/b;
            int remainder = dn%b;
            dn = divisor;
            res = res + remainder*multiplier;
            multiplier*=10;
        }
        return res ;
   }
     
  }
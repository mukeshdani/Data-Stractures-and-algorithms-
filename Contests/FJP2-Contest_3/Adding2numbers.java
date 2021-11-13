//Adding2numbers 
/*
1. You will be given 2 integer numbers and their base respectively.
2. You will also be given an number representing destination base.
3. You have to add those numbers and give the result of addition in destination base.
Input Format

1. A integer n1 and its base b1(integer).
2. A integer n2 and its base b2(integer).
3. Another integer D repersenting destination base.
Constraints

0<= n1,n2 <= 10000;
0<b1,b2,d <= 10
Output Format

An integer.
Sample Input 0

12345 6
3434 8
7
Sample Output 0

13513
*/

//Source Code

import java.io.*;
import java.util.*;

public class Adding2numbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scn = new Scanner (System.in );
        
        int nm1 = scn.nextInt();
        int b1 = scn.nextInt();
        int nm2 = scn.nextInt();
        int b2 = scn.nextInt();
        int D = scn.nextInt();
        
        int d1=getValueIndecimal(nm1,b1);
        int d2=getValueIndecimal(nm2,b2);
         
     int m1 = getValueInBase(d1,D);
     int m2 = getValueInBase(d2,D);
        
        int res1 = getSum(D,m1,m2);
        
        System.out.println(res1);
        
    }
    public static int getValueIndecimal(int n, int b){
     
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
    
    public static int getSum(int d, int n1, int n2){
       
       int carry = 0 ;
       int res = 0 ;
        int multiplier = 1; 
        while ( carry >0 || n1>0 || n2>0){
            int d1 = n1%10;
            int d2 = n2%10 ;
            int temp = carry + d1 + d2 ;

            int quet = temp / d;
            int rem = temp % d;
            

            res = res + (rem*multiplier) ;
            carry = quet;

            multiplier*=10;
            n1/=10;
            n2/=10;
        }
        return res;
   }
}
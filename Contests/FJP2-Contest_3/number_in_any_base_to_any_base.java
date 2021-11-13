

//number-in-any-base-to-any-base
/*
The number, its base and the required base of the output number is taken as input.

The base of number can be anything such that all digits can be represented using 0 to 9 and A to Z. Value of A is 10, value of B is 11 and so on.

For example,

INPUT : 

100001
2
10

OUTPUT : 

33
Input Format

A number follwed by base and required base
Constraints

number<=10^9
base<=16
required base<=16
Output Format

output
Sample Input 0

100001
2
10
Sample Output 0

33

*/

//Source Code

import java.io.*;
import java.util.*;

public class number_in_any_base_to_any_base{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scn = new Scanner(System.in);
      int n = Integer.parseInt(scn.nextLine());
      String s = scn.nextLine();
     String d= scn.nextLine();
        
        int store1=0;
        for(int i=0; i<s.length();i++){  
        char c = s.charAt(i);  
           int p = mukesh(c);
            store1 = store1*10 +p;
         }
        int store2=0;
        for(int i=0; i<d.length();i++){  
        char c = d.charAt(i);  
           int p = mukesh(c);
            store2 = store2*10 +p;
         }
        
       int dn = getValueIndecimal(n, store1);
       int db = getValueInBase(dn , store2);
      System.out.println(db);
   
    }
    
    public static int mukesh(char c)
{
    if (c >= '0' && c <= '9')
        return (int)c - '0';
    else
        return (int)c - 'A' + 10;
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
}
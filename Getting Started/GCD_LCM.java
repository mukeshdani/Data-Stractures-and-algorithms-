// find GCD and LCM of a given number

import java.util.*;
    
    public class GCD_LCM{
    
    public static void main(String[] args) {
      // write your code here 
     /* Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
       
      while( num1 % num2 !=0){
          int  r = num1 % num2 ;
          num1 = num2;
          num1 = r ;
      }
      System.out.println(num2);*/
      
      // Second Approch 
      
      /*Scanner scn = new Scanner (System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int least = 1;
      
      if ( a<b){
          int temp = b;
           b = a;
           a = temp;
      }
      
      // Gcd
      for ( int i = a ; i>=1 ; i--){
          if ( a%i==0 && b%i==0){
              System.out.println(i);
              break;
          }
      }
      
      //LCM
      int j=1;
      while ( j<=Integer.MAX_VALUE){
          if ( (a*j)%b==0 ){
              least = a*j;
              System.out.println(least);
              break;
          }
          j++;
      }*/
      
      
      //Third Approach 
      
      Scanner scn = new Scanner ( System.in);
      int a =scn.nextInt();
      int b =scn.nextInt();
      
      
      if (b>a){
          int temp = b ; 
          b = a;
          a = temp ;
          
      }
      //GCD
      int max = 0 ;
      
      for( int i =1 ; i<=a ; i++ ){
          if ( a%i==0 && b%i==0 && i>max){
              max = i;
          }
      }
      System.out.println(max);
      
      //LCM
      int lcm = (a*b)/max;
      System.out.println(lcm);
      
    }
    }
        


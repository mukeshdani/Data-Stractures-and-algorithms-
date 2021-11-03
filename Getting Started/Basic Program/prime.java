// Level 1 
//How to check prime number 
//learn how to use loop in java 

import java.util.*;
  
  public class prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
    int t =scn.nextInt();
     
     int lv_t=1;
     while(lv_t<=t){
         int n=scn.nextInt();
         int lv=2;
         while(lv<n){
             if ((n)%lv==0){
                 System.out.println("not prime");
                 break;
             }else {
                 lv=lv+1;
             }
         }
         if (lv==n || lv>n){
             System.out.println("prime");
         }
         lv_t=lv_t+1;
     }
   }
  }
import java.util.*;
   
   public class ReverseOFaNumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner (System.in);
     int n = scn.nextInt();
     
     while(n>0){
         int s=0;
         s= (n%10);
         System.out.println(s);
         n = n/10;
     }
     
    }
   }
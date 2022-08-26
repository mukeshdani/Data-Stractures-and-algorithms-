//Arrange Buildings
//https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/arrange-buildings-official/ojquestion


import java.io.*;
import java.util.*;

public class main{


public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
      long zero = 1;
        long one  = 1;
        for(int i = 2 ; i<= n ; i++){
            long nz = one ; 
            long no = (zero + one);
            
            one = no ;
            zero  = nz;
        }
        
        long tot = (one + zero);
        
        long ans = (tot*tot);
        
    System.out.println(ans);
 }

}
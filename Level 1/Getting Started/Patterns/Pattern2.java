  //1. You are given a number n.
  // 2. You've to create a pattern of * and separated by tab as shown in output format.
  //*	*	*	*	*	
  //*	*	*	*	
  //*	*	*	
  //*	*	
  //*

import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // write ur code here
      for (int i = 1; i<=n;i++ ){
          for ( int j=1; j<=n-(i-1);j++){
              System.out.print("*\t");
          }
          System.out.println();
      }

    }
}
//Modular Fast Exponentiation

//mod 10^9+7
//isse hamme aapne answer ko mod lena hoga 
// long-->range 10^18
//int --->  10^9
// Integer overflow se bachna ka lia hame iise number se mod lena hota hai 
//
//mod 10^9+7 ye number --->prime number hota hai 
// isse result hame always spacious result (Unique) milte hai 

/* ----------Two Method -------- */


//Method-->1
// Finally jb return kr rke honge us result ko mod kr lenge 

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static long xpown(long x, long n) {
		if ( n==0 )return x;
		
		long xpownby2 = xpown(x,n/2);
		
		if ( n%2 == 0) return xpownby2*xpownby2;
		else return xpownby2*xpownby2*x;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
			int x = scn.nextInt();
			int n = scn.nextInt();

            long ans = xpown(x,n);
			System.out.println(ans*1000000007);
		}
}



/* ---------------------------------- */

// Method 2-->

/*1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n mod 10^9 + 7 in logn complexity.
Input Format
The first line contains the integer x and n.
Output Format
Output an integer in a line containing x^n mod 10^9+7.*/
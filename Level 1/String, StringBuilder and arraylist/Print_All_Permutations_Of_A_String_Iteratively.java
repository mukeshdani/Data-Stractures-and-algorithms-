

/* --------------------------- */

import java.util.*;

public class Print_All_Permutations_Of_A_String_Iteratively{

	public static void solution(String str){
		int n = factorial(str.length());
		for(int i = 0 ; i  < n; i++){
			StringBuilder s = new StringBuilder(str);
			int dvd = i;
			for(int div = str.length(); div >= 1; div--){
				int q = dvd / div; 
				int r = dvd % div;
				System.out.print(s.charAt(r));
				dvd = q;
				s.deleteCharAt(r);
			}
			System.out.println();
		}
	}

	public static int factorial(int n){
		int ans = 1;
		for(int i = 2; i <= n; i++){
			ans *= i;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();
	}

}


                        


                        


                        
// String Interning 
// difference between == and equals()
// Imutability 


import java.util.*;

public class StringInterning{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    String str = "pepcoder";
        String str2 = new String("hello");
		String str3 ="hello";
        String str4 = new String ("hello");
        String str5 = "hello";
        

        System.out.println(str2==str3);
        System.out.println(str3==str5);
        System.out.println(str2==str4);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str5));
        System.out.println(str2.equals(str4));
        System.out.println(str==str2);
           System.out.println(str.equals(str2));
          scn.close();
	}

}
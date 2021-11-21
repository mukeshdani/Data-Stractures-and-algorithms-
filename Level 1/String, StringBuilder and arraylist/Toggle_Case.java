
// Toggle Case

// Source Code


import java.util.*;

public class Toggle_Case{

    public static String toggleCase(String s){
        String res = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                res = res + (char)(ch + 32);
            }else{
                res = res + (char)(ch - 32);
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
        sc.close();
    }
}





/*

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Constraints

1 

Format

Input

A String

Output

A String

Example

Sample Input

pepCODinG

Sample Output

PEPcodINg
*/
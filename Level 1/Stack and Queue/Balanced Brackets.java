
//https://nados.io/question/duplicate-brackets
//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if ( ch == '('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                
                if (stack.isEmpty()) return false ;
                
                char pk = stack.peek();
                if ( (ch ==')'&&pk=='(')|| (ch ==']' && pk =='[')|| (ch == '}'&&pk=='{')){
                    stack.pop();
                }else {
                    return false ;
                }
            }
                   
        }
         return stack.isEmpty();
        
     
}
    
}

/* //NDOSA
import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    String s = scn.nextLine();

      System.out.println(isValid(s));
    }

   public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
           if((ch >='a'&& ch <='z')|| (ch == ' ')||(ch>='0'&&ch<='9') || (ch=='+')||(ch=='-')||(ch=='/')||(ch=='*')){
              continue;
            }
            else if ( ch == '('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                
                if (stack.isEmpty()) return false ;  
                char ns = stack.peek();
                if ( (ch ==')'&&ns=='(')|| (ch ==']' && ns =='[')|| (ch == '}'&&ns=='{')){
                    stack.pop();
                }else {
                    return false ;
                }
            }
                   
        }
         return stack.isEmpty();    
     
}

} */
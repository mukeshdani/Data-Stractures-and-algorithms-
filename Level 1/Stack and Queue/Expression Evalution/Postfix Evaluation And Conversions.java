//Postfix Evaluation And Conversions
//https://nados.io/question/postfix-evaluation-and-conversions

import java.io.*;
import java.util.*;

public class Main{
  public static int precedence(char op){
    if(op == '+' || op == '-') return 1;
    if(op == '/' || op == '*') return 2;
    return 0;
}

public static int operation(int val1, int val2,char op){
    if(op == '+')
        return val1 + val2;
    
    if(op == '-')
        return val1 - val2;
        
    if(op == '/')
        return val1 / val2;
        
    return val1 * val2;
}


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
       

       Stack<Integer> vstack = new Stack<>();
       Stack<String> infix = new Stack<>();
       Stack<String> prefix = new Stack<>();

       for(int i = 0 ; i < exp.length() ;i++){
           char ch = exp.charAt(i);

           if(ch == '-' || ch == '+' || ch == '*' || ch == '/'){
               int v2 = vstack.pop();
               int v1 = vstack.pop();
               int val = operation(v1 , v2 , ch);
               vstack.push(val);
                 String inv2 = infix.pop();
                 String inv1 = infix.pop();
                 String inv = "(" + inv1 + ch + inv2 + ")";
                 infix.push(inv);
                  String prev2 = prefix.pop();
                 String prev1 = prefix.pop();
                 String prev = ch + prev1 + prev2 ;
                 prefix.push(prev);
           }else {
               vstack.push(ch - '0');
               infix.push(ch + "");
               prefix.push(ch + "");
           }
           
           }

           System.out.println(vstack.pop());
            System.out.println(infix.pop());
             System.out.println(prefix.pop());
    
 }
}
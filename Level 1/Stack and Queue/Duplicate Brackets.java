//Duplicate Brackets
//https://nados.io/question/duplicate-brackets

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
         String str = scn.nextLine();
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i< str.length(); i++){
       char ch = str.charAt(i);
       if(ch ==')'){
           if(stk.peek()=='('){
           System.out.println("true");
           return;
           }

           while(stk.peek()!='('){
               stk.pop();
           }
           stk.pop();
       }else {
           stk.push(ch);
       }
        }

        System.out.println("false");

    }

}
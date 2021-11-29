

// 3 Different solution for riversing a String 

package string;

import java.util.Stack;

class StringLib {
  // first method traverse till end and print in  reverse in this method we have to create a new string 
  // not inplace Method 
  public String reverseStringAnother(String str) {
    String s = "";
    
    for(int i = 0; i < str.length(); i++) {
      s = str.charAt(i) + s;
    }
    
    return s;
  }

  // Inplace Method
  // Second method using swap mathod 
  public void printReverseString(String s) {
    
    int start = 0;
    int end = s.length() - 1;
    
    char[] ch = s.toCharArray();
    
    while(start < end) {
      char c = ch[start];
      ch[start] = ch[end];
      ch[end] = c;
      
      start++;
      end--;
    }
    
    for(int i = 0; i < s.length(); i++) {
      System.out.print(ch[i] + "");
    }
  }
  
  public String reverseString(String s) {
    
    int start = 0;
    int end = s.length() - 1;
    
    char[] ch = s.toCharArray();
    
    while(start < end) {
      char c = ch[start];
      ch[start] = ch[end];
      ch[end] = c;
      
      start++;
      end--;
    }
      // usiing inbuild method String.copyValueOf() this will convert charater array into the String   
    return String.copyValueOf(ch);
  }
  

  // Third Solution 
  // Using Stack Push and pop method
  public void reverseStack(String str) {
    Stack<Character> st = new Stack<>();
    
    for(int i = 0; i < str.length(); i++) {
      st.push(str.charAt(i));
    }
    
    while(!st.isEmpty()) {
      System.out.print(st.pop());
    }
  }
  
}

public class StringApp {

  public static void main(String[] args) {
    StringLib obj = new StringLib();
    
    String str = "coding";
    StringBuilder sb = new StringBuilder(str);
    
    sb = sb.reverse();
    System.out.println(sb);
    
    obj.printReverseString(str);
    System.out.println();
    
    System.out.println(obj.reverseString(str));
    
    obj.reverseStack(str);
  }
}


//Reverse individual words in given String

package string;

import java.util.Stack;

class StringLib {

  public String reverseIndividualWord(String str) {
    
    String finalStr = "";
    String tempStr = "";
    
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      
      if(c == ' ') {
        finalStr = finalStr + tempStr + " ";
        tempStr = "";
      } else {
        tempStr = c + tempStr;
      }
    }
    
    finalStr = finalStr + tempStr;
    
    return finalStr;
  }
  
  public String reverseIndividualWordStringBuilder(String str) {
    
    StringBuilder finalStr = new StringBuilder();
    StringBuilder tempStr = new StringBuilder();
    
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      
      if(c == ' ') {
        finalStr = finalStr.append(tempStr).append(" ");
        tempStr.setLength(0);
      } else {
        tempStr.insert(0, c);
      }
    }
    
    finalStr = finalStr.append(tempStr);
    
    return finalStr.toString();
  }
  
  public void reverseIndividualWordStack(String str) {

    Stack<Character> st = new Stack<>();
    
    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      
      if(c == ' ') {
        while(!st.isEmpty()) {
          System.out.print(st.pop());
        }
        System.out.print(" ");
      } else {
        st.push(c);
      }
    }
    
    while(!st.isEmpty()) {
      System.out.print(st.pop());
    }
  }
}

public class StringApp {

  public static void main(String[] args) {
    StringLib obj = new StringLib();

    String str = "coding simplified nice";

    System.out.println(obj.reverseIndividualWord(str));
    System.out.println(obj.reverseIndividualWordStringBuilder(str));
    
    obj.reverseIndividualWordStack(str);
    
  }
}
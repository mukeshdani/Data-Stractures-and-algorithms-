//Normal Stack
//https://nados.io/question/normal-stack

// Normal Static with Array 
import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] arr;
    int top;

    public CustomStack(int cap) {
      arr = new int[cap];
      top = -1;
    }

    int size() {
      // Time ->O(1)
      return top + 1;
       
    }

    void display() {
      // Time ->O(N)
      for ( int i = top ; i>=0 ; i--){
        System.out.print(arr[i]+ " ");
      }
      System.out.println();
    }

    void push(int val) {
      // write ur code here

      if ( top == arr.length - 1){
        //Stack Overflow 
        System.out.println("Stack overflow");
        return;
      }

      top++;
      arr[top] = val ;
    }

    int pop() {
      // Time --> O(1)
      if ( top == -1 ){
        System.out.println("Stack underflow");
        return-1;
      }
      int val = arr[top];
      top--;
      return val;
      
    }

    int top() {
      
       // Time --> O(1)
// under flow
      if ( top == -1 ){
        System.out.println("Stack underflow");
        return-1;
      }
      int val = arr[top];
      return val;
      
    }
  
}
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}
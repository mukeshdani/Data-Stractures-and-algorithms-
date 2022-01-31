//Queue To Stack Adapter - Push Efficient
//Nados
//https://nados.io/question/queue-to-stack-adapter-push-efficient
//LeedCode
//https://leetcode.com/problems/implement-stack-using-queues/
//LeedCode Solution 
class MyStack {
    Queue<Integer> q ;
        
        public MyStack() {
            q = new ArrayDeque<>();
        }
        
        public void push(int x) {
            q.add(x);    
        }
        
        public int pop() {
            if ( q.size() == 0){
                return -1;
            }
            
            int val = 0 ;
            for ( int i = 0 ; i<q.size(); i++){
                val = q.remove();
                if(i<q.size())
                    q.add(val);
            }
            return val;
        }
        
        public int top() {
             if ( q.size() == 0){
                return -1;
            }
            
            int val = 0 ;
            for ( int i = 0 ; i<q.size(); i++){
                val = q.remove();
                
                    q.add(val);
            }
            return val;
        }
        
        public boolean empty() {
            return q.isEmpty();
        }
    }
    
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */

// Using one stack 
/* 
import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> q;
    
    public QueueToStackAdapter() {
      q = new ArrayDeque<>();
     
    }

    int size() {
      // write your code here
      return q.size();
    }

    void push(int val) {
      // write your code here
      q.add(val);
    }

    int pop() {
      // write your code here
      if(size()==0){
        System.out.println("stack underflow");
        return-1;
      }

      int val = 0 ;
      for ( int i = 0 ; i<size(); i++){
        val = q.remove();
        if ( i<size())q.add(val);
      }
      return val;
    }

    int top() {
      // write your code here
      if(size()==0){
        System.out.println("stack underflow");
        return-1;
      }

      int val = 0 ;
      for ( int i = 0 ; i<size(); i++){
        val = q.remove();
       q.add(val);
      }
      return val;
      
    }
  }  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}
 */
// /Reverse Stack Using Recursion
//https://www.codingninjas.com/codestudio/problems/reverse-stack-using-recursion_631875?leftPanelTab=0
import java.util.Stack;

public class Solution {
    public static void insertAtBottom(Stack<Integer> stack , int bottom){
        if(stack.isEmpty()){
            stack.push(bottom);
            return ;
        }
        int val = stack.pop();
        insertAtBottom(stack, bottom);
        stack.push(val);
    }
	public static void reverseStack(Stack<Integer> stack) {
		if ( stack.isEmpty()){
            return ;
        }
        
        int val = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, val);
	}

}


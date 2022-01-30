//Sort a Stack
//https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275


import java.util.*;
public class Solution {
    public static void InsertAtSorted( Stack<Integer> stack , int val){
        if(stack.isEmpty() || stack.peek()<=val){
            stack.push(val);
            return ;
        }
        int top = stack.pop();
        InsertAtSorted(stack , val);
        stack.push(top);
    }
	public static void sortStack(Stack<Integer> stack) {
        
        if ( stack.isEmpty()){
            return ;
        }
        int top =stack.pop();
        sortStack(stack);
        InsertAtSorted(stack , top);
	}
}
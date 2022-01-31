//Valid Parentheses
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


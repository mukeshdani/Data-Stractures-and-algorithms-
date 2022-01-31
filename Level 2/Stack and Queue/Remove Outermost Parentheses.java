//Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/

// With extraSpace 

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                stk.push(i);
            } else {
                int j = stk.pop();
                if(stk.empty())
                    res.append(s.substring(j + 1, i));
            }
        }
        
        return res.toString();
    }
}


// with out extra space 

class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder res = new StringBuilder("");
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                if(open > 0) res.append(ch);
                open++;
            } else {
                open--;
                if(open > 0) res.append(ch);
            }
        }
        
        return res.toString();
    }
}
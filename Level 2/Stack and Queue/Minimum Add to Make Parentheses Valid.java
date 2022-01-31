//Minimum Add to Make Parentheses Valid
//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

class Solution {
    public int minAddToMakeValid(String str) {
        
        int obr = 0; // opening brackets
        int cbr = 0; // closing brackets
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch==')'){
                if(cbr==0)
                    obr++;
                else
                    cbr--;
            }else if(ch=='('){
                cbr++;
            }
    
        }
        
        return obr+cbr;
    }
}
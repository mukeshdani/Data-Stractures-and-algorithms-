////Minimum Number of Swaps to Make the String Balanced

class Solution {
    public int minSwaps(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0 ;
         for( int i = 0 ; i< s.length() ; i++){
             char ch = s.charAt(i);
             
             if(ch == '['){
                 stk.push(ch);
             }else {
                 if(stk.isEmpty()== false &&  ch == ']'){
                     stk.pop();
                 }else {
                     count++;
                 }
             }
         }
        return (count+1)/2;
        
    }
}
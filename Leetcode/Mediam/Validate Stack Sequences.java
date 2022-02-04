//Validate Stack Sequences
//https://leetcode.com/problems/validate-stack-sequences/
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
          int j = 0 ;
        for(int i=0 ; i< pushed.length ; i++){
            stk.push(pushed[i]);
            while(stk.size()>0 && stk.peek()==popped[j]){
               j++;
                stk.pop();   
            }
        }
        return stk.size()==0;
    }
}

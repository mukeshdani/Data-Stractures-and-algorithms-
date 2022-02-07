//Remove K Digits
//https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
      Deque<Character> q = new ArrayDeque<>() ;
        
        for(int i = 0 ; i< num.length(); i++){
            char ch = num.charAt(i);
            
            while(q.size() >0 && k > 0 && q.getLast()>ch){
                q.removeLast();
                k--;
            }
            q.addLast(ch);
        }
        while(q.size()>0 && k>0){
            q.removeLast();
            k--;
        }
        
        //remove leading 0's
        while(q.size()>0 && q.getFirst()=='0'){
            q.removeFirst();
        }
        
        if(q.size()==0 )return "0";
        StringBuilder str = new StringBuilder("");
        while(q.size() > 0 ){
            str.append(q.removeFirst());
        }
        
        return str.toString();
    }
}

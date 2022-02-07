//Find the Difference
//https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> hm = new HashMap<>();
        
        for( int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch,0)+1);
        }
        for(int j = 0 ; j<t.length() ; j++){
            char ch = t.charAt(j);
            
            if(hm.containsKey(ch) &&hm.get(ch)>0){
                hm.put(ch,hm.get(ch)-1);
            }else {
                return ch ;
            }
        }
        return ' ';
    }
}


// Using BitM
class Solution {
    public char findTheDifference(String s, String t) {
         char bit = 0;

        for (int i = 0; i < s.length(); ++i) {
            bit ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); ++i) {
            bit ^= t.charAt(i);
        }

        return bit;
    }
}
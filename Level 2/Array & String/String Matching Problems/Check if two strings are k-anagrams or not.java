//Check if two strings are k-anagrams or not
//https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1

class Solution {
    boolean areKAnagrams(String s, String t, int k) {
        // code here
        if(s.length() != t.length())return false;
         int[] freq = new int[26];
        if(s.length() != t.length())return false;
        for(int i = 0 ; i< s.length() ; i++){
            freq[s.charAt(i) -'a']++;
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            freq[t.charAt(i) -'a']--;
        }
        
        int swap = 0;
        
        for(int i = 0 ; i< 26 ; i++){
            if(freq[i] > 0) swap += freq[i];
        }
        
        if(swap<=k)return true;
        return false;
    }
}
//Remove Duplicate Letters
//https://leetcode.com/problems/remove-duplicate-letters/
//https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/submissions/
//---------------------
// Using Deque 

class Solution {
    public String removeDuplicateLetters(String s) {
        Deque<Character> q = new ArrayDeque<>();

        int[] freq = new int[26];
        boolean[] inQ = new boolean[26];

        for(int i=0; i<s.length(); i++) 
            freq[s.charAt(i) - 'a']++;

        for(int i=0; i<s.length(); i++) 
        {
            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if(inQ[ch - 'a'] == true) 
                continue;

            while(q.size() > 0 && q.getLast() > ch && freq[q.getLast() - 'a'] > 0){
                inQ[q.removeLast() - 'a'] = false;
            }

            q.addLast(ch);
            inQ[ch - 'a'] = true;
        }

        StringBuilder str = new StringBuilder("");
        while(q.size() > 0){
            str.append(q.removeFirst());
        }
        return str.toString();
    }
}

//-----------------------------------------------
class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[] = new int[26];
        int vis[] = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']--;
            
            if(vis[s.charAt(i) - 'a'] == 0) {
                while(sb.length() != 0 && (sb.charAt(sb.length() - 1) > s.charAt(i)) && 
                      freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {

                    vis[sb.charAt(sb.length() - 1) - 'a'] = 0;
                    sb.deleteCharAt(sb.length() - 1);
                }

                sb.append(s.charAt(i));
                vis[s.charAt(i) - 'a'] = 1;
            }
        }
        
        return sb.toString();
    }
}


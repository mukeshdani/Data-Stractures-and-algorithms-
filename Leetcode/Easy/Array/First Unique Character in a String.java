//First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int [] store = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            //System.out.println(store[s.charAt(i) - 'a']++);
        }
        for (int i = 0; i < s.length(); i++) {
            if (store[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
}
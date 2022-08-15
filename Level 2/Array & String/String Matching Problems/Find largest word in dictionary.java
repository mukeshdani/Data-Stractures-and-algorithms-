//Find largest word in dictionary
//https://practice.geeksforgeeks.org/problems/find-largest-word-in-dictionary2430/1



class Solution {
    public static boolean isSubsequence(String s, String t) {
       int i = 0 , j = 0 ;
       while(i<s.length() && j<t.length()){
           if(s.charAt(i) == t.charAt(j)){
               i++;
               j++;
           }else{
               j++;
           }
       }
       if(i==s.length()){
           return true;
       }
       return false;
   }
   static String findLongestWord(String str, List<String> d) {
       String ans ="";
    for(String word : d){
        if(isSubsequence(word , str) == true){
            if(word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans)<0)){
                ans = word;
            }
        }
    }
    return ans;
   }
}
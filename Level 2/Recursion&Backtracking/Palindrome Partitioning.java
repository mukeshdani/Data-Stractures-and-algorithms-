//Palindrome Partitioning
//https://leetcode.com/problems/palindrome-partitioning/


import java.util.*;
class Solution {
    public boolean isPalindrom(String s ,int left  , int right ){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++ ;
            right --;
        }
        return true;
    }
    public void partition(List<List<String>> ans , List<String> curr , String s , int idx){
        if(idx == s.length()){
            ans.add(new ArrayList(curr));
            return;
        }
        
        for(int i = idx ; i < s.length(); i++){
            if(isPalindrom(s , idx, i)==true){
                curr.add(s.substring(idx , i+1));
                partition(ans , curr , s , i + 1);
                curr.remove(curr.size() - 1);
            }
        }
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        partition(ans , curr, s , 0);
        return ans;
    }
}
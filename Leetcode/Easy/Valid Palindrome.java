//Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if (!Character.isLetterOrDigit(cl)) left++;
            else if (!Character.isLetterOrDigit(cr)) right--;
            else if (Character.toLowerCase(cl) != Character.toLowerCase(cr)) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
        
        
    }
}


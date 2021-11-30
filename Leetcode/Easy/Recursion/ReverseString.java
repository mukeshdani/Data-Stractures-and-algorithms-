public class ReverseString {
    
}

//Reverse String

class Solution {
    public void reverse1(char[] s, int left, int right)
     {
     
         if(left >= right) return;
         char c = s[left];
         s[left] = s[right];
         s[right] = c;
         
         reverse1(s, left + 1, right -1);
         
         
     }
     
     public void reverseString(char[] s) {
         int left = 0;
         int right = s.length -1;
         reverse1(s, left, right);
     }
     }
 
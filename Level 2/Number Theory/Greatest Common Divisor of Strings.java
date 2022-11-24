//Greatest Common Divisor of Strings
//https://leetcode.com/problems/greatest-common-divisor-of-strings/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
          int gcd = findGcd(str1.length(), str2.length());
          return str2.substring(0, gcd);
    }
  
    private int findGcd(int x, int y){
      return x == 0 ? y : findGcd(y%x, x);
    }
    
}
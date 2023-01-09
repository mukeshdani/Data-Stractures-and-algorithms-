//Decode String
//https://leetcode.com/problems/decode-string/

class Solution {
    int idx=0;
    
public String decodeString(String s) {
 StringBuffer result = new StringBuffer(); 
 while(idx<s.length() && s.charAt(idx)!=']')
 {
    if(Character.isDigit(s.charAt(idx)))
     {
        int count=0;
        while(idx<s.length() && Character.isDigit(s.charAt(idx)))
        {
            count=count*10+s.charAt(idx++)-'0';
        }
        idx++;
        String r = decodeString(s);
        while(count-->0)
        {
            result.append(r);
        }
        idx++;
     }
     else
     {
         result.append(s.charAt(idx++));
     }           
 }
 return result.toString();

}
}

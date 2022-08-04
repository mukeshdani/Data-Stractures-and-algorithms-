//Digit multiplier
//https://practice.geeksforgeeks.org/problems/digit-multiplier3000/1

class Solution {
    static String getSmallest(Long n) {
        // code here
       int i, j=0;
        int MAX = 50;

        int[] res = new int[MAX];
  
        StringBuilder ans = new StringBuilder("");
        if (n < 10)
        {
            return "" + n ;
        }
  
      
        for (i=9; i>1; i--)
        {
            while (n%i == 0)
            {
                n = n/i;
                res[j] = i;
                j++;
            }
        }
  
      
        if (n > 10)
        {
           return "-1";
        }
  
        for (i=j-1; i>=0; i--)
              ans.append(res[i]);
           
        return ans.toString();
    }
};
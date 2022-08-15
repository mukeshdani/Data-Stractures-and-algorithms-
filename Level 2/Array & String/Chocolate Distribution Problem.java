//Chocolate Distribution Problem

//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.*;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        int ans = Integer.MAX_VALUE;
        
        for(int e = m - 1; e < a.size() ; e++){
            int s = e  - m  + 1;
            
            int diff = a.get(e) - a.get(s);
            ans = Math.min(ans , diff);
            
        }
        
        return ans;
    }
}
//Cutting Rectangles
//https://practice.geeksforgeeks.org/problems/cutting-rectangles3659/1

import java.util.*;

class Solution{
    static long gcd(long a , long b){
        if(b==0)return a;
        return gcd(b , a%b);
    }
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        long side = gcd(L , B);
        
        long square = (L*B)/(side * side);
        List<Long> res = new ArrayList<>();
        res.add(square);
        res.add(side);
        
        return res; 
    }
}
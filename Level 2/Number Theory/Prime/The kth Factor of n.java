//The kth Factor of n
//https://leetcode.com/problems/the-kth-factor-of-n/
//
package Prime;

import java.util.*;
class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for(int factor = 1 ; factor * factor <= n ; factor ++){
            if(n % factor == 0){
                res.add(factor);
                if(factor != n / factor)right.add(n/factor);
                    
            }
        }
        
        Collections.reverse(right);
        res.addAll(right);
        
        if(k > res.size()){
            return -1;
        }
        return res.get(k-1);
    }
}


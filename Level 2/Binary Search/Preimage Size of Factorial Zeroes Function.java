//Preimage Size of Factorial Zeroes Function
//https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/


//Time - 0(logN)
//Space - 0(1)

class Solution {
    public int preimageSizeFZF(int k) {
        long low = 0;
        long high = Long.MAX_VALUE;
        
        while(low <= high){
            long mid = (low+high)/2;
            if(k == check(mid))
                return 5;
            else if(k < check(mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return 0;
    }
    public long check(long k){
        long sum = 0;
        long x = 5;
        while(x <= k){
            sum += k/x;
            x = x*5;
        }
        
        return sum;
    }
}
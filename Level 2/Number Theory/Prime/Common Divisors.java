// /Common Divisors
//https://practice.geeksforgeeks.org/problems/common-divisors4712/1



class Solution {
    static long gcd(long a , long b){
        if(b==0)return a;
        return gcd(b , a%b);
    }
    static long getFactor(long n){
        long factor = 0 ;
        for(long f = 1l ; f*f<=n ; f++){
            if(n%f == 0){
                factor ++;
                if(f!= n/f){
                    factor++;
                }
            }
        }
        return factor;
    }
    static long commDiv(long a, long b){
        // code here
        return getFactor(gcd(a, b));
    }
}
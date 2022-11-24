//LCM And GCD

//https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

class Solution {
    static long GCD(Long A , Long B){
        if(B==0)return A;
        return GCD(B , A%B);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = GCD(A, B);
        long lcm = (A*B)/gcd;
        return new Long[]{lcm , gcd};
    }
}

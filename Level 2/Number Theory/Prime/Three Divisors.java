//Three Divisors
//https://leetcode.com/problems/three-divisors/

package Prime;
class Solution {
    public boolean isPerfect(int n ){
        int sqrt = (int)Math.sqrt(n);
        return (sqrt*sqrt == n);
    }
    public boolean isPrime(int n){
        if(n == 0 || n==1)return false;
        
        for(int factor  = 2 ; factor * factor <= n ; factor++){
            if(n%factor == 0 )return false;
        }
        return true;
    }
    public boolean isThree(int n) {
        //Numer shoud be perfect square (odd divisior)
        // if it is square of prime , then odd divisors = exactly three
        if(isPerfect(n) == false)return false;
        
        int sqrt = (int)Math.sqrt(n);
        return isPrime(sqrt);
    }
}
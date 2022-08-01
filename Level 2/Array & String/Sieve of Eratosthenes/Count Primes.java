//Count Primes
//https://leetcode.com/problems/count-primes/


import java.util.*;
class Solution {
    public int countPrimes(int n) {
        if(n<2)return 0;
        boolean [] isPrime = new boolean[n+1];
        Arrays.fill(isPrime , true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i*i<=n ; i++){
            if(isPrime[i] == true){
                for(int j  = i + i ; j < isPrime.length ; j+=i){
                    isPrime[j] = false ;
                }
            }
        }
        
        int count = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(isPrime[i] == true){
                count++;
            }
        }
        
        return count;
    }
}
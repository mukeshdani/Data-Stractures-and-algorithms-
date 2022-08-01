//Sieve of Eratosthenes

import java.util.*;

class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean [] isPrime = new boolean[N+1];
        Arrays.fill(isPrime , true);
        
        for(int i = 2 ; i*i <= isPrime.length ; i++){
            if(isPrime[i] == true){
                for(int j = i+i ; j<isPrime.length ; j+=i){
                    isPrime[j] = false ; //Not prime 
                }
            }
        }
        
        for(int i = 2; i<=N ; i++){
            if(isPrime[i] == true){
                ans.add(i);
            }
        }
        
        return ans;
    }
}
//Prime Number
//https://practice.geeksforgeeks.org/problems/prime-number2314/1
package Prime;

class Solution{
    static int isPrime(int N){
        // code here
        if(N <= 1)return 0;
        int count =0 ;
        for(int i = 2 ; i * i <= N ; i ++){
            if((N % i) == 0){
                return 0 ;
            }
        }
        return 1;
    }
}
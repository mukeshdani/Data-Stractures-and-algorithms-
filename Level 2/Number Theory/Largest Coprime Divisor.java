//Largest Coprime Divisor
//https://www.interviewbit.com/problems/largest-coprime-divisor/

 class Solution {
    public int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b , a%b);
    }
    public int cpFact(int A, int B) {
       if(gcd(A,B)== 1) return A;
       return cpFact(A/gcd(A,B),B);
    }
}


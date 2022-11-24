//Required Rooms

//https://practice.geeksforgeeks.org/problems/required-rooms3939/1


class Solution{
    static int GCD(int a , int b){
        if(b==0)return a;
        return GCD(b , a%b);
    }
    static int rooms(int N, int M){
        // code here
        int gcd = GCD(N , M);
        int a = N/gcd;
        int b = M/gcd;
        return a + b;
    }
}

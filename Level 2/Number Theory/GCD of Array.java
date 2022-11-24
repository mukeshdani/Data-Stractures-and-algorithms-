//GCD of Array
//https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1

class Solution
{
    public int GCD(int a , int b){
        if(b==0)return a;
        return GCD(b , a%b);
    }
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       int gcd = arr[0];
       for(int idx= 1 ; idx < arr.length ; idx++){
           gcd = GCD(gcd , arr[idx]);
       }
       return gcd;
    } 
}
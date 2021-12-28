// Pow(x,n)
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

//Important question IB

class Solution {
    
    public double power(double x , int n ){
        // base condition 
        if ( n==0 )return 1.0;
        
        //Faith
        double temp = power(x,n/2);
        
        // meeting Expectation 
        // Even 
        if ( n % 2 == 0){
            return temp*temp; 
        }
        // odd 
        else {
            return temp*temp*x;
        }
    }
    public double myPow(double x, int n) {
       // for negative value 
        if ( n < 0){
           double temp = power(x,-n);
           return 1.0/temp;
       }
        return power (x,n);
    }
}
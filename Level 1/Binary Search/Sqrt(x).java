

//Sqrt(x)


class Solution {
    public int mySqrt(int x) {
        long left =1l,right = x;
        
        long floorSqurt=1l;
        if ( x==0)return 0;
        
        while ( left <=right){
            long mid = left + (right-left)/2l;
            long square = mid*mid;
            
            if ( square==x){
                return (int)mid;
            }else if (square <x){
                floorSqurt=mid;
                left = mid+1;
            }else {
                right = mid -1;
            }
        }return (int)floorSqurt;
    }
}

/*Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1*/

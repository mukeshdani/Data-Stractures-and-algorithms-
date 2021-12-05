
//Valid Perfect Square
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        
        long left = 1L, right = x;
        long floorSqrt = 1L;
        while(left <= right){
            long mid = left + (right - left) / 2L;
            long square = mid * mid;
            
            if(square == x){
                return (int)mid;
            } else if(square < x){
                floorSqrt = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int)floorSqrt;
    }
    
    public boolean isPerfectSquare(int num) {
        int floorSqrt = mySqrt(num);
        if(floorSqrt * floorSqrt == num) return true;
        return false;
    }
}
/*Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false*/
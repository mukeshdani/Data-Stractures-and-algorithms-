
//Power of Three
class Solution {
    public boolean isPowerOfThree(int n) {
        
         return (Math.log10(n) / Math.log10(3)) % 1 == 0;  
		// Formula to check number is generalise as power of 4.
    }
}






/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Example 2:

Input: n = 0
Output: false
*/
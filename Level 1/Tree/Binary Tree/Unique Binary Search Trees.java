//Unique Binary Search Trees
//https://leetcode.com/problems/unique-binary-search-trees/

class Solution {
    public int numTrees(int n) {
     return (int)(comb(2*n, n)/(n+1));
 }
 public double comb( int n, int k ) {
     double res = 1;
     if ( k > n-k ) {
         k = n - k;
     }
     for ( int i=0; i<k; i++ ) {
         res *= (n - i);
         res /= (i + 1);
     }
     return res;
 }
 }
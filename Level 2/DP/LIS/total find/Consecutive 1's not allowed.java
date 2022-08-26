//Consecutive 1's not allowed
//https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1



class Solution {
    long countStrings(int n) {
      
      int zero = 1; 
      int one = 1;
      
      for(int i = 2 ; i<=n ; i++){
          int nzero = one; 
          int none = (zero + one)%1000000007;
          one = none;
          zero = nzero;
      }
      
     return (one + zero)%1000000007;  
        
    }
}
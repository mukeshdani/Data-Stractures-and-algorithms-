//First negative integer in every window of size k

//https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1



class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
     long[] ans = new long[N-K+1];
     int j = 0 ;
     for(int i = 0 ; i<=N -K ; i++){
         if(j<i){
             j = i;
         }
         
         while(j<i+K-1 && A[j] >= 0){
             j++;
         }
         
         if(A[j] < 0){
             ans[i] = A[j];
         }
     }
     
     return ans;
    }
}
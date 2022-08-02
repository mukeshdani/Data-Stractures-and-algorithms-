//Balance Array
//https://www.interviewbit.com/problems/balance-array/


class main {
    public int solve(int[] A) {
        int even = 0;
        int odd = 0;
        
        for(int i = 0 ; i<A.length ; i++){
            if(i % 2 == 0){
                even += A[i];
            }else {
                odd += A[i];
            }
        }
        
        int le = 0 ;
        int lo = 0;
        int ans = 0 ;
        
        for(int i = 0 ; i<A.length ; i++){
            if(i%2 == 0){
                int res = even - le - A[i];
                int ros = odd - lo;
                
                if(lo + res == le + ros){
                    ans++;
                }
                le += A[i];
            }else {
                int res =even - le;
                int ros = odd - lo - A[i];
                
                if(lo + res == le + ros){
                    ans++;
                }
                lo += A[i];  
            }
           }
          return ans;  
    }
}



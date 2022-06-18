//nCr
//https://practice.geeksforgeeks.org/problems/ncr1019/1

/* 
class Solution{
    static int nCr(int rows, int col)
    {
        // code here
        if(col>rows) return 0;
        if(rows == 0|| rows == col || col == 0 ) return 1;
        
        List<Integer> prev = new ArrayList<>();
        
        prev.add(1);
        
        for(int n = 1 ; n<=rows ; n++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            
            for(int k = 1 ; k<n ; k++){
                int nCk = (prev.get(k-1) + prev.get(k)) % 1000000007;
                curr.add(nCk);
            }
            
            curr.add(1);
            prev = curr;
        }
        
        return prev.get(col);
    }
} */
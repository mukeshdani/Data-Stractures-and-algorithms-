//Pascal's Triangle II
//https://leetcode.com/problems/pascals-triangle-ii/


/* class Solution {
    public List<Integer> getRow(int rows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        
        pascal.get(0).add(1);
        
        for(int n = 1 ; n<=rows ; n++){
          List<Integer> row = new ArrayList<>();
            
            row.add(1);//nC0
            
            for(int k = 1 ; k<n ; k++){
                int nCk = pascal.get(n-1).get(k) + pascal.get(n-1).get(k-1);
                row.add(nCk);
            }
            
            row.add(1);//nCn
            pascal.add(row);
        }
        
        return pascal.get(rows);
    }
} */



// Space Optimized 


/* class Solution {
    public List<Integer> getRow(int rows) {
       List<Integer>prev = new ArrayList<>();
      
        prev.add(1);
        
        for(int n = 1 ; n<=rows ; n++){
          List<Integer> curr = new ArrayList<>();
            
            curr.add(1);//nC0
            
            for(int k = 1 ; k<n ; k++){
                int nCk =prev.get(k) + prev.get(k-1);
                curr.add(nCk);
            }
            
            curr.add(1);//nCn
            prev = curr;
        }
        
        return prev;
    }
} */
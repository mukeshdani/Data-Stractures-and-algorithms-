//Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/

/* 
class Solution {
    public List<List<Integer>> generate(int rows) {
      List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        
        pascal.get(0).add(1);
        
        for(int n = 1 ; n<rows ; n++){
            List<Integer> row = new ArrayList<>();
            row.add(1); //nC0
            
            for(int k = 1 ; k<n ; k++){
                //nCk = n-1Ck-1 + n-1Ck
                int nCk = pascal.get(n-1).get(k) + pascal.get(n-1).get(k-1);
                row.add(nCk);
            }
            
            row.add(1);// nCn
            pascal.add(row);
        }
        
        return pascal;
    }
} */
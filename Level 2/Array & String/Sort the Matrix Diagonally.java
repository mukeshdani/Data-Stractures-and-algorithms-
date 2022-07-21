//Sort the Matrix Diagonally
// /https://leetcode.com/problems/sort-the-matrix-diagonally/

/* 
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> p = new HashMap<>();
        int m = mat.length ;
        int n = mat[0].length ; 
        for(int i=0 ; i<m ; i++){
            for(int j = 0 ; j< n ; j++){
                int gap = i-j;
                
                if(p.containsKey(gap) == false ){
                    p.put(gap , new PriorityQueue<>());
                }
                
                p.get(gap).add(mat[i][j]);
            }
        }
        
         for(int i=0 ; i<m ; i++){
            for(int j = 0 ; j< n ; j++){
                int gap = i-j;
                mat[i][j] = p.get(gap).remove();
               
            }
        }
        return mat;
    }

}










class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        for(int gap = -(m - 1); gap <= (n - 1); gap++){
            ArrayList<Integer> diag = new ArrayList<>();
            int i = gap < 0? -gap: 0;
            int j = gap < 0? 0: gap;
            while(i < m && j < n){
                diag.add(mat[i][j]);
                i++;
                j++;
            }
            
            Collections.sort(diag);
            i = gap < 0? -gap: 0;
            j = gap < 0? 0: gap;
            int idx = 0;
            while(i < m && j < n){
                mat[i][j] = diag.get(idx);
                idx++;
                i++;
                j++;
            }
        }
        
        return mat;
    }
} */
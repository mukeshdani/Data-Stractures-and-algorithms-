//Search a 2D Matrix II
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0 , j = matrix[0].length - 1;
        while( i < matrix.length && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j]>target) j--;
            else i++;
        }
        return false ;
    }
}

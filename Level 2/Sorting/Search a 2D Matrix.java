//Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public int binarySearchRow(int[][]matrix , int target ){
        int lo = 0 ;
        int h = matrix.length-1;
        int l = matrix[0].length-1;
        
        while(lo<=h){
            int mid = (lo+h)/2;
            
            if(matrix[mid][0]<=target && matrix[mid][l]>=target){
                return mid;
            }else if( matrix[mid][0]>target){
                h = mid-1;
            }else {
                lo = mid+1 ;
            }    
        }
        return -1;
    }
    
    public boolean binarySearch(int[][] matrix , int r , int target){
        int lo = 0 ;
        int h = matrix[0].length-1;
        while(lo<=h){
            int mid = (lo+h)/2;
            if(matrix[r][mid] == target){
                return true ;
            }else if( matrix[r][mid]>target){
                h=mid-1;
            }else lo = mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = binarySearchRow(matrix , target);
        if(r==-1)return false ;
        return binarySearch(matrix , r , target);
    }
}
//// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

// Time = Avg O(N) Similar to Stepcase, Worst O(N * log N) BS on each row
// Space = O(1)

class Solution {
    public int binarySerach(int [][]arr, int row , int left , int right){
        while(left<=right){
            int mid = left + (right - left)/2;
            
            if(arr[row][mid] == 0){
                left = mid + 1;
            }else right = mid - 1;
        }
        return left;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // Binary Search on Each Row 
        //Stepcse Search not happen 
        int right = m-1 ,ans = -1;
        int left = 0 ;
        for(int row = 0 ; row < n ; row++){
            int mid = binarySerach(arr , row , 0 , right);
            if(mid <= right){
                ans = row ;
                right = mid - 1;//reduced Binary Serach for next row
            }
        }
        return ans;
    }
}
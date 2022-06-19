//Max Chunks To Make Sorted II
//https://leetcode.com/problems/max-chunks-to-make-sorted-ii/


class Solution {
    public int maxChunksToSorted(int[] arr) {
       //1. Generate rmin and fill it 
        int [] rmin = new int [arr.length + 1];
        rmin[arr.length] = Integer.MAX_VALUE;
        
        for(int i = arr.length - 1; i>= 0 ; i--){
            rmin[i] = Math.min(rmin[i+1] , arr[i]);
        } 
        //2. generate lmax and count the chunks
        int count = 0 ;
        int lmax = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            lmax = Math.max(lmax , arr[i]);
            if(lmax <= rmin[i+1])count++;
        }
        return count;
    }
}
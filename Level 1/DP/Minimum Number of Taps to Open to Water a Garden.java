//Minimum Number of Taps to Open to Water a Garden
//https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/

class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] arr = new int[n+1];
        
        for(int i = 0 ; i< n+1 ; i++){
            int l = Math.max(0,i-ranges[i]);
            int r = Math.min(n, i+ranges[i]);
            
            arr[l] = Math.max(arr[l] , r-l);
            // From l , thats farther i can jump to right
        }
        
        // Now this question has turned to jump game II
        // where you have maximum jump you can take from an index i and 
        // you have to reach end 
        
        //this is just jump game II code 
        
        int currEnd = 0 ;
        
        int maxReach = 0 ;
        int count = 0 ;
        
        for(int i = 0 ; i<n ; i++){
            maxReach = Math.max(maxReach , arr[i]+i);
            
            if(i==currEnd){
                count++;
                currEnd = maxReach;
            }
        }
        
        if(currEnd >= n){
            return count;
        }
        return -1;
    }
}
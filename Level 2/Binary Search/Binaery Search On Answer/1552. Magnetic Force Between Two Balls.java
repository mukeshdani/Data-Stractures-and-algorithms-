// /1552. Magnetic Force Between Two Balls
//https://leetcode.com/problems/magnetic-force-between-two-balls/
//Similar Aggrcow


class Solution {
    public boolean isPossible(int [] position  , int minDistance , int m ){
        int placedCow  = 1 , lastCow  = 0 ;
        
        for(int currentInx = 1 ; currentInx < position.length  ; currentInx++){
            int distance = position[currentInx] - position[lastCow];
            if(distance >= minDistance){
                placedCow++;
                lastCow  = currentInx;
            }
        }
        
        return placedCow >= m?true:false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);// To Find Adjacent diatnce , Not to apply Binary Search
        
        
        int left = 1 ; // Minimum Possible Adjacent distance
        int right = position[position.length - 1] - position[0];
        
        while(left<=right){
            int mid = left +  (right - left)/2;
            
            if(isPossible(position , mid , m)){
                left = mid + 1;
            }else right = mid - 1;
        }
        return right;
    }
}

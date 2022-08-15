//Find the Smallest Divisor Given a Threshold
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 ;
        int right = 1000000;
        
        while(left < right){
            int mid = left + (right - left)/2;
            
            int sum = 0;
            for(int num : nums){
                sum += ( num + mid -1 )/mid;// mid - 1 for ceil value;
            }
            
            if(sum > threshold){
                left = mid + 1 ;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
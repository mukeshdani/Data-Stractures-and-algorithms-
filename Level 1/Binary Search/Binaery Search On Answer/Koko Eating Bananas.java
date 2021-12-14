
//Koko Eating Bananas

// Brute Foce -->linear Search 
// Opt. this approach by using Binary Search



class Solution {
    
    // for max of array
    public int maxarry(int[] arr ){
        int max =0 ;
        for(int i = 0 ; i<arr.length ; i++){
            max = Math.max(max , arr[i]);
        }
        return max ;
    }
    public boolean isPossible(int[] piles, int speed, int maxHours){
        int currHours = 0;
        for(int banana: piles){
            currHours = currHours + banana/speed;
            if(banana % speed != 0) currHours++;
        }
        
        if(currHours <= maxHours) return true;
        return false;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1 ;
        int high = maxarry(piles);
        int ans = high;
        while ( low <=high ){
            int mid = low + (high-low )/2;
            
            if ( isPossible(piles ,mid ,h ) == true ){
                ans = mid ;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        
        return ans ;
    }
}

/*class Solution {
    
    public boolean isPossible(int[] piles, int speed, int maxHours){
        int currHours = 0;
        for(int banana: piles){
            currHours = currHours + banana/speed;
            if(banana % speed != 0) currHours++;
        }
        
        if(currHours <= maxHours) return true;
        return false;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        while(low <= high){
            int midSpeed = low + (high - low) / 2;
            
            if(isPossible(piles, midSpeed, h) == true){
                ans = midSpeed;
                high = midSpeed - 1;
            } else {
                low = midSpeed + 1;
            }
        }
        return ans;
    }
}
*/




/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109*/
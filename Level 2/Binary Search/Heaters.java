
//Heaters


class Solution {
    public static int lowerBound(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int ans = arr.length;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] >= target){
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public static int closest(int[] arr, int target){
        int lb = lowerBound(arr, target);
        
        if(lb == arr.length) return arr[arr.length - 1]; // ceil does not exist
        else if(lb == 0) return arr[0]; // floor not exist
        
        else if(Math.abs(target - arr[lb]) < Math.abs(target - arr[lb - 1]))
            return arr[lb];
        
        else return arr[lb - 1];
    }
    
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<houses.length; i++){
            
            int closestHeater = closest(heaters, houses[i]);
            max = Math.max(max, Math.abs(closestHeater - houses[i]));
            
        }
        return max;
    }
}
/*Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.

Every house can be warmed, as long as the house is within the heater's warm radius range. 

Given the positions of houses and heaters on a horizontal line, return the minimum radius standard of heaters so that those heaters could cover all houses.

Notice that all the heaters follow your radius standard, and the warm radius will the same.

 

Example 1:

Input: houses = [1,2,3], heaters = [2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
Example 2:

Input: houses = [1,2,3,4], heaters = [1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, then all the houses can be warmed.
Example 3:

Input: houses = [1,5], heaters = [2]
Output: 3
 

Constraints:

1 <= houses.length, heaters.length <= 3 * 104
1 <= houses[i], heaters[i] <= 109*/
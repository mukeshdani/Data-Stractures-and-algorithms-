//Capacity To Ship Packages Within D Days
class Solution {
    
    public  boolean isPossible(int[] pages, int books, int maxLoad, int totalStud){
       int currStud = 1, currPages = 0;

       for(int i=0; currStud <= totalStud && i<books; i++){

           if(currPages + pages[i] <= maxLoad){
               currPages += pages[i];
           } else {
               currStud++;
               currPages = pages[i];
           }

       }

       if(currStud > totalStud) return false;
       return true;
   }

   public int maxOfArray(int[] pages, int books){
       int max = 0;
       for(int i=0; i<books; i++){
           max = Math.max(max, pages[i]);
       }
       return max;
   }

   public  int sumOfArray(int[] pages, int books){
       int sum = 0;
       for(int i=0; i<books; i++){
           sum += pages[i];
       }
       return sum;
   }

   public  int findPages(int[] pages,int books,int students)
   {
       int low = maxOfArray(pages, books);
       int high = sumOfArray(pages, books);
       int ans = high;

       while(low <= high){
           int mid = low + (high - low) / 2;

           if(isPossible(pages, books, mid, students) == true){
               ans = mid;
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }

       return ans;
   }
   public int shipWithinDays(int[] weights, int days) {
       return findPages(weights, weights.length , days);
   }
}






/*A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

 

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
Example 2:

Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
Example 3:

Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
1st day: 1
2nd day: 2
3rd day: 3
4th day: 1, 1
 

Constraints:

1 <= days <= weights.length <= 5 * 104
1 <= weights[i] <= 500*/
//1094. Car Pooling

//Car direction fix --> left - right 
//capacity fix-->3

//Time -->O(NlogN)

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
         TreeMap<Integer , Integer> changes = new TreeMap<>();
        //Time -->O(NlogN)
        for ( int i = 0 ; i<trips.length ; i++){
            int passengers = trips[i][0];
            int start = trips[i][1];
            int end = trips[i][2];
            
            changes.put(start , changes.getOrDefault(start , 0) + passengers);
           changes.put(end   , changes.getOrDefault(end   , 0) - passengers);
            
        }
        
        //Time -->O(N)
        int currPas = 0 ;
        for (Integer key : changes.keySet()){
            Integer val = changes.get(key);
            currPas += val;
            
            if ( currPas > capacity) return false ;
        }
        return true;
    }
}



/*Medium

1757

47

Add to List

Share
There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).

You are given the integer capacity and an array trips where trip[i] = [numPassengersi, fromi, toi] indicates that the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi respectively. The locations are given as the number of kilometers due east from the car's initial location.

Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.

 

Example 1:

Input: trips = [[2,1,5],[3,3,7]], capacity = 4
Output: false
Example 2:

Input: trips = [[2,1,5],[3,3,7]], capacity = 5
Output: true
 

Constraints:

1 <= trips.length <= 1000
trips[i].length == 3
1 <= numPassengersi <= 100
0 <= fromi < toi <= 1000
1 <= capacity <= 105
*/
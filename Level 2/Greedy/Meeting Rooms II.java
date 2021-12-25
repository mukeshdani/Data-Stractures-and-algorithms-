//Meeting Rooms II
//Company-->Facebook  Google  Uber
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        for ( int i = 0 ; i<intervals.size();i++){
            start.add(intervals.get(i).start);
            end.add(intervals.get(i).end);
        }

        Collections.sort(start);
        Collections.sort(end);

        int currentrooms =0 , maxRoom = 0;
        int startIdx = 0 , endIdx = 0;

        while (startIdx < intervals.size()){
         if ( start.get(startIdx)< end.get(endIdx)){
             startIdx++;
             currentrooms++;
         }   else if ( end.get(endIdx) < start.get(startIdx)){
             endIdx++;
             currentrooms--;
         }else {
             startIdx++;
             endIdx++;
         }
         maxRoom = Math.max(maxRoom , currentrooms);
        } 
    return maxRoom;
    }
}








/*Description
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

Example
Example1

Input: intervals = [(0,30),(5,10),(15,20)]
Output: 2
Explanation:
We need two meeting rooms
room1: (0,30)
room2: (5,10),(15,20)
Example2

Input: intervals = [(2,7)]
Output: 1
Explanation: 
Only need one meeting room*/

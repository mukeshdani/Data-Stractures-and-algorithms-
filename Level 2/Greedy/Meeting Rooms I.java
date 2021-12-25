//920 · Meeting Rooms Lintcode
//https://www.lintcode.com/problem/920/

/* -------brute force ---- */

//comapre one by one 
//Time --> O(N^2)



/* -----optimised------- */
// One room ---> One meeting at a time 
//steps
//1 . sort intervals based on ending interval
//2 . check overlapping with previous slot 

// Time----> O(NlogN) 



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
     * @return: if a person could attend all meetings
     */
    public static class MyComparator implements Comparator<Interval>{
        public int compare(Interval obj1, Interval obj2){
             if ( obj1.end != obj2.end ) return obj1.end - obj2.end;
             return obj1.start - obj2.start;
         }
     }
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        Collections.sort(intervals , new MyComparator()); //Time -->O(NlogN)

        int limit = Integer.MIN_VALUE;
        // last interval ending time 

           //Time --? O(n)
        for ( int i = 0 ; i< intervals.size() ;i++){
            if ( limit > intervals.get(i).start) return false ;
            limit = intervals.get(i).end;
        }
        return true;
    }
}

/*Description
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
Example
Example1

Input: intervals = [(0,30),(5,10),(15,20)]
Output: false
Explanation: 
(0,30), (5,10) and (0,30),(15,20) will conflict
Example2

Input: intervals = [(5,8),(9,15)]
Output: true
Explanation: 
Two times will not conflict */
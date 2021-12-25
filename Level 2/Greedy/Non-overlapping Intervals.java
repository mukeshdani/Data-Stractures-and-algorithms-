//435. Non-overlapping Intervals

class Solution {
    
    public static class Interval{
        int start;
        int end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public static class MyComparator implements Comparator<Interval>{
        public int compare(Interval obj1, Interval obj2){
            if(obj1.end!=obj2.end)
                return obj1.end - obj2.end;
            return obj1.start - obj2.start;
        }
    }
    
 
    public int eraseOverlapIntervals(int[][] times) {
        int n = times.length;
        Interval[] intervals = new Interval[n];
        for(int i=0; i<n; i++)
            intervals[i] = new Interval(times[i][0], times[i][1]);
        Arrays.sort(intervals, new MyComparator());

        int limit = Integer.MIN_VALUE; // last Interval ending time
        int count = 0;

        for(int i=0; i<n; i++){
            if(limit <= intervals[i].start){
                limit = intervals[i].end;
                count++;
            }
        }

        return n - count;
    }
}


/*Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

 

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 

Constraints:

1 <= intervals.length <= 105
intervals[i].length == 2
-5 * 104 <= starti < endi <= 5 * 104*/

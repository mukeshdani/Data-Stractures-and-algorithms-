//57. Insert Interval

//https://leetcode.com/problems/insert-interval/


class Solution {
    
    int findFirst(int [][] intervals , int[] newInterval){
        for ( int idx = 0 ; idx<intervals.length ; idx++){
            if ( intervals[idx][1]>=newInterval[0]){
                return idx;
            }
        }
        return intervals.length;
    }
    int findLast(int [][] intervals , int[] newInterval){
       for ( int idx = intervals.length - 1 ; idx>=0 ; idx--){
            if ( intervals[idx][0]<=newInterval[1]){
                return idx;
            }
        } 
        return -1;
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int firstIdx = findFirst(intervals , newInterval);
        int lastIdx = findLast(intervals, newInterval);
         ArrayList<int[]>res = new ArrayList<>();
        
        // non merging --> firstIdx >lastIdx
        
        if ( firstIdx > lastIdx){
            for ( int i =0 ; i<=lastIdx ; i++){
                res.add(intervals[i]);
            }
            
            res.add(newInterval);
            for ( int i =firstIdx ; i<intervals.length ; i++){
                res.add(intervals[i]);
            }
        }else{
           
            for ( int i = 0 ; i< firstIdx;i++){
                res.add(intervals[i]);
            }
            
            int [] merged = new int[2];
            merged[0] = Math.min(intervals[firstIdx][0],newInterval[0]);
            merged[1] = Math.max(intervals[lastIdx][1],newInterval[1]);
            res.add(merged);
            
            for ( int i = lastIdx+1 ; i<intervals.length ; i++){
                res.add(intervals[i]);
            }
            
            
        } 
        
        
        int [][] ans = new int[res.size()][2];
        for ( int i = 0 ; i<res.size(); i++){
            ans[i]= res.get(i);
        }
        return ans;
    }
}


/*You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

 

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 

Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105*/

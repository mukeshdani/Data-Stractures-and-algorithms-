//56. Merge Intervals

//Time ---> O(NlogN)
//Space ---> O(N)

class Solution {
    public int[][] merge(int[][] intervals) {
          Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
      ArrayList<int[]> merged = new ArrayList<>();
        
        merged.add(intervals[0]);
        
        for ( int i= 1 ; i<intervals.length ; i++){
            int [] lastInt = merged.get(merged.size()-1);
            int [] currInt = intervals[i];
            
            if ( lastInt[1]>=currInt[0]){
                // merge 
                lastInt[1]=Math.max(lastInt[1],currInt[1]);
                
            }else  {
                merged.add(currInt);
            }
        }
        
        int [][] res = new int[merged.size()][2];
        for ( int i =0 ; i<merged.size();i++){
            res[i]= merged.get(i);
        }
        
        return res;
    }   
}
/* 
class Solution {
    public int[][] merge(int[][] intervals) {
      List<int[]> answer = new ArrayList<>();
        
        if(intervals.length != 0 || intervals != null){
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            
            int start = intervals[0][0];
            int end = intervals[0][1];
            for(int[] i: intervals){
                if(i[0] <= end){
                    end = Math.max(end, i[1]);
                } else {
                    answer.add(new int[]{start,end});
                    start = i[0];
                    end = i[1];
                }
            }
            answer.add(new int[]{start,end}); 
            
        }
        
        return answer.toArray(new int[0][]);
    }   
} */


/*Given an array of intervals where 
intervals[i] = [starti, endi],
 merge all overlapping intervals,
  and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104*/

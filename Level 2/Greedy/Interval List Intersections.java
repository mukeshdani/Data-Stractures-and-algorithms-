//986. Interval List Intersections

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
     int firstIdx = 0 , secondIdx = 0 ;
        
        ArrayList<int[]> intersect = new ArrayList<>();
        
        while ( firstIdx < firstList.length && secondIdx < secondList.length){
            int s1 = firstList[firstIdx][0];
            int e1 = firstList[firstIdx][1];
            int s2 = secondList[secondIdx][0];
            int e2 = secondList[secondIdx][1];
            
            int start = Math.max(s1,s2);
            int end = Math.min(e1,e2);
            
            if ( start <= end ){
                intersect.add(new int[]{start,end});
            }
            
            if (e1<e2) firstIdx++;
            else secondIdx++;
        }
        
        int[][] res = new int[intersect.size()][2];
        for ( int i = 0 ; i<intersect.size();i++){
            res[i] = intersect.get(i);
        }
        return res;
    }
}

/*You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.

The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].

 

Example 1:


Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
Example 2:

Input: firstList = [[1,3],[5,9]], secondList = []
Output: []
 

Constraints:

0 <= firstList.length, secondList.length <= 1000
firstList.length + secondList.length >= 1
0 <= starti < endi <= 109
endi < starti+1
0 <= startj < endj <= 109
endj < startj+1*/

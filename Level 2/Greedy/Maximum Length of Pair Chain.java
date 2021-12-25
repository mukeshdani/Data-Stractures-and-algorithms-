//646. Maximum Length of Pair Chain

class Solution {
    public static class Pair implements Comparable <Pair>{

        int start , end ;
        
        Pair(int start , int end ) {
            this.start = start ;
            this.end = end ;
        }
        
        public int compareTo(Pair other ){
            return this.end - other.end ;
        }
    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Pair[] intervals = new Pair[n];
        
        for ( int i = 0 ; i< n ;i++){
            intervals[i] = new Pair(pairs[i][0],pairs[i][1]);
        }
        
        Arrays.sort(intervals);
        
        int ans = 0 , limit = Integer.MIN_VALUE;
        for ( int i=0 ; i< n ; i++){
            if(intervals[i].start >limit){
                ans++;
                limit= Math.max(limit , intervals[i].end);
            }
        }
        return ans;
    }
}



/*You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.

A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.

Return the length longest chain which can be formed.

You do not need to use up all the given intervals. You can select pairs in any order.

 

Example 1:

Input: pairs = [[1,2],[2,3],[3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4].
Example 2:

Input: pairs = [[1,2],[7,8],[4,5]]
Output: 3
Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].
 

Constraints:

n == pairs.length
1 <= n <= 1000
-1000 <= lefti < righti <= 1000*/
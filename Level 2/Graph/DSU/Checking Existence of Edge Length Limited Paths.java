//Checking Existence of Edge Length Limited Paths
//https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/

import java.util.*;

class Solution {
    public class DSU{
        int [] parent ;
        int [] rank ;
        DSU(int n){
            parent = new int [n];
            rank = new int [n];
            Arrays.fill(parent , -1);
            Arrays.fill(rank , 1);
        }
        
        public void union(int x , int y){
            int px = find(x);
            int py = find(y);
            
            if(px == py) return;
            
            if(rank[px] > rank[py]){
                parent[py] = px;
                rank[px] += rank[py];
            }else {
                parent[px] = py;
                rank[py] += rank[px];
            }
        }
        
        public int find(int x){
            if(parent[x] == -1) return x;
            return parent[x] = find(parent[x]);
        }
    }
    
    public static class Query implements Comparable<Query>{
        int idx ;
        int a , b;
        int threshold;
        
        Query(int idx , int a , int b , int threshold){
            this.idx = idx ;
            this.a = a;
            this.b = b;
            this.threshold = threshold;
        }
        
        public int compareTo(Query other){
            return this.threshold - other.threshold;
        }
    }
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
      
        List<Query> sortedQueries = new ArrayList<>();
        
        for(int i = 0 ;  i< queries.length ; i++){
            sortedQueries.add(new Query(i , queries[i][0] , queries[i][1] , queries[i][2]));
        }
        
        Collections.sort(sortedQueries);
        Arrays.sort( edgeList , (a,b) -> a[2] -b[2]);
        
        DSU sets = new DSU(n);
        boolean[] res = new boolean[queries.length];
        int e = 0 ;
        for(Query q:sortedQueries){
            while(e < edgeList.length && edgeList[e][2] < q.threshold){
                sets.union(edgeList[e][0], edgeList[e][1]);
                e++;
            }
            
            if(sets.find(q.a) == sets.find(q.b)) res[q.idx] = true;
        }
        return res;
    }
}
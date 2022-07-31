//Redundant Connection
//https://leetcode.com/problems/redundant-connection/

import java.util.*;
class Solution {
    public class DSU{
        int[] rank ;
        int [] parent;
        DSU(int n){
            rank = new int[n];
            Arrays.fill(rank , 1);
            parent = new int[n];
            Arrays.fill(parent , -1);
        }
        
        public void union(int a , int b){
            int pa  = find(a);
            int pb = find(b);
            if(pa == pb) return;
            
            if(rank[pa] > rank[pb]){
                parent[pb] = pa;
                rank[pa] += rank[pb];
            }else {
                parent[pa] = pb;
                rank[pb] += rank[pa];
            }
        }
        public int find(int a){
            if(parent[a] == -1)return a;
            return parent[a] = find(parent[a]);
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        DSU sets = new DSU(edges.length  + 1);
        
        for(int [] edge : edges){
           int a = edge[0] , b = edge[1];
           if(sets.find(a) == sets.find(b)){
               return edge;//cycle
           }
           sets.union(a,b);
       }
        return null;
    }
    
}
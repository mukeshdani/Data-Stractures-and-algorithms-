/* //Redundant Connection
//https://leetcode.com/problems/redundant-connection/

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length * edges[0].length];
        rank = new int[edges.length * edges[0].length];
        
        for(int i =0 ; i <edges.length * edges[0].length ; i++){
            parent[i] = i ;
            rank[i] = 0 ;
        }
        
        for(int [] e : edges){
            int x = e[0];package DSU;
            
            public class Redundant Connection {
                
            }
            
            int y = e[1];
            
            int xcell = find(x);
            int ycell = find(y);
            
            if(xcell != ycell){
                union(xcell , ycell);
            }else if( xcell == ycell){
                return e;
            }
        }
        
        return new int[]{};
    }
    static int [] parent;
    static int [] rank;
    
    public int find(int x){
        if(parent[x] == x){
            return x;
        }else {
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }
    
    public void union(int x , int y ){
        if(rank[x] <rank[y]){
            parent[x] = y;
        }else if(rank[y]<rank[x]){
            parent[y] = x;
        }else {
            parent[x] = y;
            rank[y]++;
        }
    }
} */
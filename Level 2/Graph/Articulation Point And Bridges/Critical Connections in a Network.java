//Critical Connections in a Network
//https://leetcode.com/problems/critical-connections-in-a-network/


import java.util.*;
class Solution {
    //List of Bridges should be returned 
    
    public int[] disc;
    public int[] low ;
    public int time = 0;
    public List<List<Integer>> bridges;
    
    public void DFS(int src , int parent , ArrayList<Integer>[] adj){
        disc[src] = low[src] = time;
        time++;
        
        for(Integer nbr :adj[src]){
            if(nbr == parent)continue; //self
            
            if(disc[nbr] >= 0){
                //back edge (already Visited nbr )
                //back edge can never be a bridge 
                low[src] = Math.min(low[src] , disc[nbr]);
            }else {
                //unvisited nbrs
                DFS(nbr , src , adj);
                
                if(low[nbr] > disc[src]){
                    //nbr can not visited the already vidited
                    List<Integer> bridge = new ArrayList<>();
                    bridge.add(src);
                    bridge.add(nbr);
                    bridges.add(bridge);
                }
                low[src] = Math.min(low[src] , low[nbr]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        disc = new int[n];
        low = new int[n];
        Arrays.fill(disc , -1);// Discover is -1 --> means node is unvised
        
        bridges = new ArrayList<>();
        
        ArrayList<Integer>[] adj =  new ArrayList[n];
        for(int i = 0 ; i<n; i++) adj[i] = new ArrayList<>();
        for(List<Integer> edge : connections){
            adj[edge.get(0)].add(edge.get(1));
            adj[edge.get(1)].add(edge.get(0));
        }
        
        DFS(0 , -1 , adj);
        return bridges;
    }
}
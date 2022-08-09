//Articulation Point - I
//https://practice.geeksforgeeks.org/problems/articulation-point-1/1

import java.util.*;
class Solution
{
    public int[] disc;
    public int[] low;
    public int time =0 ;
    public TreeSet<Integer> articulationPoint = new TreeSet<>();
    
    public void DFS(int src , int parent , ArrayList<ArrayList<Integer>> adj){
        disc[src] = low[src] = time ;
        time++;
        
        int dfsCount = 0;
        
        for(Integer nbr : adj.get(src)){
            if(nbr == parent )continue;
            
            if(disc[nbr] >= 0){
                //back edge
                low[src] = Math.min(low[src] , disc[nbr]);
            }else {
                 //unviseted 
                 DFS(nbr , src , adj);
                 dfsCount++;
                 
                 if(parent != -1 && low[nbr] >= disc[src]){
                     articulationPoint.add(src);
                 }
                low[src] = Math.min(low[src] , low[nbr]);
            }
        }
        if(parent == -1 && dfsCount >1){
            articulationPoint.add(src);
            //overall source node -> 2 Disconnected Children ->articulation Point
        }
    }
    public ArrayList<Integer> articulationPoints(int n,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        disc = new int[n];
        low = new int[n];
        Arrays.fill(disc , -1);
        DFS(0 , -1 , adj);
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer ap : articulationPoint)res.add(ap);
        
        if(res.size() ==0) res.add(-1);
        return res;
    }
}
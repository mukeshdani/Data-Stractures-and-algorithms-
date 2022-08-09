//Articulation Point - II 

//https://practice.geeksforgeeks.org/problems/articulation-point2616/1/
//


import java.util.*; 

class Solution
{
    
    public int[] disc;
    public int[] low;
    public boolean[] vis;
    public int time =0 ;
    public TreeSet<Integer> articulationPoint = new TreeSet<>();
    
    public void DFS(int src , int parent , ArrayList<ArrayList<Integer>> adj ,boolean[] vis ){
         vis[src] = true;
        disc[src] = low[src] = time ;
        time++;
        
        int dfsCount = 0;
        
        for(Integer nbr : adj.get(src)){
            if(nbr == parent )continue;
            
            if(vis[nbr]){
                //back edge
                low[src] = Math.min(low[src] , disc[nbr]);
            }else {
                 //unviseted 
                  dfsCount++;
                 DFS(nbr , src , adj , vis);
                 low[src] = Math.min(low[src] , low[nbr]);
                 
                 if(parent != -1 && low[nbr] >= disc[src]){
                     articulationPoint.add(src);
                 }
              
            }
        }
        if(parent == -1 && dfsCount >1){
            articulationPoint.add(src);
        }
    }
    public int[] articulationPoints(int n, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        disc = new int[n];
        low = new int[n];
        vis = new boolean[n];
        
        for(int i = 0 ; i<n ; i++){
            if(!vis[i])
                DFS(i , -1 , adj , vis);
        }
       
      
        int[] res = new int[articulationPoint.size()];
        int idx = 0;
        for(int i: articulationPoint){
            res[idx] = i;
            idx++;
        }
        
        if(articulationPoint.size() == 0){
            res = new int[] {-1};
        }
        Arrays.sort(res);
        return res;
    }
}
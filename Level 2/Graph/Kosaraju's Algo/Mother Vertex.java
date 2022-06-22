//Mother Vertex 
//https://practice.geeksforgeeks.org/problems/mother-vertex/1

/* 
class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int mv = -1;
        boolean[] vis = new boolean[V];
        for(int v = 0; v < V; v++){
            if(!vis[v]){
                dfs(v, vis, adj);
                mv = v;
            }
        }
        
        Arrays.fill(vis, false);
        dfs(mv, vis, adj);
        
        for(int v = 0; v < V; v++){
            if(vis[v] == false){
                return -1;
            }
        }
        
        return mv;
    }
    
    public void dfs(int v, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[v] = true;
        for(int n: adj.get(v)){
            if(!vis[n]){
                dfs(n, vis, adj);
            }
        }
    }
    
    
} */
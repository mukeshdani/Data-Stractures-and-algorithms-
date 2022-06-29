//Articulation Point - II 

//https://practice.geeksforgeeks.org/problems/articulation-point2616/1/
//


/* 
class Solution
{
    public int[] articulationPoints(int V, ArrayList<ArrayList<Integer>> adj)
    {
        HashSet<Integer> aps = new HashSet<>();
        boolean[] vis = new boolean[V];
        int[] dis = new int[V];
        int[] low = new int[V];
        
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(adj, aps, vis, dis, low, i, -1);
            }
        }
        
        
        int[] res = new int[aps.size()];
        int idx = 0;
        for(int i: aps){
            res[idx] = i;
            idx++;
        }
        
        if(aps.size() == 0){
            res = new int[] {-1};
        }
        
        Arrays.sort(res);
        
        return res;
    }
    
    int time = 0;
    public void dfs(ArrayList<ArrayList<Integer>> adj, HashSet<Integer> aps, boolean[] vis, int[] dis, int[] low, int u, int p){
        vis[u] = true;
        dis[u] = low[u] = ++time;
        
        int c = 0;
        for(int v: adj.get(u)){
            if(v == p){
                continue;
            } else if(vis[v]){
                low[u] = Math.min(low[u], dis[v]);
            } else {
                c++;
                dfs(adj, aps, vis, dis, low, v, u);
                low[u] = Math.min(low[u], low[v]);
                
                if(p != -1 && low[v] >= dis[u]){
                    aps.add(u);
                }
            }
        }
        
        if(p == -1 && c > 1){
            aps.add(u);
        }
    }
} */
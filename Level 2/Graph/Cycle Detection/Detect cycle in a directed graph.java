//Detect cycle in a directed graph
//https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1


class Solution {
    // -1 -> unvisited, 0 -> Same Path Visited (Preorder), 1 -> Diff Path (Visited)
    public boolean DFS(int src, ArrayList<ArrayList<Integer>> adj, int[] vis){
        if(vis[src] == 0) return true; // Node is visited twice in same paths
        if(vis[src] == 1) return false; // Node is visited twice in diff paths
        
        vis[src] = 0; // Preorder Visit (Same Path)
        for(Integer nbr: adj.get(src)){
            if(DFS(nbr, adj, vis) == true) return true;
        }
        vis[src] = 1; // Postorder Visit (Diff Path)
        return false;
    }
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        Arrays.fill(vis, -1);
        
        for(int i=0; i<V; i++){
            if(DFS(i, adj, vis) == true)
                return true;
        }
        return false;
    }
}


///Using BFS


class Solution {
    // -1 -> unvisited, 0 -> Same Path Visited (Preorder), 1 -> Diff Path (Visited)
    public boolean BFS( int n , ArrayList<ArrayList<Integer>> adj){
        int [] incomming = new int[n];
        
        for(int src = 0 ; src < adj.size() ; src++){
            for(Integer nbr : adj.get(src)){
                incomming[nbr]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for( int i = 0 ; i< n ; i++){
            if(incomming[i] == 0){
                q.add(i);
            }
        }
        
        int visited = 0 ;
        
        while(q.size()>0){
            int src = q.remove();
            visited++;
            for(Integer nbr : adj.get(src)){
                incomming[nbr]--;
                if(incomming[nbr] == 0 ){
                    q.add(nbr);
                }
            }
        }
            if(visited == n) return false ;
             return true;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
       return BFS(V , adj);
    }
}
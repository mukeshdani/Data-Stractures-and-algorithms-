//Is Graph Bipartite?
//https://leetcode.com/problems/is-graph-bipartite/


class Solution {
    
    
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        for(int v = 0; v < graph.length; v++){
            if(visited[v] == 0){
                // boolean isBip = traverseBFS(graph, visited, v);
                boolean isBip = traverseDFS(graph, visited, v, 1);
                if(isBip == false){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    class Pair {
        int v;
        int color;
        
        Pair(int v, int color){
            this.v = v;
            this.color = color;
        }
    }

    public boolean traverseBFS(int[][] graph, int[] visited, int v){
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        
        queue.add(new Pair(v, 1));
        while(queue.size() > 0){
            Pair rem = queue.remove();
            // m*
            if(visited[rem.v] != 0){
                int oc = visited[rem.v];
                int nc = rem.color;
                
                if(oc == nc){
                    continue;
                } else {
                    return false;
                }
            }
            visited[rem.v] = rem.color;
            
            for(int nbr: graph[rem.v]){
                if(visited[nbr] == 0){
                    queue.add(new Pair(nbr, rem.color * -1));
                }
            }
        }
        
        return true;
    }
    
    public boolean traverseDFS(int[][] graph, int[] visited, int v, int color){
        visited[v] = color;
        for(int nbr: graph[v]){
            if(visited[nbr] == 0){
                boolean isBip = traverseDFS(graph, visited, nbr, color * -1);
                if(isBip == false){
                    return false;
                }
            } else {
                int oc = visited[nbr];
                int nc = color * -1;
                
                if(oc != nc){
                    return false;
                }
            }
        }
        
        return true;
    }
}
//All Paths From Source to Target
//https://leetcode.com/problems/all-paths-from-source-to-target/


class Solution {
    static int count = 0 ;
    public static void dfs(int[][] graph ,int src , int dest , boolean[] vis , List<Integer>pathSoFar , List<List<Integer>> res ){
        if(src == dest ){
            //Deep Copy 
            List<Integer> copy = new ArrayList<>();
            copy.addAll(pathSoFar);
            res.add(copy);
            return;
        }
        
        vis[src] = true;
        
        for(int nbr : graph[src]){
            if(vis[nbr] == false ){
                pathSoFar.add(nbr);
                dfs(graph , nbr , dest , vis , pathSoFar , res);
                pathSoFar.remove(pathSoFar.size() - 1);
            }
        }
        
        vis[src] = false;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        int vtces = graph.length ; 
        
        boolean[] vis = new boolean[vtces];
        
        List<Integer> pathSoFar = new ArrayList<>();
        pathSoFar.add(0);
        
        dfs(graph , 0 , vtces - 1 , vis , pathSoFar , res);
        
        return res;
        
    }
}
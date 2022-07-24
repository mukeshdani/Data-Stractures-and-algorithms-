//Network Delay Time
//https://leetcode.com/problems/network-delay-time/

/* class Solution {
    public static class Pair implements Comparable<Pair>{
        int node ;
        int weight;
        public Pair(int node , int weight){
            this.node = node ;
            this.weight = weight;
        }
        
        public int compareTo(Pair other){
            return (this.weight - other.weight);
        }
    }
    public int networkDelayTime(int[][] edges, int n, int k) {
        ArrayList<Pair>[] adj = new ArrayList[n];
        for(int i = 0 ; i< n ; i++) adj[i] = new ArrayList<>();
        for(int[] edge : edges){
            adj[edge[0]-1].add(new Pair(edge[1] -1 , edge[2]));
        }
        
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(k-1 , 0));
        int [] vis = new int[n];
        Arrays.fill(vis , Integer.MAX_VALUE);
        
        while(q.size() > 0){
            Pair top = q.remove();
            if(vis[top.node] != Integer.MAX_VALUE)continue;
            vis[top.node] = top.weight;
            
            for(Pair nbr :adj[top.node]){
                q.add(new Pair(nbr.node , top.weight + nbr.weight));
            }
        }
        
        int time = 0 ;
        for(int i = 0 ;i<n ; i++){
            time = Math.max(time ,vis[i]);
        }
        
        return (time == Integer.MAX_VALUE) ? -1 :time;
    }
} */
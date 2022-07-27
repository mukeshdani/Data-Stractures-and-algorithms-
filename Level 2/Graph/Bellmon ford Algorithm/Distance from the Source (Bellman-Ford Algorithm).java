//Distance from the Source (Bellman-Ford Algorithm)
//https://practice.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1

/* class Solution
{
    static int[] bellman_ford(int v, ArrayList<ArrayList<Integer>> edges, int s)
    {
        // Write your code here
        int []dist = new int[v];
        
        Arrays.fill(dist , 100000000);
        
        dist[s] = 0;
        
        for(int i = 1 ; i< v ; i++){
                for(ArrayList<Integer> edge : edges){
                    int out = edge.get(0);
                    int in = edge.get(1);
                    int w = edge.get(2);
                    
                    if(dist[out] == 100000000)continue;
                    
                    dist[in] = Math.min(dist[in] , dist[out] + w);
                        
                    
                }
        }
        return dist;
        
        
    }
} */
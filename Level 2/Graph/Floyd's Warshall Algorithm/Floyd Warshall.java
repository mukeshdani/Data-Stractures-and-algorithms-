//Floyd Warshall
//https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1


class Solution
{
    public void shortest_distance(int[][] dist)
    {
        // Code here 
        int n = dist.length;
        for(int inter = 0 ; inter<n ; inter++){
            for(int src = 0 ; src < n ; src ++){
                for(int dest = 0 ; dest < n ; dest ++){
                    int oldDist = dist[src][dest];
                    if(oldDist == -1)oldDist = Integer.MAX_VALUE;
                    
                    if(dist[src][inter] != -1 && dist[inter][dest] != -1 ){
                        dist[src][dest] = Math.min(oldDist , dist[src][inter] + dist[inter][dest]);
                    }
                }
            }
        }
    }
}
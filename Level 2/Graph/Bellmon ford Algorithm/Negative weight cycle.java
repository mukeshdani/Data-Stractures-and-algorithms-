//Negative weight cycle
//https://practice.geeksforgeeks.org/problems/negative-weight-cycle3504/1


/* 
class Solution
{
    public int isNegativeWeightCycle(int v, int[][] edges)
    {
        //code here
          int []dist = new int[v];
        
        Arrays.fill(dist ,Integer.MAX_VALUE);
        
        dist[0] = 0;
        
        for(int i = 1 ; i< v ; i++){
                for(int[] edge : edges){
                    int out = edge[0];
                    int in = edge[1];
                    int w = edge[2];
                    
                    if(dist[out] == Integer.MAX_VALUE)continue;
                    
                    dist[in] = Math.min(dist[in] , dist[out] + w);
                }
        }
        
        for(int[] edge : edges){
              int out = edge[0];
              int in = edge[1];
              int w = edge[2];
              
                 if(dist[out] == Integer.MAX_VALUE)continue;
                 if(dist[out] + w <dist[in])return 1;
                    
        }
        return  0;
        
    }
} */
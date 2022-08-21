//Largest Distance between nodes of a Tree
//https://www.interviewbit.com/problems/largest-distance-between-nodes-of-a-tree/


import java.util.*;
public class main {
    int maxdiameter = 0 ;
    
    void dfs(int src , ArrayList<Integer>[] adj ,int[] height ){
        int max = 0 , secondMax = 0;
        for(Integer nbr : adj[src]){
            dfs(nbr, adj , height);
            height[src] = Math.max(height[src] , height[nbr] + 1 );
            
            if(height[nbr] >= max){
                secondMax = max;
                max = height[nbr];
            }else if(height[nbr]>secondMax){
                secondMax = height[nbr];
            }
        }
        
        int diameter = max + secondMax + 1;
        maxdiameter = Math.max(maxdiameter , diameter);
    }
   public int solve(int[] par) {
       int n = par.length;
       ArrayList<Integer>[] adj = new ArrayList[n];
       
       for(int i = 0 ; i< n ; i++) adj[i] = new ArrayList<>();
       
       int src = 0 ;
       for(int i = 0 ; i<n ; i++){
           if(par[i] == -1) src = i;
           else adj[par[i]].add(i);
       }
       int[] height = new int[n];
       Arrays.fill(height , 1);
       
       dfs(src , adj , height);
       return maxdiameter - 1;
       
   }
}

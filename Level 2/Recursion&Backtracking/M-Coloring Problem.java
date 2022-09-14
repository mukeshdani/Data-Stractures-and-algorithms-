//M-Coloring Problem
//https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1





import java.util.*;
class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean canColor(int src , boolean graph [][] , int color , int[] vis){
        for(int nbr = 0 ; nbr<graph.length; nbr++){
            if(graph[src][nbr] == true && vis[nbr] == color)return false ;
        }
        return true;
    }
    public boolean helper(int idx , boolean graph[][] , int color , int[] vis){
    if(idx == graph.length)return true;
    
    for( int c =0 ; c<color ; c++){
        if(canColor(idx , graph , c , vis) == true ) {
            vis[idx] = c ; 
            if(helper(idx+1 , graph , color , vis) == true)return true;
            vis[idx] = -1;
        }
    }
    return false ;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int vis[] = new int[graph.length];
        Arrays.fill(vis , -1);
        return helper(0 , graph , m , vis);
    }
}
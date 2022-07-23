//Reverse Edges
//https://www.codingninjas.com/codestudio/problems/reverse-edges_1200162?leftPanelTab=0

import java.util.*;

public class Solution {
    public static class Pair{
        int node;
        int level;
        Pair(int node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public static int reverseEdges(int n, int start, int end, ArrayList<ArrayList<Integer>> edgeList) {
        int[][] adj = new int [n][n];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<n ; j++){
                adj[i][j] = -1;
            }
        }
        for(ArrayList<Integer> edge :edgeList){
            adj[edge.get(0)][edge.get(1)] = 0 ;
             adj[edge.get(1)][edge.get(0)] = 1 ;
        }
        
        Deque<Pair> q = new ArrayDeque<>();
        q.addLast(new Pair(start , 0));
        
        int [] visited = new int[n];
        Arrays.fill(visited ,Integer.MAX_VALUE);
        
        while(q.size() > 0){
            Pair front = q.removeFirst();
            
            if(front.level >= visited[front.node])continue;
            visited[front.node] = front.level;
            
            for(int i = 0 ; i<n ; i++){
                if(adj[front.node][i] == 0 ){
                    q.addFirst(new Pair(i , front.level));
                }else if(adj[front.node][i] == 1){
                    q.addLast(new Pair(i , front.level + 1));
                }
            }
        }
        return visited[end];
    }
}


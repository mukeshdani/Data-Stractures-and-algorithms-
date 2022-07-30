// Min Cost to Connect All Points
//https://leetcode.com/problems/min-cost-to-connect-all-points/

import java.util.*;
class Solution {
    public static class Pair implements Comparable<Pair>{
        int idx ;
        int weight;
        
        public Pair(int idx , int weight){
            this.idx = idx ;
            this.weight = weight;
        }
        
        public int compareTo(Pair other){
            return this.weight - other.weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        
        boolean[] vis = new boolean[n];
        PriorityQueue<Pair> q= new PriorityQueue<>();
        q.add(new Pair(0,0));
        
        int cost = 0 , count = 0 ;
        while(q.size() >0 && count < n){
            Pair top  = q.remove();
            if(vis[top.idx] == true)continue;
            
            vis[top.idx] = true;
            cost = cost + top.weight;
            count++;
            for(int i = 0 ; i<n ; i++){
                 if (top.idx == i)
                    continue; // Ignore Self Loop
                
                int dist = Math.abs(points[top.idx][0] - points[i][0]) + Math.abs(points[top.idx][1] - points[i][1]);
                q.add(new Pair(i , dist));
            }
        }
        
        return cost;
    }
}
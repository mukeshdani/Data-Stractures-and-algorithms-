/* //Parallel Courses
//https://www.codingninjas.com/codestudio/problems/parallel-courses_1376444

import java.util.*;
public class Solution {
    static int BFS(int n , ArrayList<Integer>[] adj){
        int [] incomming = new int[n];
        
        for(int i = 0 ; i< n ; i++){
            for(Integer nbr : adj[i]){
                incomming[nbr]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i< n ; i++){
            if(incomming[i] == 0 ){
                q.add(i);
            }
        }
        
        int visited = 0 ; 
        int level = 0 ;
        
        while(q.size()>0){
            int size = q.size();
            for(int i = 0 ; i<size ; i++){
                int src = q.remove();
                visited++;
                for(Integer nbr : adj[src]){
                    incomming[nbr]--;
                    if(incomming[nbr] == 0){
                        q.add(nbr);
                    }
                }
            }
            level++;
        }
        if(visited == n) return level;
        return -1;
    }
    public static int parallelCourses(int n, int[][] prerequisites) {
        // Write your code here
       ArrayList<Integer>[] adj = new ArrayList[n];
        for(int i = 0 ; i < n ; i++){
            adj[i] = new ArrayList<>();
        }
        
       for(int[]edge : prerequisites){
           adj[edge[1]-1].add(edge[0]-1);
       }
        return BFS(n , adj);
        }
} */
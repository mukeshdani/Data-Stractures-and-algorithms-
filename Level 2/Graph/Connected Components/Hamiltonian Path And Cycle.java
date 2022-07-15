import java.io.*;
import java.util.*;

public class Main {
  
   public static boolean isEdge(int src , int dest ,  ArrayList<Integer>[] graph ){
       for(Integer nbr : graph[src]){
           if(nbr == dest )return true ;
       }
       return false;
   }
public static void DFS(int src ,boolean []vis,  ArrayList<Integer>[] graph , int visCount , String path){
    if(vis[src] == true )return ;
    vis[src] = true ;
    visCount++;
    if(visCount == graph.length){
        System.out.print(path) ; 
        
        int a = path.charAt(0) - '0';
        if(isEdge( a, src , graph) == true){
            System.out.println('*');
        }else {
            System.out.println('.');
        }
    }
    for(Integer nbr : graph[src]){
        DFS(nbr , vis , graph , visCount , path+nbr);
    }
    vis[src] = false ;
}
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Integer>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
       
         graph[v1].add(v2);
         graph[v2].add(v1);
      }

      int src = Integer.parseInt(br.readLine());
       boolean [] vis = new boolean[vtces];
         DFS(src ,vis ,  graph , 0 , "" + src );
   }


}
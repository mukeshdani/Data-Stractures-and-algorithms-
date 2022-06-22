//Strongly Connected Components
//https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1

/* 
class Solution
{
    
   {
      
       Stack<Integer> stk = new Stack<>();
       boolean []visited = new boolean[V];
       for(int i=0;i<V;i++)
       {
          if(visited[i]==false)
          {
              dfs1(adj, i,stk,visited);// hitting the dfs here
          }
       }
           // making the revere graph
            ArrayList<ArrayList<Integer>> revGraph = new ArrayList<>();
            for(int i=0;i<V;i++)
            {
              revGraph.add(new ArrayList<Integer>());
            }
            
         //reversing the graph   
            for(int i=0;i<V;i++)
           {
             ArrayList<Integer> list = adj.get(i);
            for(int x : list)
              {
              revGraph.get(x).add(i);
              }
            }
              int count =0;
              visited = new boolean[V];//new visited
              
       //now usinf dfs again to find the strongly connected components
            while(stk.size()>0)
             {
               int rem = stk.pop();
               if(visited[rem]==false)
                 {
                    count ++;
                    dfs2(revGraph,rem,visited);
                 }
              }
              return count;
       }
     

       public static void dfs1(ArrayList<ArrayList<Integer>> adj, int src,  Stack<Integer> stk, boolean[] visited)
       {
           visited[src]=true;
           ArrayList<Integer> list =adj.get(src);
           for(int x:list )
           {
               if(visited[x]==false)
               dfs1(adj,x, stk, visited);
           }
           // storing the values in a stack
           stk.push(src);
       }
       
       public static void dfs2(ArrayList<ArrayList<Integer>> revGraph, int src, boolean[] visited)
       {
           visited[src]=true;
           ArrayList<Integer> list = revGraph.get(src);
           for(int x: list)
           {
               if(visited[x]==false)
               dfs2(revGraph,x, visited);
           }
           
       }
}
 */
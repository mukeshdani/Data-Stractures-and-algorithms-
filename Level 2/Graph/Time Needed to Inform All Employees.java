//Time Needed to Inform All Employees
class Solution {
    class pair{
        int nbr ;
        int wt ;
        pair(int nbr , int wt){
            this.nbr = nbr ;
            this.wt = wt;
        }
    }
     
     class Graph {
         ArrayList<pair>[] adj;
         Graph(int n ){
             adj = new ArrayList[n];
             for(int i = 0 ; i< n ; i++){
                 adj[i]= new ArrayList<>();
             }
         }
         
         public void addEdge(int src , int nbr , int wt ){
             adj[src].add(new pair(nbr,wt));
         }
     }
     
     public int DFS(int src , int time , Graph g ){
         int maxTime = time ;
         for(pair p : g.adj[src]){
             maxTime = Math.max(maxTime , DFS(p.nbr , time + p.wt , g));
         }
         return maxTime;
     }
     
     public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
         Graph g = new Graph(n);
         
      int time = 0 ;
         
         for( int  i = 0 ; i <n ; i++){
             if(manager[i] == -1 ){
                 time = informTime[i];
             }else {
                 g.addEdge(manager[i] , i, informTime[i]);
             }
         }
         return DFS(headID , time , g);
     }
 }
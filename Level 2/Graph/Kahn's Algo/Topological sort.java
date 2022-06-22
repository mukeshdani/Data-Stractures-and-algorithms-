/* //Topological sort
//
//https://practice.geeksforgeeks.org/problems/topological-sort/1

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] tsort = new int[V];
        
        int[] inDegree = new int[V];
        for(int v = 0; v < V; v++){
            for(int n: adj.get(v)){
                inDegree[n]++;
            }
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int v = 0; v < V; v++){
            if(inDegree[v] == 0){
                queue.add(v);
            }
        }
        
        int idx = 0;
        while(queue.size() > 0){
            int v = queue.remove();
            tsort[idx++] = v;
            
            for(int n: adj.get(v)){
                inDegree[n]--;
                if(inDegree[n] == 0){
                    queue.add(n);
                }
            }
        }
        if(idx<V){
            return new int []{};
        }
        return tsort;
    }
} */
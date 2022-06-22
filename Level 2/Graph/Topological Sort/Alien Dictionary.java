/* //Alien Dictionary
//https://practice.geeksforgeeks.org/problems/alien-dictionary/1/



class Solution
{
    
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<Integer>[] graph = (ArrayList<Integer>[])new ArrayList[K];
        for(int i = 0; i < K; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < dict.length - 1; i++){
            String word1 = dict[i];
            String word2 = dict[i + 1];
            
            for(int j = 0; j < Math.min(word1.length(), word2.length()); j++){
                char ch1 = word1.charAt(j);
                char ch2 = word2.charAt(j);
                
                if(ch1 != ch2){
                    graph[ch1 - 'a'].add(ch2 - 'a');
                    break;
                }
            }
        }
        
        boolean[] vis = new boolean[K];
        Stack<Integer> st = new Stack<>();
        
        
        for(int i = 0; i < K; i++){
            if(!vis[i]){
                tsort(graph, vis, st, i);
            }
        }
     
        String ans = "";
        while(st.size() > 0){
            ans += (char)(st.pop() + 'a');
        }
    
        
        return ans;
    }
    
    public void tsort(ArrayList<Integer>[] graph, boolean[] vis, Stack<Integer> st, int v){
        vis[v] = true;
        for(int n: graph[v]){
            if(!vis[n]){
                tsort(graph, vis, st, n);
            }
        }
        
        st.push(v);
    }
} */
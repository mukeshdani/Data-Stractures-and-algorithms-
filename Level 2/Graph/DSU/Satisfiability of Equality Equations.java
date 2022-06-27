//Satisfiability of Equality Equations
//https://leetcode.com/problems/satisfiability-of-equality-equations/


class Solution {
    public boolean equationsPossible(String[] equations) {
        rank = new int[26];
        parent = new int[26];
        
        for(int i = 0; i < 26; i++){
            parent[i] = i;
            rank[i] = 0;
        }
        
        for(String eqn: equations){
            if(eqn.charAt(1) == '='){
                char x = eqn.charAt(0);
                char y = eqn.charAt(3);
                
                if(x != y){
                    unionHelper(x - 'a', y - 'a');
                }
            }
        }
        
        for(String eqn: equations){
            if(eqn.charAt(1) == '!'){
                char x = eqn.charAt(0);
                char y = eqn.charAt(3);
                
                if(find(x - 'a') == find(y - 'a')){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    int[] rank;
    int[] parent;
    
    void unionHelper(int x, int y){
        int X = find(x);
        int Y = find(y);
        if(X != Y){
            union(X, Y);
        }
    }
    
    void union(int X, int Y){
        if(rank[X] < rank[Y]){
            parent[X] = Y;
        } else if(rank[Y] < rank[X]){
            parent[Y] = X;
        } else {
            parent[X] = Y;
            rank[Y]++;
        }
    }
    
    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        
        return parent[x];
    }
}
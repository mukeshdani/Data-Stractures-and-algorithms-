/* //shortest-bridge
//https://leetcode.com/problems/shortest-bridge/


class Solution {
    class Pair{
        int i ; 
        int j ; 
        int level;
        Pair(int i , int j , int level ){
            this.i  = i ; 
            this.j = j ;
            this.level = level;
        }
    }
    public int shortestBridge(int[][] grid) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        boolean found = false;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid.length ; j++){
                if(grid[i][j] == 1){
                    dfs(grid , visited , q , i , j);
                    found = true;
                    break;
                }
            }  
             if(found)break;
        }
        
        int dist = -1;
        boolean [][] visited2 = new boolean[grid.length][grid[0].length];
        while(q.size()>0){
            Pair rem = q.remove();
            
            if(visited2[rem.i][rem.j])continue;
            visited2[rem.i][rem.j] = true;
            
            if(grid[rem.i][rem.j] == 1){
                return rem.level - 1;
            }
            
            addN(grid , visited2 ,visited, q,  rem.i -1 , rem.j , rem.level +1);
            addN(grid , visited2 ,visited, q,  rem.i +1 , rem.j , rem.level +1);
            addN(grid , visited2 ,visited, q,  rem.i  , rem.j - 1, rem.level +1);
            addN(grid , visited2 ,visited,q,  rem.i  , rem.j + 1, rem.level +1);
        }
        
        return dist ;
    }
    
    public void addN(int[][] grid , boolean[][] visited2 ,boolean[][] visited ,ArrayDeque<Pair> q , int i , int j , int level ){
        if(i<0 || j<0||i>=grid.length || j>=grid[0].length )return; 
        else if(visited[i][j] == true)return;
        else if(grid[i][j] == 2)return;
        
        q.add(new Pair( i , j , level));
    }
    
    public void dfs(int[][] grid , boolean[][] visited ,ArrayDeque<Pair> q , int i , int j){
        if(i<0 || j<0||i>=grid.length || j>=grid[0].length || visited[i][j] || grid[i][j] != 1)return;
        
        visited[i][j] = true;
        q.add(new Pair(i ,j , 0));
          dfs(grid , visited , q , i-1 , j);
          dfs(grid , visited , q , i+1, j);
          dfs(grid , visited , q , i , j-1);
          dfs(grid , visited , q , i , j+1);
          grid[i][j] = 2;
    }
} */
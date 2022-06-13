//Rotting Oranges

//https://leetcode.com/problems/rotting-oranges/

class Solution {
    class pair{
        int x ;
        int y ;
        int t;
        pair(int x , int y , int t){
            this.x = x ;
            this.y  = y ;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        ArrayDeque<pair> queue = new ArrayDeque<>();
        int fresh = 0 ;
        int time = 0 ;
        
        for(int x =  0 ; x< grid.length ; x++){
            for(int y = 0 ; y<grid[0].length ; y++){
                if(grid[x][y] == 2){
                    queue.add(new pair(x,y,0));
                }else if(grid[x][y] == 1){
                    fresh++;
                }
            }
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        while(queue.size()>0){
            pair rem = queue.remove();
            
            if(visited[rem.x][rem.y] == true) continue;
            visited[rem.x][rem.y] = true;
            
            if(rem.t>time){
                time = rem.t;
            }
            
            if(grid[rem.x][rem.y] ==1){
                fresh--;
            }
            
            addN(rem.x+1 , rem.y , visited , rem.t+1 , grid , queue);
            addN(rem.x-1 , rem.y , visited , rem.t+1 , grid , queue);
            addN(rem.x , rem.y+1 , visited , rem.t+1 , grid , queue);
            addN(rem.x , rem.y-1 , visited , rem.t+1 , grid , queue);
            
        }
        
        if(fresh == 0){
            return time;
        }
        else return -1;
    }
    
    public void addN(int x , int y , boolean[][]visited ,int t, int[][] grid , ArrayDeque<pair> queue){
          if(x<0 || y<0 || x>=grid.length || y>=grid[0].length)
         {
             return;
         }
        else if(visited[x][y])return;
        else if(grid[x][y] == 0 )return ;
        
        queue.add(new pair(x,y,t));
        
        
    }
}
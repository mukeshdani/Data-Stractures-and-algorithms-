/* //https://leetcode.com/problems/coloring-a-border/submissions/

//BFS


class Solution {
    class Pair {
        int i ;
        int j ;
        boolean border ; 
        Pair(int i , int j){
            this.i = i ;
            this.j = j ;
        }
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        ArrayDeque<Pair> q = new ArrayDeque<>();
        
        Pair p = new Pair(row , col);
        p.border = isBorder(grid , row , col);
        q.add(p);
        
        ArrayList<Pair> res = new ArrayList<>();
        int originalColor = grid[row][col];
        
        while(q.size()>0){
            Pair rem = q.remove();
            
            if(visited[rem.i][rem.j])continue;
            visited[rem.i][rem.j] = true;
            
            res.add(rem);
            
            addN(grid , visited , q , originalColor , rem.i-1 , rem.j);
            addN(grid , visited , q , originalColor , rem.i+1 , rem.j);
            addN(grid , visited , q , originalColor , rem.i , rem.j-1);
            addN(grid , visited , q , originalColor , rem.i , rem.j+1);
        }
        for(Pair pair :res){
            if(pair.border == true ){
                grid[pair.i][pair.j] = color;
            }
        }
        
        return grid;
    }
    
    public void addN(int[][] grid, boolean[][] visited  ,ArrayDeque<Pair> q ,int originalColor , int i , int j  ){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || visited[i][j] == true || grid[i][j]!=originalColor){
            return;
        }
        
        Pair p = new Pair(i , j);
        p.border = isBorder(grid  , i , j);
        q.add(p);
    }
    
    public boolean isBorder(int [][] grid , int i , int j ){
        if(i==0)return true;
        else if(i==grid.length - 1)return true;
        else if(j==0)return true;
        else if(j==grid[0].length - 1)return true;
        else {
           int color = grid[i][j];
            if(grid[i-1][j] != color)return true;
            else if(grid[i+1][j] != color)return true;
            else if(grid[i][j-1] != color)return true;
            else if(grid[i][j+1] != color)return true;
            else return false ;
        }
    }
}



//DFS 

class Solution {
    static int [][]dir={{-1,0},{0,-1},{1,0},{0,1}};
    private int updateBorderColor(int[][] grid, int row, int col,int orig, int color,boolean[][]vis)
    {
        if(row>=grid.length||row<0||col>=grid[0].length||col<0||grid[row][col]!=orig)
            return -1;
        vis[row][col]=true;
        boolean isBorder=false;
        int originalVal=grid[row][col];
        for(int d=0;d<dir.length;d++)
        {
            int i=row+dir[d][0];
            int j=col+dir[d][1];
            if(i>=grid.length||i<0||j>=grid[0].length||j<0)
                isBorder=true;
            else if(!vis[i][j])
                {
                 int val=updateBorderColor(grid,i,j,originalVal,color,vis);
                if(val!=originalVal)
                    isBorder=true;
                }
        }
        if(isBorder)
            grid[row][col]=color;
        return originalVal;
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if(grid.length==0&&grid[0].length==0)
            return grid;
        boolean[][]vis=new boolean[grid.length][grid[0].length];
        updateBorderColor(grid,row,col,grid[row][col],color,vis);
        return grid;
    }
} */
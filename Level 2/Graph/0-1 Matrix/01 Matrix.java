//01 Matrix

//https://leetcode.com/problems/01-matrix/


// BFS Solution 

/* 
class Solution {
    class Pair {
        int i;
        int j;
        int level;
        
        Pair(int i, int j, int level){
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
    
    public int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    queue.add(new Pair(i, j, 0));
                }
            }
        }
        
        while(queue.size() > 0){
            Pair rem = queue.removeFirst();
            
            if(visited[rem.i][rem.j] == true){
                continue;
            }
            visited[rem.i][rem.j] = true;
            
            ans[rem.i][rem.j] = rem.level;
            
            addN(rem.i - 1, rem.j, rem.level + 1, mat, visited, queue);
            addN(rem.i + 1, rem.j, rem.level + 1, mat, visited, queue);
            addN(rem.i, rem.j - 1, rem.level + 1, mat, visited, queue);
            addN(rem.i, rem.j + 1, rem.level + 1, mat, visited, queue);
        }
        
        return ans;
    }
    
    void addN(int i, int j, int level, int[][] mat, boolean[][] visited, ArrayDeque<Pair> queue){
        if(i < 0 || j < 0 || i >= visited.length || j >= visited[0].length 
           || visited[i][j] == true || mat[i][j] == 0){
            return;
        }
        
        queue.add(new Pair(i, j, level));
    }
    
} */
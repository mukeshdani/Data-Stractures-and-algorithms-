//Snakes and Ladders
//https://leetcode.com/problems/snakes-and-ladders/
/* 
class Solution {
    
    public int snakesAndLadders(int[][] matrix) {
        //Step1 -> (convert 2D matrix To 1D Board)
        
        ArrayList<Integer> board = new ArrayList<>();
        board.add(0); // for 1 based indexing
        
        int level = 0 , cell = 1 ;
        for(int i = matrix.length -1 ; i>= 0 ; i--){
            if(level%2 ==0 ){
                //left to right
                for(int j = 0 ; j<matrix.length ; j++){
                    if(matrix[i][j] == -1){
                        board.add(cell);
                    }else {
                        board.add(matrix[i][j]);// snake to ladder
                    }cell++;
                }
            }else {
                //right to left 
                 for(int j = matrix.length -1 ; j>=0 ; j--){
                    if(matrix[i][j] == -1){
                        board.add(cell);
                    }else {
                        board.add(matrix[i][j]);// snake to ladder
                    }cell++;
                }
            }
            level++;
        }
        
        //Step2 -> convert 1D board to Adjacency list
        int size = matrix.length * matrix.length ;
        ArrayList<Integer>[] adj = new ArrayList[size + 1];
        
        for(cell = 1 ; cell <= size ; cell++){
            adj[cell] = new ArrayList<>();
            
            for(int d = 1 ; d<=6 && cell+d<=size ; d++){
                if(cell == board.get(cell+d))continue;//self loop
                adj[cell].add(board.get(cell + d));
            }
        }
        return BFS(adj);
    }
    //Step3 -> now find the sortest path on adj list 
    
    public class Pair{
        int src ;
        int dist;
        Pair(int src , int dist){
            this.src = src;
            this.dist = dist;
        }
    }
    
    public int BFS(ArrayList<Integer>[] adj){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1,0));
        
        int vis[] = new int [adj.length + 1];
        Arrays.fill(vis , -1);
        
        while(q.size()>0){
            Pair front = q.remove();
            
            if(vis[front.src]!=-1)continue;
            vis[front.src] = front.dist;
            
            for(Integer nbr :adj[front.src]){
                q.add(new Pair(nbr , front.dist + 1));
            }
            
        }
        return vis[adj.length -1];
    }
} */
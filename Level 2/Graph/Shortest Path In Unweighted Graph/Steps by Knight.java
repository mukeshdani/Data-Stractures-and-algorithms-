//Steps by Knight
//https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1


/* 
class Solution
{
    class Pair{
       int x;
       int y;
       Pair(){}
       Pair(int x, int y){
           this.x = x;
           this.y = y;
       }
   }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int n = N;
        int tx = TargetPos[0]-1 , ty = TargetPos[1] -1;
        int x1 = KnightPos[0]-1, y1 = KnightPos[1]-1;
        
        if(x1 == tx && y1 == ty)return 0;
        
       boolean[][] visited = new boolean[n][n];
        
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n ; j++){
                visited[i][j] = false ;
            }
        }
      int [][] co = {{2,-1},{2,1},{-2,-1},{-2,1},{-1,2},{1,2},{-1,-2},{1,-2}};
      Queue<Pair> q = new LinkedList<>();
      
        q.add(new Pair(x1,y1));
        visited[x1][y1] = true;
        int ans = 0 ;
        
        while(!q.isEmpty()){
            int size = q.size();
            ans++;
            while(size-->0){
                Pair pair = q.poll();
                for(int [] a:co){
                    int x = pair.x + a[0];
                    int y = pair.y + a[1];
                    if(x>=0 &&y>=0 && x<N && y<N && !visited[x][y]){
                        visited[x][y] = true;
                        q.add(new Pair(x,y));
                    }
                    if(x==tx && y==ty)return ans;
                }
            }
        }
        return ans;
    }
} */
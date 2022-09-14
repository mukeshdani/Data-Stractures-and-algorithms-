//N-Queens
//

import java.util.*;;
class Solution {
    
    public List <String> construct( char [][] board){
        List < String > res = new LinkedList<>();
        for(int i =  0 ; i< board.length ; i++){
            res.add(new String(board[i]));
        }
        
        return res;
    }
    
    public void DFS(int col , List<List<String>> ans , char [][] board ,int [] leftRow  ,int [] upperDiagonal , int [] lowerDiagonal  ){
        //base case 
        if(col == board.length){
            ans.add(construct(board));
            return;
        }
        
        for(int row = 0 ; row < board.length ; row++){
          if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                DFS(col + 1, ans ,board, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
        
    }
   
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        
        for(int i = 0 ; i< n ; i++)
            for(int j = 0 ; j< n ; j++)
                board[i][j] = '.';
        
        int [] leftRow = new int[n];
        int [] upperDiagonal = new int[2*n - 1];
        int [] lowerDiagonal = new int[2*n - 1];
        
        List<List<String>> ans = new ArrayList<List<String>>();
           DFS(0 , ans , board , leftRow , upperDiagonal , lowerDiagonal);
        return ans;
        
    }
}
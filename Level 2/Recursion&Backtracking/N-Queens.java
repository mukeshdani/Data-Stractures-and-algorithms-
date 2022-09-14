//N-Queens


//https://leetcode.com/problems/n-queens/

import java.util.*;
class Solution {
    
    public List <String> construct( char [][] board){
        List < String > res = new LinkedList<>();
        for(int i =  0 ; i< board.length ; i++){
            res.add(new String(board[i]));
        }
        
        return res;
    }
    
    public void DFS(int col , List<List<String>> ans , char [][] board ){
        //base case 
        if(col == board.length){
            ans.add(construct(board));
            return;
        }
        
        for(int row = 0 ; row < board.length ; row++){
            if (validate(board, row, col)){
                board[row][col] = 'Q';
                DFS(col + 1, ans , board);
                board[row][col] = '.';
            }
        }
        
    }
    public boolean validate(char [][] board , int row , int col){
        int oldRow = row ;
        int oldCol = col ;
        while(row>=0 && col >= 0){
            if(board[row][col] == 'Q')return false;
            col--;
            row--;
        }
        
        row = oldRow;
        col = oldCol;
        
        while(col>=0){
            if(board[row][col] =='Q')return false;
            col--;
        }
        
        row = oldRow ;
        col = oldCol ;
        
        while(col >= 0 && row < board.length){
            if(board[row][col] == 'Q')return false;
            col--;
            row++;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        
        for(int i = 0 ; i< n ; i++)
            for(int j = 0 ; j< n ; j++)
                board[i][j] = '.';
        
        List<List<String>> ans = new ArrayList<List<String>>();
           DFS(0 , ans , board );
        return ans;
        
    }
}
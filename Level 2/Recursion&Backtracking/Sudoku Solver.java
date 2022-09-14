//Sudoku Solver
//https://leetcode.com/problems/sudoku-solver/

import java.util.*;

class Solution {
    public boolean isValid(char [][] board , int row, int col , char c){
        for(int i = 0 ; i<9 ; i++){
            if(board[i][col] == c)return false;
            if(board[row][i] == c) return false;
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
    public boolean solveSuduku(char[][] board){
        for(int i = 0 ; i< 9; i++){
            for(int j = 0 ; j < 9 ; j++ ){
                if(board[i][j] =='.'){
                    for(char c = '1' ; c <= '9' ; c++){
                        if(isValid(board , i , j , c)){
                            board[i][j] = c;
                            if(solveSuduku(board))return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solveSuduku(board);
    }
}
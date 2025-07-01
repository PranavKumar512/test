package rec;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        solveNQueens(5);
    }

    public static void solveNQueens(int n) {

        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, board, solutions);
        printSolutions(solutions);


    }
    public static void  printSolutions(List<List<String>> solutions) {

        int count = 1;
        for(List<String> sol: solutions) {
            System.out.println("Solution " + count++ + ":");
            for(String row: sol) {
                System.out.println(row);
            }
            System.out.println();
        }


    }

    public static void solve(int row, char[][] board, List<List<String>> solutions) {
        int n = board.length;

        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        for( int col = 0; col < n; col++) {
            if(isSafe(board, row , col)) {
                board[row][col] = 'Q';
                solve(row+1, board, solutions);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> construct (char[][] board) {
        List<String> res = new ArrayList<>();

        for(char[] row : board) {
           res.add(new String(row));
        }
        return  res;
    }

    public static boolean isSafe(char[][] board,int row, int col) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
           if(board[i][col] == 'Q') return false;
        }

        for(int i = row-1, j = col-1; i >= 0 && j >= 0 ; i--, j--) {
            if(board[i][j] == 'Q') return  false;

        }
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++ ){
            if(board[i][j] == 'Q') return  false;
        }
        return  true;
    }
}

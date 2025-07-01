package recursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
    int n = 5;
    List<List<String>> solutions = solveNQueens(n);
    printSolutions(solutions);
    }

    private static void printSolutions(List<List<String>> solutions) {
        int count = 1;
        for (List<String> sol: solutions) {
            System.out.println("Solution" + count++ + ":");
            for(String row: sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, board, result);
        return result;

    }

    public static void solve(int row, char[][] board, List<List<String>> result) {
        int n = board.length;

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(row+1, board, result);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }

        return res;
    }

    public static  boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        for(int i = 0; i< row; i++) {
            if (board[i][col]  == 'Q') return  false;
        }
        for(int i = row-1, j = col -1 ; i >= 0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        for  (int i = row-1, j = col+1; i>=0 && j<n; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }
        return true;

    }

}



import java.util.*;
public class nQueens{
    List<List<String>> result = new ArrayList<>();
    boolean[] cols, diag1, diag2;

    public List<List<String>> solveNQueen(int n){
        cols = new boolean[n];
        diag1 = new boolean[2*n - 1];
        diag2 = new boolean[2*n - 1];

        char[][] board = new char[n][n];
        for(char[] row: board){
            Arrays.fill(row, '.');
        }
        backtrack(0, n, board);
        return result;
    }

    public void backtrack(int row, int n, char[][] board){
        if(row == n){
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            int d1 = row - col + n - 1;
            int d2 = row + col;

            if(cols[col] || diag1[d1] || diag2[d2]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;
            backtrack(row + 1, n, board);
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false; 
        }
    }

    public List<String> construct(char[][] board){
        List<String> ans = new ArrayList<>();
        for(char[] row : board){
            ans.add(new String(row));
        }

        return ans;
    }
}
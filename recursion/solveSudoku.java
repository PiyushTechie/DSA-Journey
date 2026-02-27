public class solveSudoku {
    public void solveSudokuBoard(int[][] board){
        solve(board);
    }

    public boolean solve(int[][] board){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == 0){
                    for(int num = 0; num <= 9; num++){
                      if(isValid(board, row, col, num)){
                        board[row][col] = num;

                        if(solve(board)) return true;

                        board[row][col] = 0;
                        }
                    }
                return false;
                }
            }
        }

        return true;
    }

    public boolean isValid(int[][] board, int row, int col, int num){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == num) return false;
            if(board[i][col] == num) return false;

            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if(board[boxRow][boxCol] == num) return false;
        }
        return true;
    } 
}

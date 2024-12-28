public class SurroundedRegions {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                helper(board, i, 0);
            }

            if (board[i][board[i].length - 1] == 'O') {
                helper(board, i, board[i].length - 1);
            }
        }
        for (int j = 1; j < board[0].length - 1; j++) {
            if (board[0][j] == 'O') {
                helper(board, 0, j);
            }

            if (board[board.length - 1][j] == 'O') {
                helper(board, board.length - 1, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'H') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void helper(char[][] board, int row, int col) {
        if (row >= board.length || row < 0 || col >= board[0].length || col < 0 || board[row][col] != 'O') {
            return;
        }
        board[row][col] = 'H';

        helper(board, row - 1, col);
        helper(board, row + 1, col);
        helper(board, row, col - 1);
        helper(board, row, col + 1);
    }
}

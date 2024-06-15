public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] copy = new int[board.length + 2][board[0].length + 2];

        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, copy[i + 1], 1, board[0].length);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int test = helper(copy, i + 1, j + 1);
                if (test < 2 || test > 3) {
                    board[i][j] = 0;
                } else if (test == 3 && copy[i + 1][j + 1] == 0) {
                    board[i][j] = 1;
                }
            }
        }

    }


    public int helper(int[][] copy, int i, int j) {
        int sum = 0;
        if (copy[i - 1][j - 1] == 1) {
            sum++;
        }
        if (copy[i - 1][j] == 1) {
            sum++;
        }
        if (copy[i - 1][j + 1] == 1) {
            sum++;
        }

        if (copy[i][j - 1] == 1) {
            sum++;
        }

        if (copy[i][j + 1] == 1) {
            sum++;
        }

        if (copy[i + 1][j - 1] == 1) {
            sum++;
        }
        if (copy[i + 1][j] == 1) {
            sum++;
        }

        if (copy[i + 1][j + 1] == 1) {
            sum++;
        }
        return sum;
    }
}

import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //boolean flag = true;



        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i])) {
                        return false;
                    } else {
                        set.add(board[j][i]);
                    }
                }
            }
        }

        return helper(board, 0, 3, 0, 3) && helper(board, 0, 3, 3, 6)
                && helper(board, 0, 3, 6, 9)
                && helper(board, 3, 6, 0, 3) && helper(board, 3, 6, 3, 6)
                && helper(board, 3, 6, 6, 9)
                && helper(board, 6, 9, 0, 3) && helper(board, 6, 9, 3, 6)
                && helper(board, 6, 9, 6, 9);



    }

    public boolean helper(char[][] board, int sr, int er, int sc, int ec) {
        Set<Character> set = new HashSet<>();
        for (int i = sr; i < er; i++) {
            for (int j = sc; j < ec; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}

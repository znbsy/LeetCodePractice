public class WordSearch {
    boolean f = false;
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                helper(board, word, i, j, "", new boolean[board.length][board[0].length]);
            }
        }

        return f;
    }

    public void helper(char[][] board, String word, int row, int col, String curr, boolean[][] flag) {
        //System.out.println(curr);
        if (curr.length() > word.length()) return;
        //System.out.println(curr + " " + row + " " + col);
        if (row >= board.length|| row < 0 || col >= board[0].length || col < 0) return;
        if (board[row][col] != word.charAt(curr.length())) return;
        // System.out.println(curr);
        if (flag[row][col]) return;
        if ((curr + board[row][col]).equals(word)) {
            f = true;
            return;
        }


        flag[row][col] = true;
        helper(board, word, row + 1, col, curr + board[row][col], flag);
        //if (f) return;
        helper(board, word, row - 1, col, curr + board[row][col], flag);
        //if (f) return;
        helper(board, word, row, col + 1, curr + board[row][col], flag);
        //if (f) return;
        helper(board, word, row, col - 1, curr + board[row][col], flag);
        flag[row][col] = false;
    }
    public static void main(String[] args) {
        WordSearch solution = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}
        };
//        char[][] board = {
//                {'a', 'b'},
//                {'c', 'd'}
//        };
//        char[][] board = {
//                {'A'}
//
//        };
        System.out.println(solution.exist(board, "ABCESEEEFS"));
    }
}
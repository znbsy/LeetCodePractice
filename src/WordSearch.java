public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (helper(board, word, i, j, 0, new boolean[board.length][board[0].length])) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, String word, int row, int col, int index, boolean[][] flag) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;
        if (flag[row][col] || board[row][col] != word.charAt(index)) return false;

        flag[row][col] = true;

        boolean result = helper(board, word, row + 1, col, index + 1, flag) ||
                helper(board, word, row - 1, col, index + 1, flag) ||
                helper(board, word, row, col + 1, index + 1, flag) ||
                helper(board, word, row, col - 1, index + 1, flag);

        flag[row][col] = false;
        return result;
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
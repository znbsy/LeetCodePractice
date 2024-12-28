import java.util.*;
public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);  // start from the first cell
        visited[0] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int pos = queue.poll();
                if (pos == n * n - 1) {
                    return moves;  // reached the last cell
                }

                for (int dice = 1; dice <= 6; dice++) {
                    int nextPos = pos + dice;
                    if (nextPos >= n * n) {
                        break;  // stay within bounds
                    }

                    int[] coords = getCoordinates(nextPos, n);
                    int nextRow = coords[0];
                    int nextCol = coords[1];

                    if (board[nextRow][nextCol] != -1) {
                        nextPos = board[nextRow][nextCol] - 1;  // follow snake or ladder
                    }

                    if (!visited[nextPos]) {
                        visited[nextPos] = true;
                        queue.offer(nextPos);
                    }
                }
            }
            moves++;
        }
        return -1;  // not reachable
    }

    private int[] getCoordinates(int pos, int n) {
        int row = n - 1 - pos / n;
        int col = pos % n;
        if ((row + n) % 2 == 0) {
            col = n - 1 - col;
        }
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        SnakesAndLadders s = new SnakesAndLadders();
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        System.out.println(s.snakesAndLadders(board));
    }


}

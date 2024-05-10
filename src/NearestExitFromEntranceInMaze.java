import java.util.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {entrance[0], entrance[1], 0});

        while (!queue.isEmpty()) {
            int[] curr = queue.remove();
            int row = curr[0];
            int col = curr[1];
            if (maze[row][col] == '.') {
                if (row != entrance[0] || col != entrance[1]) {
                    if (row == 0 || col == 0 || row == maze.length - 1 || col == maze[0].length - 1) {
                        return curr[2];
                    }
                }

                maze[row][col] =  '+';
                if (row + 1 < maze.length) {
//                     && maze[row + 1][col] == '.'
                    queue.add(new int[] {row + 1, col, curr[2] + 1});
                }

                if (col + 1 < maze[0].length) {
//                    && maze[row][col + 1] == '.'
                    queue.add(new int[] {row, col + 1, curr[2] + 1});
                }

                if (row - 1 >= 0) {
//                    && maze[row - 1][col] == '.'
                    queue.add(new int[] {row - 1, col, curr[2] + 1});
                }

                if (col - 1 >= 0) {
//                    && maze[row][col - 1] == '.'
                    queue.add(new int[] {row, col - 1, curr[2] + 1});
                }
            }

        }

        return -1;



    }



}

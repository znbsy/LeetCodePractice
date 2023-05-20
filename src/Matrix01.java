import java.util.ArrayList;
import java.util.List;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = findZero(mat,i , j);
            }
        }


        return mat;
    }
    public static int findZero (int[][] mat, int row, int col) {

        int count = 0;
        List<List<Integer>> queue = new ArrayList<>();
        queue.add(List.of(row, col));
        while (!queue.isEmpty()) {
            List<Integer> curr = queue.remove(0);
            if (row < 0 || row >= mat.length || col < 0 || col >= mat[0].length) {
                continue;
            } else if (mat[row][col] == 0) {
                return count;
            } else {
                queue.add(List.of(row + 1, col));
                queue.add(List.of(row - 1, col));
                queue.add(List.of(row, col + 1));
                queue.add(List.of(row, col - 1));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int [][] result = updateMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}

import java.util.*;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int init = image[sr][sc];
        List<List<Integer>> queue = new ArrayList<>();

        queue.add(List.of(sr,sc));

        while (queue.size() != 0) {
            List<Integer> curr = queue.remove(queue.size() - 1);
            int row = curr.get(0);
            int col = curr.get(1);

            if (image[row][col] == init) {
                image[row][col] = color;

                if (row - 1 >= 0) {
                    queue.add(List.of(row - 1, col));
                }
                if (col - 1 >= 0) {
                    queue.add(List.of(row, col - 1));
                }
                if (row + 1 < image.length) {
                    queue.add(List.of(row + 1, col));
                }
                if (col + 1 < image[0].length) {
                    queue.add(List.of(row, col + 1));
                }
            }

        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

       int [][] result = floodFill(image,1, 1, 2);

       for (int i = 0; i < result.length; i++) {
           for (int j = 0; j < result[0].length; j++) {
               System.out.print(result[i][j] + " ");

           }
           System.out.println();
       }
    }
}

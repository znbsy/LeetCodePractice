import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        int rlen = mat.length;
        int clen = mat[0].length;
        int [][] flag = new int[rlen][clen];
        List<List<Integer>> queue = new ArrayList<>();
        for (int i = 0; i < rlen; i++) {
            for (int j = 0; j < clen; j++) {
                if (mat[i][j] == 0) {
                    flag[i][j] = 0;
                    queue.add(List.of(i, j));
                } else {
                    flag[i][j] = -1;
                }
            }
        }



        while (!queue.isEmpty()) {
            List<Integer> curr = queue.remove(0);
            int sr = curr.get(0);
            int sc = curr.get(1);


            if (sr + 1 < rlen &&flag[sr + 1][sc] == -1) {
                queue.add(List.of(sr + 1, sc));
                flag[sr + 1][sc] = flag[sr][sc] + 1;
            }
            if (sr - 1 >= 0 && flag[sr - 1][sc] == -1 ) {
                queue.add(List.of(sr - 1, sc));
                flag[sr - 1][sc] = flag[sr][sc] + 1;
            }

            if (sc + 1 < clen && flag[sr][sc + 1] == -1) {
                queue.add(List.of(sr, sc + 1));
                flag[sr][sc + 1] = flag[sr][sc] + 1;
            }

            if (sc - 1 >= 0 && flag[sr][sc - 1] == -1) {
                queue.add(List.of(sr, sc - 1));
                flag[sr][sc - 1] = flag[sr][sc] + 1;
            }
        }
        return flag;
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
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

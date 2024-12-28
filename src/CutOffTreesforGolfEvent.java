import java.util.*;

public class CutOffTreesforGolfEvent {
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    public int cutOffTree(List<List<Integer>> forest) {
        int n = forest.size();
        int m = forest.get(0).size();
        List<int[]> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int curr = forest.get(i).get(j);
                if (curr > 1) {
                    tree.add(new int[]{curr, i, j});
                }
            }
        }

        Collections.sort(tree, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        int row = 0;
        int col = 0;
        for (var t: tree) {
            int dist = helper(forest, row, col, t[1], t[2]);
            if (dist < 0) {
                return -1;
            }
            ans += dist;
            row = t[1];
            col = t[2];
        }

        return ans;

    }

    public int helper(List<List<Integer>>forest, int sr, int sc, int er, int ec) {
        int n = forest.size();
        int m = forest.get(0).size();

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc, 0});
        boolean[][] flag = new boolean[n][m];
        flag[sr][sc] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            if (row == er && col == ec) {
                return curr[2];
            }
            for (int i = 0; i < 4; i++) {
                int r = row + dr[i];
                int c = col + dc[i];
                if (0 <= r && r < n && 0 <= c && c < m
                        && !flag[r][c] && forest.get(r).get(c) != 0) {
                    flag[r][c] = true;
                    queue.add(new int[]{r, c, curr[2] + 1});

                }
            }
        }
        return -1;
    }
}

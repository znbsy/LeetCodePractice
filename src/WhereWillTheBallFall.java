import java.util.Arrays;

public class WhereWillTheBallFall {
    public static int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] flag = new boolean[m][n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            while (row < m && row >= 0 && col < n && col >= 0) {
                if (flag[row][col]) {
                    ans[i] = -1;
                    break;
                }
                if (grid[row][col] == 1 ) {
                    if (col + 1 >= n || grid[row][col + 1] == -1) {
                        ans[i] = -1;
                        flag[row][col] = true;
                        break;
                    } else {
                        row++;
                        col++;
                    }
                } else {
                    if (col - 1 < 0 || grid[row][col - 1] == 1) {
                        ans[i] = -1;
                        flag[row][col] = true;
                        break;
                    } else {
                        row++;
                        col--;
                    }
                }
            }
            if (row >= m) {
                ans[i] = col;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] image1 = {
                {1,1,1,-1,-1},
                {1,1,1,-1,-1},
                {-1,-1,-1,1,1},
                {1,1,1,1,-1},
                {-1,-1,-1,-1,-1},
        };
        int[][] image2 = {
                {1,1,1,1,1,1},
                {-1,-1,-1,-1,-1,-1},
                {1,1,1,1,1,1},
                {-1,-1,-1,-1,-1,-1}
        };

       // System.out.println(Arrays.toString(findBall(image1)));
        System.out.println(Arrays.toString(findBall(image2)));
    }
}

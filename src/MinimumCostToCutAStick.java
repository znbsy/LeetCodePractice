import java.util.Arrays;

public class MinimumCostToCutAStick {
    static int[][] p;
    public static int minCost(int n, int[] cuts) {
        int m = cuts.length;
        p = new int[m + 2][m + 2];
        Arrays.sort(cuts);
        for (int i = 0; i < m + 2; i++) {
            for (int j = i; j < m + 2; j++) {
                p[i][j] = compute(i, j, cuts, n, m);
            }
        }
        return p[0][m + 1];
    }
    public static int compute (int left, int right, int[] cut, int n, int m) {
        if (left == right || left + 1 == right) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int fr;
        int rl;
        for (int i = left + 1; i < right; i++) {
            if (p[left][i] != 0) {
                fr = p[left][i];
            } else {
                fr = compute(left, i, cut, n, m);
                p[left][i] = fr;
            }
            if (p[i][right] != 0) {
                rl = p[i][right];
            } else {
                rl = compute(i, right, cut, n, m);
                p[i][right] = rl;
            }
            min = Math.min(min, fr + rl);
        }
        int l;
        int r;
        if (left == 0) {
            l = 0;
        } else {
            l = cut[left - 1];
        }
        if (right == m + 1) {
            r = n;
        } else if (right == 0) {
            r = 0;
        } else {
            r = cut[right - 1];
        }
        return min + r - l;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
        System.out.println(minCost(7, a));
    }
}

import java.util.Arrays;

public class SpiralMatrixIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        for (int[] a: arr) {
            Arrays.fill(a, -1);
        }
        int dir = 1;
        int i = 0;
        int j = 0;
        while (head != null) {
            if (dir == 1) {
                while (valid(m, n, i, j) && arr[i][j] == -1 && head != null) {
                    arr[i][j] = head.val;
                    j++;
                    head = head.next;
                }
                j--;
                i++;
                dir = 2;
            } else if (dir == 2) {
                while (valid(m, n, i, j) && arr[i][j] == -1 && head != null) {
                    arr[i][j] = head.val;
                    i++;
                    head = head.next;
                }
                i--;
                j--;
                dir = 3;
            } else if (dir == 3) {
                while (valid(m, n, i, j) && arr[i][j] == -1 && head != null) {
                    arr[i][j] = head.val;
                    j--;
                    head = head.next;
                }
                j++;
                i--;
                dir = 4;
            } else {
                while (valid(m, n, i, j) && arr[i][j] == -1 && head != null) {
                    arr[i][j] = head.val;
                    i--;
                    head = head.next;
                }
                i++;
                j++;
                dir = 1;
            }

        }
        return arr;
    }
    public boolean valid(int m, int n, int i, int j) {
        return  i >= 0 && i < m && j >= 0 && j < n;
    }
}

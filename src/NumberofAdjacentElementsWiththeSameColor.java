import java.util.Arrays;

public class NumberofAdjacentElementsWiththeSameColor {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] color = new int[n];
        int count = 0;
        int i = 0;

        for (var query : queries) {
            int pos = query[0];
            int curr = query[1];
            if (color[pos] != 0) {
                if (pos - 1 >= 0 && color[pos] == color[pos - 1]) {
                    count--;
                }
                if (pos + 1 < n && color[pos] == color[pos + 1]) {
                    count--;
                }
            }

            color[pos] = curr;

            if (pos -1 >= 0 && color[pos] == color[pos - 1]) {
                count++;
            }
            if (pos + 1 < n && color[pos] == color[pos + 1]) {
                count++;
            }

            ans[i] = count;
            i++;
        }
        return ans;

    }

    public static void main(String[] args) {
        NumberofAdjacentElementsWiththeSameColor obj = new NumberofAdjacentElementsWiththeSameColor();
        int[][] queries = {
                {0, 2},
                {1, 2},
                {3, 1},
                {1, 1},
                {2, 1}
        };
        System.out.println(Arrays.toString(obj.colorTheArray(4, queries)));
    }
}

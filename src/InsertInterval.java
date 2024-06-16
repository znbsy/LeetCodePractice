import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] temp = new int[intervals.length + 1][2];

        System.arraycopy(intervals, 0, temp, 0, intervals.length);
        temp[intervals.length] = newInterval;

        Arrays.sort(temp, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int start = temp[0][0], end = temp[0][1];

        for (int i = 1; i < temp.length; i++) {
            if (temp[i][0] <= end) {
                end = Math.max(end, temp[i][1]);
            } else {
                res.add(new int[]{start, end});
                start = temp[i][0];
                end = temp[i][1];
            }
        }
        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);



    }
}

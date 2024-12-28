import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] <= newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            i++;
        }
        res.add(newInterval);

        while (i < intervals.length) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);




    }
}

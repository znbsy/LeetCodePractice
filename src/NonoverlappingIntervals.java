import java.util.Arrays;
import java.util.Comparator;

public class NonoverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));


        int end = intervals[0][1];
        int count = 0;


        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end ) {
                if (intervals[i][1] <= end) {
                    end = intervals[i][1];
                }
                count++;

            } else {
                end = intervals[i][1];
            }
        }
        return count;

    }
}

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));
        int count = 0;
        for (int i = boxTypes.length - 1; i >= 0; i--) {
            if (truckSize <= 0) {
                break;
            }
            if (truckSize >= boxTypes[i][0]) {
                truckSize -= boxTypes[i][0];
                count += boxTypes[i][1] * boxTypes[i][0];
            } else {
                count += boxTypes[i][1] * truckSize;
                truckSize = 0;
            }

        }
        return count;
    }
}

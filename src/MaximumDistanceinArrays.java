import java.util.*;
public class MaximumDistanceinArrays {

    public int maxDistance(List<List<Integer>> arrays) {
        // List<Integer> low = new ArrayList<>();
        // List<Integer> high = new ArrayList<>();
        int low1 = Integer.MAX_VALUE;
        int low2 = Integer.MAX_VALUE;
        int l1 = -1;
        int l2 = -1;
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        int h1 = -1;
        int h2 = -1;

        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> arr = arrays.get(i);
            if (arr.get(0) < low1) {
                low2 = low1;
                low1 = arr.get(0);
                l2 = l1;
                l1 = i;

            } else if (arr.get(0) < low2) {
                low2 = arr.get(0);
                l2 = i;
            }

            if (arr.get(arr.size() - 1) > high1) {
                high2 = high1;
                high1 = arr.get(arr.size() - 1);
                h2 = h1;
                h1 = i;

            } else if (arr.get(arr.size() - 1) > high2) {
                high2 = arr.get(arr.size() - 1);
                h2 = i;
            }
        }

        // System.out.println(h1 + " " + l1);
        // System.out.println(h2 + " " + l2);
        if (l1 != h1) {
            return high1 - low1;
        } else {
            return Math.max(high2 - low1, high1 - low2);
        }


    }
}

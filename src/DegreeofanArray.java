import java.util.*;
public class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                int[] curr = new int[3];
                curr[0] = 1;
                curr[1] = i;
                curr[2] = i;
                map.put(nums[i], curr);
            }
        }

        List<Integer> a = new ArrayList<>();

        a = map.keySet().stream()
                .sorted((k1, k2) -> {
                    int[] curr1 = map.get(k1);
                    int[] curr2 = map.get(k2);

                    if (curr1[0] != curr2[0]) {
                        return Integer.compare(curr2[0], curr1[0]);
                    }
                    int diff1 = curr1[2] - curr1[1];
                    int diff2 = curr2[2] - curr2[1];
                    return Integer.compare(diff1, diff2);
                }).toList();
        return map.get(a.get(0))[2] - map.get(a.get(0))[1] + 1;
    }
}

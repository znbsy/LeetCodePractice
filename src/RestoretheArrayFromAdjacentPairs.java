import java.util.*;

public class RestoretheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] pair : adjacentPairs) {
            if (!map.containsKey(pair[0])) {
                map.put(pair[0], new ArrayList<>());
            }
            map.get(pair[0]).add(pair[1]);

            if (!map.containsKey(pair[1])) {
                map.put(pair[1], new ArrayList<>());
            }
            map.get(pair[1]).add(pair[0]);

        }

        int[] ans = new int[map.size()];


        for (var k: map.keySet()) {
            if (map.get(k).size() == 1) {
                ans[0] = k;
                int val = map.get(k).get(0);
                map.get(val).remove(k);
                break;
            }
        }
        for (int i = 1; i < ans.length; i++) {
            ans[i] = map.get(ans[i - 1]).get(0);
            if (!map.get(ans[i]).isEmpty()) {
                int val = map.get(ans[i]).get(0);
                map.get(val).remove(Integer.valueOf(ans[i]));
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        RestoretheArrayFromAdjacentPairs r = new RestoretheArrayFromAdjacentPairs();
        int[][] input = {
                {2, 1},
                {3, 4},
                {3, 2}
        };
        System.out.println(Arrays.toString(r.restoreArray(input)));
    }
}

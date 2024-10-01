import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        return map.keySet().stream()
                .sorted((k1, k2) -> -map.get(k1).compareTo(map.get(k2)))
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

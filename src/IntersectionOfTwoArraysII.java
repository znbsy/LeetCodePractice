import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> p = new ArrayList<>();
        for (int num: nums2) {
            if (map.containsKey(num)) {
                p.add(num);
                int val = map.get(num);
                if (val == 1) {
                    map.remove(num);
                } else {
                    map.put(num, val - 1);
                }
            }
        }
        int[] ans = new int[p.size()];
        for (int i = 0; i < p.size(); i++) {
            ans[i] = p.get(i);
        }
        return ans;
    }
}

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            if (!map.containsKey(i)) {
                if (1 > nums.length / 2) {
                    return i;
                }
                map.put(i, 1);
            } else {
                int curr = map.get(i) + 1;
                if (curr > nums.length / 2) {
                    return i;
                } else {
                    map.put(i, curr);
                }
            }

        }
        return -1;
    }
}

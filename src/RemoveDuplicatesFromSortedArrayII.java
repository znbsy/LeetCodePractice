import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int dup = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                if (freq >= 2) {
                    dup++;
                } else {
                    map.put(nums[i], freq + 1);
                    nums[i - dup] = nums[i];
                }

            } else {
                map.put(nums[i], 1);
                nums[i - dup] = nums[i];
            }
        }
        return nums.length - dup;
    }
}

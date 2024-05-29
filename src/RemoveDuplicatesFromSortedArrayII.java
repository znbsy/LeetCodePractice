import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int dup = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[i - dup] = nums[i];
            } else {
                dup++;
            }

        }
        return nums.length - dup;
    }
}

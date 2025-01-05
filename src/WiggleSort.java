import java.util.*;
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int[] copy = Arrays.copyOf(nums, nums.length);

        Arrays.sort(copy);
        int count = 0;

        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = copy[count];
            if (i + 1 < copy.length) {
                nums[i + 1] = copy[copy.length - count - 1];
            }
            count++;
        }
    }
}

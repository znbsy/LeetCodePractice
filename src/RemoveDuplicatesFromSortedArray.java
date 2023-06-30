import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int idx = -1;

        if (nums.length == 1) {
            return 1;
        }


        for (int i = 1; i < nums.length; i++) {
            if (curr != nums[i]) {
                curr = nums[i];
                if (idx != -1) {
                    nums[idx++] = nums[i];
                }
            } else {
                if (idx == -1) {
                    idx = i;
                }

            }

        }

        if (idx == -1) {
            return nums.length;
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}

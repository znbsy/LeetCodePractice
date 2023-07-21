import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= k && i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        for (int i = k + 1; i < nums.length; i++) {
            set.remove(nums[i - k - 1]);
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 0 , 1, 1};
        System.out.println(containsNearbyDuplicate(arr, 1));
    }
}

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};

        int end = helper_r(nums, target);
        int begin = helper_l(nums, target);

        return new int[]{begin, end};

    }

    public int helper_l (int[] nums, int target) {
        int left = 0, right = nums.length -1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = (left + right) / 2;
        }
        if (left < nums.length && nums[left] == target) {
            return left;
        }

        return -1;
    }

    public int helper_r (int[] nums, int target) {
        int left = 0, right = nums.length -1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = (left + right) / 2;
        }
        if (right >= 0 && nums[right] == target) {
            return right;
        }

        return -1;
    }
}

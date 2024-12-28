public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
            mid = (left + right) / 2;
        }


        return -1;
    }
}

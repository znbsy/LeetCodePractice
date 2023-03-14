public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{-1, 0, 3, 5, 9, 12};
        int[] nums2 = new int[]{5};
        int[] nums3 = new int[]{2, 5};
        System.out.println(searchInsert(nums1, 4));
        System.out.println(searchInsert(nums1, 13));
        System.out.println(searchInsert(nums1, 8));
        System.out.println(searchInsert(nums2, 6));
        System.out.println(searchInsert(nums2, 1));
        System.out.println(searchInsert(nums3, 0));
    }
}

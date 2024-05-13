public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = left + (right - left) / 2;


        while (left <= right) {
            System.out.println(mid);


            if (mid - 1 == -1 || nums[mid] > nums[mid - 1]) {
                if (mid + 1 == n ||nums[mid] > nums[mid + 1]) {
                    return mid;
                } else {
                    // System.out.println("emmmm");
                    left = mid + 1;
                }
            } else {
                // System.out.println("haha");
                right = mid - 1;
            }

            mid = left + (right - left) / 2;

        }

        return mid;


    }
}

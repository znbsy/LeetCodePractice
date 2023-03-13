public class BinarySearch {
    public static int search(int[] nums, int target) {
        int begin = 0;
        int last = nums.length - 1;
        int mid = last / 2;
        while (begin <= last){
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                begin = mid + 1;
                mid =  (begin + last) / 2;
            }
            else {
                last = mid - 1;
                mid =  (begin + last) / 2;
            }
        }

//        if (nums[mid] == target){
//            return mid;
//        }
//        if (nums[begin] == target){
//            return begin;
//        }
//        if (nums[last] == target){
//            return last;
//        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{-1, 0, 3, 5, 9, 12};
        int[] nums2 = new int[]{5};
        int[] nums3 = new int[]{2, 5};
        System.out.println(search(nums1, 0));
        System.out.println(search(nums2, 0));
        System.out.println(search(nums2, 5));
        System.out.println(search(nums3, 5));
    }
}


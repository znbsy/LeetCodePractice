import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mid1 = (m + n) % 2 == 0 ? (m + n) / 2 - 1 : (m + n) / 2;
        int mid2 = mid1 + 1;

        int count = 0;
        int idx1 = 0;
        int idx2 = 0;
        double ans1 = Integer.MAX_VALUE;
        double ans2 = Integer.MAX_VALUE;


        while (idx1 < m && idx2 < n) {

            if (nums1[idx1] > nums2[idx2]) {
                if (count == mid1) {
                    ans1 = nums2[idx2];
                    if ((m + n) % 2 != 0) {
                        break;
                    }
                }
                if (count == mid2) {
                    ans2 = nums2[idx2];
                    break;
                }
                idx2++;
            } else {
                if (count == mid1) {
                    ans1 = nums1[idx1];
                    if ((m + n) % 2 != 0) {
                        break;
                    }
                }
                if (count == mid2) {
                    ans2 = nums1[idx1];
                    break;
                }
                idx1++;
            }
            count++;
        }

        if (idx1 >= m) {
            if (ans2 == Integer.MAX_VALUE) {
                if (ans1 == Integer.MAX_VALUE) {
                    ans1 = nums2[mid1 - m];
                    if ((n + m) % 2 != 0) {
                        return ans1;
                    }
                    ans2 = nums2[mid1 - m + 1];
                } else {
                    ans2 = nums2[mid2 - m];
                }

            }
        }
        if (idx2 >= n) {

            if (ans2 == Integer.MAX_VALUE) {
                if (ans1 == Integer.MAX_VALUE) {
                    ans1 = nums1[mid1 - n];
                    if ((n + m) % 2 != 0) {
                        return ans1;
                    }
                    ans2 = nums1[mid1 - n + 1];
                } else {
                    ans2 = nums1[mid2 - n];
                }

            }
        }


        return (n + m) % 2 == 0 ? (ans1 + ans2) / 2.0 : ans1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]  {2};
        int[] nums2 = new int[]  {1, 3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}

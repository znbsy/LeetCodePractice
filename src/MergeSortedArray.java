public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] s = new int[m + n];
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                s[count++] = nums1[i];
                i++;
            } else {
                s[count++] = nums2[j];
                j++;
            }

        }
        if (i >= m) {
            for (int a = count; a < m + n; a++) {
                s[a] = nums2[j++];
            }
            if (m + n >= 0) System.arraycopy(s, 0, nums1, 0, m + n);
        } else if (j >= n) {
            for (int a = count; a < m + n; a++) {
                s[a] = nums1[i++];
            }
            if (m + n >= 0) System.arraycopy(s, 0, nums1, 0, m + n);
        }




    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
    }
}

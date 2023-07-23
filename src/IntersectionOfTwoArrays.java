import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            set2.add(n);
        }
        set1.retainAll(set2);
        int c = 0;
        int [] ans = new int[set1.size()];
        for (Integer s: set1) {
            ans[c] = s;
            c++;
        }
        return ans;
    }
}

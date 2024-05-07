import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        for (var n: nums1) {
            n1.add(n);
        }

        for (var n: nums2) {
            n2.add(n);
        }

        Set<Integer> temp = new HashSet<>(n1);
        n1.removeAll(n2);
        n2.removeAll(temp);

        List<Integer> ans1 = new ArrayList<>(n1);
        List<Integer> ans2 = new ArrayList<>(n2);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}

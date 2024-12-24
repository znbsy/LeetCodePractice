import java.util.*;
public class MakeArrayZerobySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (var a: nums) {
            set.add(a);
        }


        if (set.contains(0)) {
            return set.size() - 1;
        } else {
            return set.size();
        }
    }
}

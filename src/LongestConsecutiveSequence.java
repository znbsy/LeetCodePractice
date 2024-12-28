import javax.swing.text.html.parser.Entity;
import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int x = num + 1;
                while (set.contains(x)) {
                    x++;
                }
                max = Math.max(max, x - num);

            }
        }

        return max;

    }
}

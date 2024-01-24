import java.util.*;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        int count = 0;
        int ans = 0;

        Set<Integer> set = new HashSet<>();
        for (var i: nums) {
            set.add(i);
        }

        while (head != null) {
            if (set.contains(head.val)) {
                count++;

                if (count == 1) {
                    ans++;
                }

            } else {
                count = 0;
            }
            head = head.next;
        }

        return ans;
    }
}

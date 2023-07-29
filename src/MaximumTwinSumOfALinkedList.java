import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() / 2; i++) {
            max = Math.max(max, arr.get(i) + arr.get(arr.size() - i - 1));
        }
        return max;
    }
}

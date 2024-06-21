import java.util.*;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        List<Integer> copy = new ArrayList<>(list);

        int n = list.size();

        for (int i = 0; i < n; i++) {
            copy.set((i + k) % n, list.get(i));
        }
        curr = head;

        int i = 0;

        while (i < n) {
            curr.val = copy.get(i);
            curr = curr.next;
            i++;
        }
        return head;

    }
}

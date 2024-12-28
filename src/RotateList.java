import java.util.*;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;

        ListNode curr = head;
        int count = 0;

        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        count++;
        curr.next = head;


        int time = count - k % count;

        curr = head;

        while (time > 1) {
            curr = curr.next;
            time--;
        }

        ListNode prev = curr;
        curr = curr.next;
        prev.next = null;


        return curr;


    }
}

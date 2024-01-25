import java.util.List;

public class ReverseLinkedListII {
    int count;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        count = 1;
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            if (count == left) {
                if (prev != null) {
                    prev.next = this.subReverse(curr, right);
                } else {
                    head = this.subReverse(curr, right);
                }
                break;
            } else {
                prev = curr;
                curr = curr.next;

            }
            count++;
        }

        return head;
    }

    public ListNode subReverse(ListNode head, int right) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr.next != null && count != right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        next = curr.next;
        curr.next = prev;
        head.next = next;
        return curr;

    }
}

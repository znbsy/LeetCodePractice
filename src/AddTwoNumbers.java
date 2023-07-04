import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null) {
            return l2;
        }
        if (l2.val == 0 && l2.next == null) {
            return l1;
        }
        int a;
        int b;
        int digit = 0;
        int add = 0;
        ListNode pre1 = l1;
        ListNode ans = l1;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                digit = (l2.val + add) % 10;
                add = (l2.val + add) / 10;
                l1 = new ListNode(digit);
                pre1.next = l1;
                pre1 = l1;
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                digit = (l1.val + add) % 10;
                add = (l1.val + add) / 10;
                l1.val = digit;
                pre1 = l1;
                l1 = l1.next;
                continue;
            }
            a = l1.val;
            b = l2.val;
            digit = (a + b + add) % 10;
            add = (a + b + add) / 10;
            l1.val = digit;
            pre1 = l1;
            l1 = l1.next;
            l2 = l2.next;

        }
        if (add > 0) {
            l1 = new ListNode(add);
            pre1.next = l1;
        }
        return ans;
    }
}

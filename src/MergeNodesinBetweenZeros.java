import java.util.List;

public class MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode flag = new ListNode(0);
        ListNode ans = flag;
        while (curr != null) {
            if (curr.val != 0) {
                flag.val += curr.val;
            } else {
                if (curr.next != null) {
                    flag.next = new ListNode(0);
                    flag = flag.next;
                }
            }
            curr = curr.next;
        }
        System.gc();
        return ans;
    }
}

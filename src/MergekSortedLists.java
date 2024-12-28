import java.util.*;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (var l: lists) {
            while (l != null) {
                min = Math.min(min, l.val);
                max = Math.max(max, l.val);
                l = l.next;
            }
        }

        ListNode[] arr = new ListNode[max - min + 1];
        for (int i = lists.length - 1; i >= 0; i--){
            ListNode curr = lists[i];
            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = arr[curr.val - min];
                arr[curr.val - min] = curr;
                curr = temp;

            }

        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (var a: arr) {
            while (a != null) {
                curr.next = new ListNode(a.val);
                curr = curr.next;
                a = a.next;
            }
        }
        return dummy.next;
    }
}

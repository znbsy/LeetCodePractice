import java.util.*;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> temp = new ArrayList<>();

        for (var l: lists) {
            while (l != null) {
                temp.add(l.val);
                l = l.next;
            }
        }

        Collections.sort(temp);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (var a: temp){
            curr.next = new ListNode(a);
            curr = curr.next;
        }
        return dummy.next;
    }
}

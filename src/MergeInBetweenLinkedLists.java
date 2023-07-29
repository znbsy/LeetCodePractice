public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int idx = 0;
        ListNode copy = list1;
        while (idx != a - 1) {
            copy = copy.next;
            idx++;
        }
        ListNode temp = copy.next;
        copy.next = list2;
        idx++;
        while (idx != b) {
            temp = temp.next;
            idx++;
        }
        ListNode last = temp.next;
        temp.next = null;
        ListNode copy2 = list2;
        while (copy2.next != null) {
            copy2 = copy2.next;
        }
        copy2.next = last;
        System.gc();
        return list1;
    }
}

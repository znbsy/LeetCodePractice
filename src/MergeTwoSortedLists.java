public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            int value = list1.val;
            ListNode next = this.mergeTwoLists(list1.next, list2);
            return new ListNode(value, next);
        }
        else{
            int value = list2.val;
            ListNode next = this.mergeTwoLists(list1, list2.next);
            return new ListNode(value, next);
        }

    }
}

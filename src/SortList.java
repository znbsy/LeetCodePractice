public class SortList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode left = head;
            ListNode right = slow.next;

            slow.next = null;
            // while (head != null) {
            //     System.out.println(head.val);
            //     head = head.next;
            // }
            // System.out.println("hi");
            // while (right != null) {
            //     System.out.println(right.val);
            //     right = right.next;
            // }

            left = sortList(left);
            right = sortList(right);

            return mergeTwoLists(left, right);



        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null){
                return list2;
            }
            if(list2 == null){
                return list1;
            }
            if(list1.val <= list2.val){
                int value = list1.val;
                ListNode next = mergeTwoLists(list1.next, list2);
                return new ListNode(value, next);
            }
            else{
                int value = list2.val;
                ListNode next = mergeTwoLists(list1, list2.next);
                return new ListNode(value, next);
            }
        }
    }
}

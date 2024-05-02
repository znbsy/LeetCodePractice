import java.util.Arrays;

public class SplitLinkedListInParts {
    public static ListNode[] splitListToParts(ListNode head, int k) {

        int size = 0;
        ListNode copy = head;

        ListNode[] ans = new ListNode[k];

        while (copy != null) {
            size++;
            copy = copy.next;
        }

        int group = size / k;
        int remain = size % k;

        int r = 0;

        for (int i = 0; i < k; i++) {
            ans[i] = head;
            int g = 0;
            ListNode temp = null;

            while (g < group) {
                if (g == group - 1) {
                    temp = head;
                }
                head = head.next;
                g++;

            }

            if (r < remain) {
                temp = head;
                head = head.next;
                r++;
            }

            if (temp != null) {
                temp.next = null;
            }


        }
        return ans;


    }

    public static void main(String[] args) {
        ListNode c = new ListNode(3);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(1, b);

        System.out.println(Arrays.toString(splitListToParts(a, 5)));
    }
}

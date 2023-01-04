import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        List<Integer> arr = new ArrayList<>();
        while(current != null){
            arr.add(current.val);
            current = current.next;
        }
        int forward = 0;
        int backward = arr.size() - 1;
        while(forward <= backward){
            if(arr.get(forward) != arr.get(backward)){
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}

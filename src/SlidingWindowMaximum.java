import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            if (i + 1 - k >= 0) {
                ans[i - k + 1] = nums[deque.peekFirst()];
            }

        }
        return ans;


    }
    public static void main(String[] args) {
        SlidingWindowMaximum s = new SlidingWindowMaximum();

        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1}, 1)));
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{5,4,3,2,1}, 3)));
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1, 3, -1, 3, 1, 3, 0, 7}, 3)));
    }
}

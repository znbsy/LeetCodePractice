import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        this.queue.add(t);

        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();

        }

        return queue.size();
    }
}

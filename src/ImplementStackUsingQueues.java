import java.util.*;

public class ImplementStackUsingQueues {
    Queue<Integer> stack;
    public ImplementStackUsingQueues() {
        this.stack = new LinkedList<>();
    }

    public void push(int x) {

        this.stack.add(x);
        for (int i = 0; i < this.stack.size() - 1; i++) {
            this.stack.add(this.stack.poll());
        }
    }

    public int pop() {

        return this.stack.remove();
    }

    public int top() {


        return this.stack.element();
    }

    public boolean empty() {
        return this.stack.isEmpty();
    }
}

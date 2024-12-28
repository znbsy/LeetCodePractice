import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
    List<Integer> stack;
    public StockSpanner() {
        stack = new ArrayList<>();
    }

    public int next(int price) {
        int count = 1;

        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) <= price) {
                count++;
            } else {
                break;
            }
        }
        stack.add(price);
        return count;
    }
}

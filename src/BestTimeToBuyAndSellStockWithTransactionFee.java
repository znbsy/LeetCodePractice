import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int b = Integer.MIN_VALUE;
        int s = 0;
        for (var p: prices) {
            b = Math.max(b, s - p);
            s = Math.max(s, b + p - fee);
        }
        return s;
    }

}

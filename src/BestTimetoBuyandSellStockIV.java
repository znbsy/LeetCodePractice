import java.util.*;
public class BestTimetoBuyandSellStockIV {
    public int maxProfit(int k, int[] prices) {
        int[] sell = new int[k];
        int[] buy = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);

        for (var a: prices) {
            for (int i = k - 1; i >= 0; i--) {
                sell[i] = Math.max(sell[i], buy[i] + a);
                buy[i] = Math.max(buy[i], i == 0 ? -a: sell[i - 1] - a);
            }
        }

        return sell[k - 1];
    }
}


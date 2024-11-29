public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int[] sell = new int[] {0, 0};
        int[] buy = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (var a: prices) {
            sell[1] = Math.max(sell[1], buy[1] + a);
            buy[1] = Math.max(buy[1], sell[0] - a);
            sell[0] = Math.max(sell[0], buy[0] + a);
            buy[0] = Math.max(buy[0], -a);
        }
        return sell[1];
    }
}

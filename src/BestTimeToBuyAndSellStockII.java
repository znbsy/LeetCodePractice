public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, prices[i] + buy);
            // System.out.println("b: " + buy + " s: " + sell);

        }
        return sell;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }
}

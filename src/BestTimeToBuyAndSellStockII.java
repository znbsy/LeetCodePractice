public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int curr = -1;
        boolean buy = true;

        for (int i = 0; i < prices.length; i++) {
            if (buy) {
                if (i + 1 < prices.length && prices[i] < prices[i + 1]) {
                    curr = prices[i];
                    buy = false;
                }
            } else {
                if (prices[i] > curr && i + 1 < prices.length && prices[i + 1] < prices[i]) {
                    profit += prices[i] - curr;
                    buy = true;
                } else if (i == prices.length - 1) {
                    profit += prices[i] - curr;
                }
            }


        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }
}

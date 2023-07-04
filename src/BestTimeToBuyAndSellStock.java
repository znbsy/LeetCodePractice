public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit;
        int least = Integer.MAX_VALUE;

        for (int price : prices) {
            if (least > price) {
                least = price;
            }
            profit = price - least;
            max = Math.max(max, profit);
        }
        return max;
    }
}

import java.util.Arrays;

public class CoinChange {
    int[] mem;
    public int coinChange(int[] coins, int amount) {
        mem = new int[amount + 1];
        Arrays.fill(mem, Integer.MAX_VALUE);
        return helper(coins, amount);

    }

    public int helper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (mem[amount] != Integer.MAX_VALUE) return mem[amount];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                int temp = helper(coins, amount - coins[i]);
                if (temp != -1) {
                    min = Math.min(min, temp + 1);
                }

            }

        }
        mem[amount] = min == Integer.MAX_VALUE? -1 : min;

        return mem[amount];
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        System.out.println(cc.coinChange(new int[]{2}, 1));
    }
}

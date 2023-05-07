import java.util.Arrays;

public class StoneGame {
    public static boolean stoneGame(int[] piles) {
        if (piles.length == 2) {
            return true;
        }

        return compare(piles) > 0;

    }

    public static int compare(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];

        for (int i = 0; i < piles.length; i++) {
            for (int j = i; j < piles.length; j++) {
                if (i == j) {
                    dp[i][j] = piles[i];
                } else {
                    dp[i][j] = Math.max(piles[i] - dp[i + 1][j],
                            piles[j] - dp[i][j - 1]);
                }
            }
        }
        return dp[0][piles.length - 1];

    }

    public static void main(String[] args) {
        int[] piles1 = new int[] {5, 3, 4, 5};
        int[] piles2 = new int[] {5, 3, 4, 5};
        int[] piles3 = new int[] {5, 2};

        System.out.println(stoneGame(piles1));
        System.out.println(stoneGame(piles2));
        System.out.println(stoneGame(piles3));
    }
}

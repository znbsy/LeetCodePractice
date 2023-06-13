public class GetMaximumInGeneratedArray {
    public static int getMaximumGenerated(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int[] mark = new int[n + 1];
        mark[0] = 0;
        mark[1] = 1;
        int t = 2;
        int max = 0;
        while (t <= n) {
            if (mark[t] != 0) {
                t++;
                continue;
            }
            int i = 1;
            if (t % 2 == 0) {
                mark[t] = mark[t / 2];
            } else {
                mark[t] = mark[t / 2] + mark[t / 2 + 1];
            }
            max = Math.max(mark[t], max);
            while (i * t <= n) {
                mark[i * t] = mark[t];
                i *= 2;
            }
            t++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
    }
}

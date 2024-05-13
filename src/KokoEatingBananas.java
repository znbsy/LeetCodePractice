public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;

        for (var a: piles) {
            if (a > max) {
                max = a;
            }
        }

        int left = 1;
        int right = max;
        int mid = left + (right - left) / 2;


        while (left <= right) {
            int total = 0;
            for (var a: piles) {
                total += Math.ceil(1.0 * a / mid);
            }
            System.out.println(total);

            if (total > h) {
                // System.out.println("haha");
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = left + (right - left) / 2;
        }
        return mid;
    }
}

public class GuessNumberHigherOrLower {
    public int guess(int n) {
        return 1;
    }


    public int guessNumber(int n) {

        if (n == 1) {
            return 1;
        }

        int left = 1;
        int right = n;

        while (left <= right) {
            // 1 2

            int mid = left + (right - left) / 2;
            int g = guess(mid);

            if (g == 0) {
                return mid;
            } else if (g == 1){
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;

    }
}

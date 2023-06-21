import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        int ans = 0;
        int sum = 0;
        Arrays.sort(satisfaction);
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            if (sum + satisfaction[i] >= 0) {
                ans = ans + sum + satisfaction[i];
            } else {
                break;
            }
            sum += satisfaction[i];
        }

        return ans;
    }
}

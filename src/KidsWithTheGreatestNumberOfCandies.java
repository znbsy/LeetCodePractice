import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int count = 0;

        for (var c: candies) {
            count = Math.max(count, c);
        }

        for (var c: candies) {
            ans.add(c + extraCandies >= count);
        }

        return ans;

    }
}

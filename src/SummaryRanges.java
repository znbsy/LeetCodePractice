import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        String arrow = "->";
        List<String> ans = new ArrayList<>();

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        int start = nums[0];
        int end = start;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    ans.add("" + start);
                } else {
                    ans.add(start + arrow + end);
                }
                start = nums[i];
                end = start;
            }
        }

        if (start != end) {
            ans.add(start + arrow + end);
        } else {
            ans.add("" + start);
        }
        return ans;
    }
}

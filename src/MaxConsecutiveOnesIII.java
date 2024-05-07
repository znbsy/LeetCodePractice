import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {

        List<Integer> zero = new ArrayList<>();
        int count = 0;
        int max = 0;
        int begin = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zero.size() != k) {
                    zero.add(begin);
                    count++;
                } else {
                    max = Math.max(max, count);
                    if (k >= 1) {
                        zero.add(begin);
                        count -= zero.get(0) + 1;
                        zero.remove(0);
                        count++;
                    }  else  {
                        count = 0;
                    }

                }
                begin = 0;

            } else {
                count++;
                begin++;
            }
        }
        return Math.max(max, count);


    }
}

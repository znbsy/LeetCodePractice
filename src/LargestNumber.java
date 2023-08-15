import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String[] sl = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sl[i] = "" + nums[i];
        }
        Arrays.sort(sl, (a, b) -> (a + b).compareTo(b + a));


        String sb = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            sb += sl[i];
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[] {2, 10}));
    }
}

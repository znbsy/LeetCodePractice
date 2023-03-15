import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int [] result = Arrays.stream(nums)
                .filter(x -> x != 0)
                .toArray();
        for (int i = 0; i < result.length; i++){
            nums[i] = result[i];
        }
        for (int i = result.length; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

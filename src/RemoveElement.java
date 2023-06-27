import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        final int[] index = new int[]{0};
        return (int) Arrays.stream(nums)
                .filter(x -> x != val)
                .map(x -> nums[index[0]++] = x)
                .count();



    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 2, 3};

        System.out.println(removeElement(nums, 3));
    }
}

import java.util.List;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;

        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[2] != 0) {
                arr[0] = arr[1];
                arr[1] = arr[2];
            }
            arr[2] = arr[1] + arr[0];
        }
        return arr[2];

    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(10));
    }
}

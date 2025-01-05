import java.util.*;
public class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int copy = n;
        List<Integer> list = new ArrayList<>();

        while (copy != 0) {
            int mod = copy % 10;
            list.add(mod);
            copy /= 10;
        }

        int exp = list.size();

        for (var a: list) {
            sum += (int) Math.pow(a, exp);
        }

        return sum == n;
    }
}

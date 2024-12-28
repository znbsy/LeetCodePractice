import java.util.*;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                ans.add(i);
            }
        }

        return ans;
    }



    public boolean isSelfDividing(int num) {
        if (num / 10 == 0) {
            return true;
        }

        int temp = num;
        while (temp > 0) {
            int curr = temp % 10;
            if (curr == 0 || num % curr != 0) {
                return false;
            }
            temp /= 10;
        }

        return true;
    }
}

import java.util.*;
public class ConfusingNumber {
    public boolean confusingNumber(int n) {
        Map<Integer, Integer> confused = Map.of(0,0,1,1,6,9,8,8,9,6);
        int copy = n;
        int f = 0;

        while (copy != 0) {
            int mod = copy % 10;
            if (!confused.containsKey(mod)) {
                return false;
            } else {
                f *= 10;
                f += confused.get(mod);
                copy /= 10;
            }
        }

        return f != n;


    }
}

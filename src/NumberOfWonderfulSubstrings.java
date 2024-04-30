import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfWonderfulSubstrings {
    public long wonderfulSubstrings(String word) {
        int[] count = new int[1024];
        long result = 0L;
        int mask = 0;

        count[0] = 1;

        char[] words = word.toCharArray();

        for (var w: words) {
            mask ^= 1 << (w - 'a');
            result  += count[mask];

            for (int i = 0; i < 10; i++) {
                result += count[mask ^ (1 << i)];
            }
            count[mask]++;

        }
        return result;
    }


}

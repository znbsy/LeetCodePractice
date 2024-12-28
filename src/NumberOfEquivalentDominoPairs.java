import java.util.*;

public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {

        int sum = 0;

        Map<String, Integer> map = new HashMap<>();

        for (var d: dominoes) {
            int a = d[0];
            int b = d[1];

            if (a <= b) {
                String key = a + "," + b;

                map.put(key, map.getOrDefault(key, 0) + 1);


            } else {
                String key = b + "," + a;

                map.put(key, map.getOrDefault(key, 0) + 1);

            }
        }


        for (var v: map.values()) {

            for (int i = 1; i < v; i++) {
                sum += i;
            }

        }

        return sum;




    }
}

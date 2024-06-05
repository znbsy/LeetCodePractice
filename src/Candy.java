import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int[] record = new int[ratings.length];
        int sum = 0;
        Arrays.fill(record, 1);


        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                record[i] = record[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                record[i] = Math.max(record[i + 1] + 1, record[i]);
            }
        }

        for (var a: record) {
            sum += a;
        }

        return sum;



    }
}

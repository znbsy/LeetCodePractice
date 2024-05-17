public class MinimumFlipsToMakeAORBEqualToC {
    public int minFlips(int a, int b, int c) {
        int count = 0;


        while (a > 0 || b > 0 || c > 0) {
            int da = a & 1;
            int db = b & 1;
            int dc = c & 1;

            if ((da | db) != dc) {
                if (da == db && da == 1) {
                    count += 2;
                } else {
                    count++;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }

        return count;
    }

}

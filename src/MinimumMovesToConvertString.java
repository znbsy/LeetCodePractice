public class MinimumMovesToConvertString {
    public int minimumMoves(String s) {
        char[] c =s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'X') {
                c[i] = 'O';
                if (i + 1 < c.length) {
                    c[i + 1] = 'O';
                }
                if (i + 2 < c.length) {
                    c[i + 2] = 'O';
                }
                count++;
            }
        }
        return count;
    }
}

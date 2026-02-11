public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int zero = 0;
        int one = 0;
        int count = 0;
        boolean flag = false;
        char prev = s.charAt(0);
        if (prev == '0') {
            zero = 1;
        } else {
            one = 1;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (prev == '1') {
                    count += Math.min(zero, one);
                    zero = 0;
                }
                zero++;

            } else {
                if (prev == '0') {
                    count += Math.min(zero, one);
                    one = 0;
                }
                one++;

            }
            prev = s.charAt(i);
        }
        return count + Math.min(zero, one);
    }
}

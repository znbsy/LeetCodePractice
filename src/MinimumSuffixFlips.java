public class MinimumSuffixFlips {
    public int minFlips(String target) {
        if (target.length() == 1) {
            return target.charAt(0) == '0' ? 0 : 1;
        }

        int count = 0;
        for (int i = 1; i < target.length(); i++) {
            char curr = target.charAt(i);
            char prev = target.charAt(i - 1);
            if (curr == '0' && prev == '1') {
                count++;
            }
        }
        if (target.charAt(target.length() - 1) == '1') {
            count++;
            return Math.max(count * 2 - 1, 0);
        } else {
            return Math.max(count * 2, 0);
        }
    }
    public static void main(String[] args) {
        MinimumSuffixFlips mf = new MinimumSuffixFlips();
        System.out.println(mf.minFlips("100001"));
    }
}

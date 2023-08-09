public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public static int minTimeToType(String word) {
        char curr = 'a';
        int len = word.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            char point = word.charAt(i);
            if (point == curr) {
                count++;
            } else {
                int diff = Math.abs(point - curr);

                if (diff > 13) {
                    count += 26 - diff;
                } else {
                    count += diff;
                }
                curr = point;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "bza";
        System.out.println(minTimeToType(word));
    }
}

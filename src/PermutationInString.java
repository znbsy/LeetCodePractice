import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        var s3 = s1.toCharArray();
        Arrays.sort(s3);

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            var chr = s2.charAt(i);
            if (s1.indexOf(chr) < 0) {
                continue;
            }
            String str = s2.substring(i, i + s1.length());
            var s4 = str.toCharArray();
            Arrays.sort(s4);

            if (Arrays.equals(s3, s4)) {
                return true;
            }
        }

        return false;

    }
}

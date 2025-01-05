public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {

        String s1;
        String s2;

        if (Math.abs(s.length() - t.length()) > 1) return false;

        if (s.length() >= t.length()) {
            s1 = s;
            s2 = t;
        } else {
            s1 = t;
            s2 = s;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(i)) {
                if (s1.length() == s2.length()) {
                    return s1.substring(i + 1).equals(s2.substring(i + 1));
                } else {
                    return s2.substring(i).equals(s1.substring(i + 1));
                }
            }
        }


        return s1.length() - 1 == s2.length();


    }
}

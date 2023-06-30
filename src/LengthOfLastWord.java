public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        while (s.endsWith(" ")) {
            s = s.substring(0, s.length() - 1);
        }
        int idx = s.lastIndexOf(" ");
        if (idx == -1) {
            return s.length();
        } else {
            return s.substring(idx + 1).length();
        }
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}

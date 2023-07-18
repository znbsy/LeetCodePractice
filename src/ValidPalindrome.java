public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
//        int idx = s.indexOf(" ");
//        while (idx >= 0) {
//            s = s.substring(0, idx) + s.substring(idx + 1);
//            idx = s.indexOf(" ");
//        }
        s = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            if (curr < 48 || (curr >= 58 && curr <= 64)
                    || (curr >= 91 && curr <= 96) || curr >= 123){
                s = s.substring(0, i) + s.substring(i + 1);
            }
        }



        while (!s.isEmpty()) {
            char one = s.charAt(0);
            char two = s.charAt(s.length() - 1);

            if (one != two) {
                return false;
            }
            if(s.length() == 1) {
                return true;
            }
            s = s.substring(1, s.length() - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}

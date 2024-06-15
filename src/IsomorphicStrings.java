import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] sc = new int[200];
        int[] tc = new int[200];


        for (int i = 0; i < s.length(); i++) {
            int si = s.charAt(i);
            int ti = t.charAt(i);

            if (sc[si] != tc[ti]) {
                return false;
            } else {
                sc[si] = i + 1;
                tc[ti] = i + 1;
            }



        }

        return true;
    }
}

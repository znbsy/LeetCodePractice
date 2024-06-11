import java.util.*;
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < words.length) {
            if (sb.length() + words[i].length() <= maxWidth) {
                sb.append(words[i]);
                i++;

                if (sb.length() < maxWidth) {
                    sb.append(" ");
                }
                // System.out.println(sb.toString() + "|||" + sb.length());

            } else {
                result.add(helper(sb, maxWidth, false));
                sb = new StringBuilder();
            }


        }
        result.add(helper(sb, maxWidth, true));

        return result;
    }

    public String helper(StringBuilder sb, int maxWidth, boolean flag) {
        // System.out.println("helperrrrrrrrr");
        if (flag) {
            // System.out.println(sb.toString() + "|||" + sb.length() + " diff: " + (maxWidth - sb.length()));
            int diff = maxWidth - sb.length();
            for (int j = 1; j <= diff; j++) {
                // System.out.println(j);
                sb.append(" ");
            }
            // System.out.println("after: " + sb.toString() + "||| " + sb.length());
            // System.out.println();
            return sb.toString();
        }


        if (sb.lastIndexOf(" ") == sb.length() - 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        // System.out.println(sb.toString() + "|||" + sb.length());
        int diff = maxWidth - sb.length();
        if (diff == 0) {
            //System.out.println();
            return sb.toString();
        }


        List<Integer> pos = new ArrayList<>();
        int idx = -1;

        do {
            idx = sb.indexOf(" ", idx + 1);
            if (idx != -1) {
                pos.add(idx);
            }
        } while (idx != -1);

        if (pos.size() == 0) {
            for (int j = 1; j <= diff; j++) {
                sb.append(" ");
            }
            // System.out.println("after: " + sb.toString() + "||| " + sb.length());
            // System.out.println();
            return sb.toString();
        }

        int quotient = diff / pos.size();
        int mod = diff % pos.size();

        // System.out.println(pos);

        for (int i = pos.size() - 1; i >= 0; i--) {
            for (int j = 1; j <= quotient; j++) {
                sb.insert((int)pos.get(i), ' ');
            }

            if (i < mod) {
                sb.insert((int)pos.get(i), ' ');
            }
        }

        // System.out.println("after: " + sb.toString() + "||| " + sb.length());

        // System.out.println();
        return sb.toString();


    }


}

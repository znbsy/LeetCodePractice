import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        int r = 0;
        int d = 0;

        int ban_d = 0;
        int ban_r = 0;

        for (var c: senate.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                d++;
            }
            queue.add(c);
        }

        while (true) {
            if (r == 0) {
                return "Dire";
            }
            if (d == 0) {
                return "Radiant";
            }
            char curr = queue.remove();
            if (curr == 'R' && ban_r == 0) {
                ban_d++;
                queue.add(curr);
            } else if (curr == 'R' && ban_r > 0) {
                r--;
                ban_r--;
            } else if (curr == 'D' && ban_d == 0) {
                ban_r++;
                queue.add(curr);
            } else if (curr == 'D' && ban_d > 0) {
                d--;
                ban_d--;
            }

        }


    }
}

import java.util.PriorityQueue;

public class ConstructStringWithRepeatLimit {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int[26];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int next;

        for (int i = 25; i >= 0; i--) {
            next = i - 1;

            while (arr[i] > 0) {
                sb.append(String.valueOf((char) ('a' + i)).repeat(Math.max(0, Math.min(repeatLimit, arr[i]))));
                arr[i] -= Math.min(repeatLimit, arr[i]);
                if (arr[i] != 0) {
                    boolean flag = helper(sb, arr, next);
                    if (!flag) {
                        return sb.toString();
                    }
                }

            }




        }
        return sb.toString();

    }
    public boolean helper(StringBuilder sb, int[] arr, int next) {
        while (next >= 0 && arr[next] == 0) {
            next--;
        }
        if (next < 0) {
            return false;
        }
        sb.append((char) ('a' + next));
        arr[next]--;
        return true;
    }
    public static void main(String[] args) {
        ConstructStringWithRepeatLimit cs = new ConstructStringWithRepeatLimit();
        System.out.println(cs.repeatLimitedString("bbabaaa", 2));
    }
}

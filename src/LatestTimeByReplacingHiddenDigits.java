public class LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {

        char[] c = time.toCharArray();

        if (c[0] == '?') {
            if (c[1] == '?') {
                c[0] = '2';
                c[1] = '3';
            } else if (c[1] < '4') {
                c[0] = '2';
            } else {
                c[0] = '1';
            }
        }
        if (c[1] == '?') {
            if (c[0] == '2') {
                c[1] = '3';
            } else {
                c[1] = '9';
            }
        }
        if (c[3] == '?') {
            c[3] = '5';
        }
        if (c[4] == '?') {
            c[4] = '9';
        }
        return new String(c);
    }
}

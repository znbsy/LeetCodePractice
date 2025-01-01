public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int way = 0;
        for (var a: shift) {
            if (a[0] == 1) {
                way += a[1];
            } else {
                way -= a[1];
            }
        }
        if (way == 0) {
            return s;
        } else if (way > 0) {
            way %= s.length();
            return s.substring(s.length() - way) + s.substring(0, s.length() - way);
        } else {
            way = -way;
            way %= s.length();
            return s.substring(way) + s.substring(0, way);
        }
    }
}

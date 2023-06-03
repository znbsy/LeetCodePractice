public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        int result = 2;

        if (points.length <= 2) {
            return points.length;
        }

        for (int i = 0; i < points.length; i++) {
            for (int h = i + 1; h < points.length; h++) {
                int count = 2;
                int k;
                int b;
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[h][0];
                int y2 = points[h][1];
                if (x2 - x1 != 0) {
                    k = y2 -y1;
                    b = x2 * y1 - x1 * y2;
                    for (int j = h + 1; j < points.length; j++) {
                        int x3 = points[j][0];
                        int y3 = points[j][1];
                        if (x3 * k + b == y3 * (x2 - x1)) {
                            count++;
                        }
                    }

                } else {
                    for (int j = h + 1; j < points.length; j++) {
                        int x3 = points[j][0];
                        if (x3 == x1) {
                            count++;
                        }
                    }
                }

                result = Math.max(result, count);
            }
        }
        return result;
    }
}

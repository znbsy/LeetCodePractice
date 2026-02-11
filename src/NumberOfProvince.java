import java.util.*;

public class NumberOfProvince {
    public int findCircleNum(int[][] isConnected) {
        Queue<Integer> q = new LinkedList<>();
        int counter = 0;
        int len = isConnected.length;
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < len; i++) {
            if (!s.contains(i)) {
                s.add(i);
                q.add(i);

                while (!q.isEmpty()) {
                    int cur = q.poll();
                    for (int j = 0; j < len; j++) {
                        int city = isConnected[cur][j];
                        if (city == 1 && !s.contains(j)) {
                            s.add(j);
                            q.add(j);
                        }
                    }
                }
                counter++;
            } else {
                continue;
            }

        }
        return counter;

    }

    public static void main(String[] args) {
//        [[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]
        int[][] isConnected = {{1,0,0,1}, {0,1,1,0}, {0,1,1,1}, {1,0,1,1}};
        System.out.println(new NumberOfProvince().findCircleNum(isConnected));
    }
}

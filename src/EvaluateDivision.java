import java.util.*;
public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        double[] ans = new double[queries.size()];
        Arrays.fill(ans, -1);

        for (int i = 0; i < equations.size(); i++) {
            String fir = equations.get(i).get(0);
            String sec = equations.get(i).get(1);

            map.computeIfAbsent(fir, k -> new HashMap<>()).put(sec, values[i]);
            map.computeIfAbsent(sec, k -> new HashMap<>()).put(fir, 1.0 / values[i]);
        }


        for (int i = 0; i < queries.size(); i++) {
            String f = queries.get(i).get(0);
            String s = queries.get(i).get(1);

            if (map.containsKey(f) && map.containsKey(s)) {
                if (f.equals(s)) {
                    ans[i] = 1.0;
                } else {

                    dfs(map, new HashSet<>(), 1, f, s, ans, i);

                }

            }
        }

        return ans;


    }

    public void dfs (Map<String, Map<String, Double>> map, Set<String> visited,
                       double product, String fir, String sec,
                       double[] ans, int i) {

        if (fir.equals(sec)) {
            ans[i] = product;
            return;
        }

        if (visited.contains(fir)) {
            return;
        }

        visited.add(fir);

        for (var a: map.get(fir).entrySet()) {
            dfs(map, visited, product * a.getValue(), a.getKey(), sec, ans, i);
        }


    }

}

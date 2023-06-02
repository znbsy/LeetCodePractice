import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    Map<Integer, CheckIn> passager;
    Map<String, Info> timeline;


    public UndergroundSystem() {
        this.passager = new HashMap<>();
        this.timeline = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        if (!this.passager.containsKey(id)) {
            CheckIn station = new CheckIn(t, stationName);
            passager.put(id, station);
        }


    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn check = passager.remove(id);

        String route = check.start + "-" + stationName;
        int last = t - check.time;
        Info info;
        if (timeline.containsKey(route)) {
            info = timeline.get(route);
            info.count = info.count + 1;
            info.time = info.time + last;
        } else {
            info = new Info(1, last);
            timeline.put(route, info);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        Info info = timeline.get(startStation + "-" + endStation);
        return info.time / (double) info.count;

    }

    public static class Info {
        private int count;
        private int time;

        public Info(int num, int t) {
            count = num;
            time = t;
        }
    }

    public static class CheckIn {
        private int time;
        private String start;

        public CheckIn(int t, String str) {
            time = t;
            start = str;

        }
    }

}


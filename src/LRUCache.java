import java.util.*;


public class LRUCache {

    List<Integer> keys;
    Map<Integer, Integer> map;
    int capacity;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.keys = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            keys.remove(Integer.valueOf(key));
            keys.add(key);
            return map.get(key);
        }

    }

    public void put(int key, int value) {
        if (map.size() < capacity) {
            if (map.containsKey(key)) {
                map.put(key, value);
                keys.remove(Integer.valueOf(key));
                keys.add(key);
            } else {
                map.put(key, value);
                keys.add(key);
            }

        } else {
            if (map.containsKey(key)) {
                map.put(key, value);
                keys.remove(Integer.valueOf(key));
                keys.add(key);
            } else {
                int k = keys.get(0);
                map.remove(k);
                keys.remove(0);
                map.put(key, value);
                keys.add(key);
            }

        }
    }



}

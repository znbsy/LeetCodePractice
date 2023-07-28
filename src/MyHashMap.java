import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashMap {
    List<Integer> key;
    List<Integer> value;

    public MyHashMap() {
        key = new ArrayList<>();
        value = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (int i = 0; i < this.key.size(); i++) {
            if (this.key.get(i) == key) {
                this.value.remove(i);
                this.value.add(i, value);
                return;
            }
        }
        this.key.add(key);
        this.value.add(value);
    }

    public int get(int key) {
        for (int i = 0; i < this.key.size(); i++) {
            if (this.key.get(i) == key) {
                return this.value.get(i);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < this.key.size(); i++) {
            if (this.key.get(i) == key) {
                this.key.remove(i);
                this.value.remove(i);
            }
        }
    }
}

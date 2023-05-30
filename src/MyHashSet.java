import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashSet {
    List<Integer> set;
    public MyHashSet() {
        this.set = new ArrayList<>();
    }

    public void add(int key) {
        if (this.contains(key)) {
            return;
        }
        this.set.add(key);
    }

    public void remove(int key) {
        this.set.remove((Integer) key);
    }

    public boolean contains(int key) {
        return this.set.contains(key);
    }
}

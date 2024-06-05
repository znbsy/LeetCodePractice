import java.util.*;
import java.util.random.RandomGenerator;

class RandomizedSet {

    Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet();
    }

    public boolean insert(int val) {
        return this.set.add(val);
    }

    public boolean remove(int val) {
        return this.set.remove(val);
    }

    public int getRandom() {
        int rand = (int) (Math.random() * this.set.size());
        return (int)this.set.toArray()[rand];
    }
}
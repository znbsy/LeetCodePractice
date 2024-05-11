import java.util.HashSet;
import java.util.Set;

class SmallestInfiniteSet {

    Set<Integer> missing;
    int smallest;

    public SmallestInfiniteSet() {
        this.missing = new HashSet<>();
        this.smallest = 1;
    }

    public int popSmallest() {
        while (this.missing.contains(this.smallest)) {
            this.smallest++;
        }
        this.missing.add(this.smallest);

        return smallest;
    }

    public void addBack(int num) {
        if (num < this.smallest) {
            this.smallest = num;
        }

        this.missing.remove(num);
    }
}
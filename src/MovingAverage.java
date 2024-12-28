import java.util.*;

class MovingAverage {
    List<Integer> list = new ArrayList<>();
    int size;
    double sum = 0;

    public MovingAverage(int size) {
        //arr = new int[size];
        this.size = size;
    }

    public double next(int val) {
        if (list.size() < size) {
            sum += val;
            list.add(val);
            return sum / list.size();
        } else {
            sum -= list.remove(0);
            sum += val;
            list.add(val);
            return sum / size;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */